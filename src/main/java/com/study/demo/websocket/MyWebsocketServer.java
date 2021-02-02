package com.study.demo.websocket;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 群发最终版
 * @param
 * @return
 * @date 2020/3/13
 * @ahthor lzp
 */
@ServerEndpoint("/testroom")
@Component
@Slf4j
public class MyWebsocketServer {
    /**
     * 用于存放所有在线客户端
     */
    private static Map<String, Session> clients = new ConcurrentHashMap<>();

    private Gson gson = new Gson();

    @OnOpen
    public void onOpen(Session session) {
        Map<String, List<String>>  requestParameterMap = session.getRequestParameterMap();
        List<String> list = requestParameterMap.get("username");
        String username = list.get(0); // 当前用户名*/

        //log.info("有新的客户端上线: {}", session.getId());
        clients.put(session.getId(), session);
        sendAll(username+"上线了");

    }

    @OnClose
    public void onClose(Session session) {
        String sessionId = session.getId();
        //log.info("有客户端离线: {}", sessionId);
        clients.remove(sessionId);
        Map<String, List<String>>  requestParameterMap = session.getRequestParameterMap();
        List<String> list = requestParameterMap.get("username");
        String username = list.get(0); // 当前用户名*/
        sendAll(username+":下线了");
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        String sessionId = session.getId();
        if (clients.get(sessionId) != null) {
            //log.info("发生了错误,移除客户端: {}", sessionId);
            clients.remove(sessionId);
        }
        throwable.printStackTrace();
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        //log.info("收到客户端发来的消息: {}", message);
        Map<String, List<String>>  requestParameterMap = session.getRequestParameterMap();
        List<String> list = requestParameterMap.get("username");
        String username = list.get(0); // 当前用户名*/
        sendAll(username+":"+message);
    }

    /**
     * 发送消息
     *
     * @param message 消息对象
     */
    private void sendTo(String message, Session session) {
        Session s = clients.get(session.getId());
        if (s != null) {
            try {
                s.getBasicRemote().sendText("服务端单对单消息"+message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 群发消息
     * @param message 消息内容
     */
    private void sendAll(String message) {
        for (Map.Entry<String, Session> sessionEntry : clients.entrySet()) {
            sessionEntry.getValue().getAsyncRemote().sendText(message);
        }
    }
}

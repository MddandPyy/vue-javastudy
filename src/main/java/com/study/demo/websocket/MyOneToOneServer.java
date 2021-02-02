package com.study.demo.websocket;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 单对单
 * @param
 * @return
 * @date 2020/3/13
 * @ahthor lzp
 */
@ServerEndpoint("/test-one")
@Component
@Slf4j
public class MyOneToOneServer {
    /**
     * 用于存放所有在线客户端
     */
    private static Map<String, Session> clients = new ConcurrentHashMap<>();

    private Gson gson = new Gson();

    @OnOpen
    public void onOpen(Session session) {
        //log.info("有新的客户端上线: {}", session.getId());
        clients.put(session.getId(), session);
    }

    @OnClose
    public void onClose(Session session) {
        String sessionId = session.getId();
        //log.info("有客户端离线: {}", sessionId);
        clients.remove(sessionId);
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
        this.sendTo(message,session);
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
}

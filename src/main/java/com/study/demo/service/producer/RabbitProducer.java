package com.study.demo.service.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

/**
 * rabbitmq 消息生产者
 *
 * @author huan.fu
 * @date 2018/10/22 - 14:28
 */
@Component
public class RabbitProducer {

	@Autowired
	private AmqpTemplate amqpTemplate;

	/**
	 * 发送消息
	 */
	@SendTo
	public void sendMessage(String messageinfo,String exchangeName,String rountingKey) {
		new Thread(() -> {
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			MessageProperties properties = new MessageProperties();
			properties.setContentEncoding("UTF-8");
			properties.setDeliveryMode(MessageDeliveryMode.NON_PERSISTENT);
			Message message = new Message(messageinfo.getBytes(Charset.forName(properties.getContentEncoding())), properties);
			amqpTemplate.convertAndSend(exchangeName, rountingKey, message);
			//Object ob = amqpTemplate.sendAndReceive(CommonConsant.EXCHANGE_NAME_TOPIC, "goods.ad", message);
			//System.out.println(ob.toString());

		}).start();
	}
}

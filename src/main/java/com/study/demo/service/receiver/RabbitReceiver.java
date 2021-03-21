package com.study.demo.service.receiver;

import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * rabbitmq 消息接收者
 *
 * @author huan.fu
 * @date 2018/10/22 - 14:36
 */
@Component
@Slf4j

public class RabbitReceiver {


	@RabbitListener(queues ="topic.queue1")
	public void receiveMessage(Message message, Channel channel) {
		String encoding = message.getMessageProperties().getContentEncoding();
		log.info("接收到消息topic.queue1:[{}]", new String(message.getBody()));
		try {
			channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
		} catch (IOException e) {
			log.error(e.getMessage(), e);
		}
		//return "消费者1返回消息";
	}
//
	@RabbitListener(queues ="topic.queue2")
	public void receiveMessage1(Message message, Channel channel) {
		String encoding = message.getMessageProperties().getContentEncoding();
		log.info("接收到消息topic.queue2:[{}]", new String(message.getBody()));
		try {
			channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
		} catch (IOException e) {
			log.error(e.getMessage(), e);
		}
		//return "消费者2返回消息";
	}

}

package com.study.demo.config;

import com.study.demo.utils.CommonConsant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * rabbitmq 配置类
 * @param
 * @return
 * @date 2019/12/25
 * @ahthor lzp
 */
@Configuration
@Slf4j
public class RabbitConfiguration {

	//  a  创建queue
	@Bean(name = "queue1") //  指定该参数名是message  见下面Qualifier（"message"）
	public Queue queueMessage(){
		return new Queue("topic.queue1");  //  topic.message  是rounting-key,匹配规则
	}

	@Bean(name = "queue2")
	public Queue queueMessages(){
		return new Queue("topic.queue2");
	}


	@Bean
	public TopicExchange exchange(){
		return new TopicExchange(CommonConsant.EXCHANGE_NAME_TOPIC);
	}

//	/*
//      c. 根据绑定规则将队列绑定到相应的交换机上（bindingKey）--Exchange Queues
//
//     */
	@Bean
	public Binding bindingExchangeMessage(@Qualifier("queue1") Queue queueMessage, TopicExchange exchange){
		return BindingBuilder.bind(queueMessage).to(exchange).with("message.push");
	}
//
	@Bean
	/**
	 * 将队列"messages" 绑定到交换机上，绑定规则是 topic.messages
	 *
	 */
	public  Binding bindingExchangeUserNodejsTopic(@Qualifier("queue2")Queue queueMessages,TopicExchange exchange){
		return BindingBuilder.bind(queueMessages).to(exchange).with("message.*");
	}


}

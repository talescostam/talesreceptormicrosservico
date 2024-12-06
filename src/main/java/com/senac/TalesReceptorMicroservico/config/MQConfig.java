package com.senac.TalesReceptorMicroservico.config;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
@Component
public class MQConfig {
	@Autowired
	private AmqpAdmin amqpAdmin;
	private Queue queue;
	private Queue queue (String queueName){
		return new Queue(queueName, true, false, false);
	}
	private DirectExchange createDirectExchange(){
		return new DirectExchange("zap");
	}

	@Bean
	public MessageConverter jackson2JsonMessageConverter() {
		return new Jackson2JsonMessageConverter();
	}

	@PostConstruct
	private void Create (){
		this.queue = new Queue("zap");
// Create the direct exchange
		DirectExchange directExchange = createDirectExchange();
// Create the binding
		Binding binding = new Binding(queue.getName(), Binding.DestinationType.QUEUE,
				directExchange.getName(), queue.getName(), null);
		amqpAdmin.declareQueue(queue);
		amqpAdmin.declareExchange(directExchange);
		amqpAdmin.declareBinding(binding);
	}
}

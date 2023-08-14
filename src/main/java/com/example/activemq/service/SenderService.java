package com.example.activemq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class SenderService {

	@Autowired
	JmsTemplate jmsTemplate;
	
	public void sendMessage(String message) {
		
		jmsTemplate.convertAndSend("myqueue", message);
		System.out.println("Message sent successfully");
	}
}

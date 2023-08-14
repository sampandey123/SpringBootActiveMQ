package com.example.activemq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.activemq.service.SenderService;

@RestController
public class SenderController {
	
	@Autowired
	SenderService senderService;
	
	@RequestMapping(value="/queue/sendMessage", method = RequestMethod.GET)
	public void sendMessage(@RequestParam("message") String message) {
		System.out.println("Message: "+message);
		senderService.sendMessage(message);
	}

}

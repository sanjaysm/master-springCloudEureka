package com.sanjay.feignClient.notificationService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationControllar {
	private static Logger log = LoggerFactory.getLogger(NotificationControllar.class);
	@RequestMapping(path="/send-email", method = RequestMethod.POST)
	public void sendMailNotification() {
		log.info("NotificationControllar");
		System.out.println("email send");
		
	}

}

/**
 * 
 */
package com.sanjay.springBoot.App.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.http.protocol.RequestContent;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.client.http.HttpRequest;
import com.sanjay.springBoot.App.feignClient.SendEmailNotification;

/**
 * @author sanjay
 *
 */
@RestController
@RequestMapping("/user-service")
public class SpringController {
	private static Logger log = LoggerFactory.getLogger(SpringController.class);
	@Autowired
	RestTemplate restTemplate;
	String BASE_URL = "https://gorest.co.in/public-api/users";

	@Autowired
	SendEmailNotification sendEmailNotification;

	@GetMapping("/test-api")
	public String home() {
		return "wecome to Spring Boot home page!";
	}

	@GetMapping("/user-data/{id}")
	public String getUserData(@PathVariable String id) {
		Object obj = restTemplate.getForObject(BASE_URL + "/" + id, Object.class);
		System.out.println("RESPONSE : " + obj);
		return "wecome to Spring Boot home page!";
	}

	/*
	 * @GetMapping("/user-data/{id}") public String createUserData(@PathVariable
	 * String id) { Object obj = restTemplate.getForObject(BASE_URL+"/"+id,
	 * Object.class); System.out.println("RESPONSE : "+obj); return
	 * "wecome to Spring Boot home page!"; }
	 */
	@GetMapping("/set-userData")
	public String setUserData() {
		log.info("AppController");
		this.sendEmailNotification.sendMailNotification();
		return "user data set";
	}

}

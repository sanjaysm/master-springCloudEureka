package com.sanjay.springBoot.App.feignClient;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name="notificationService", url="localhost:8090")
/*feignClient does the job similiar to restTemplate*/
//@FeignClient(name="notificationService")
/* ribbon does the load balancing */
//@RibbonClient(name="notificationService")

/* using api gate way */
@FeignClient(name="springboot-api-gateway")
/* ribbon does the load balancing */
@RibbonClient(name="springboot-api-gateway")
public interface SendEmailNotification{
	//must have to register the service path name(/notification-service) to zuul proxy api properties
	@RequestMapping(path="/notification-service/send-email", method = RequestMethod.POST)
	public void sendMailNotification();
		

}

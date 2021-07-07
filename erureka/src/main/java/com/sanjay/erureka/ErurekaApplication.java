package com.sanjay.erureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableEurekaServer
public class ErurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErurekaApplication.class, args);
	}

	// for logging uid by sleuth
	@Bean
	public Sampler getSampler() {
		return Sampler.NEVER_SAMPLE;
	}
}

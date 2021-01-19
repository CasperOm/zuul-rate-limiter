package com.demo.zuulserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
@EnableAutoConfiguration
public class ZuulServerApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(ZuulServerApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
		logger.info("Zuul Server Started Successfully !!!");
	}

}
package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.response.DemoResponse;
import com.demo.service.DemoResponseService;

@Configuration
public class DemoReponseConfig {

	@Bean
	public DemoResponseService responseService() {
		return new DemoResponseService("Welcome Raju");
	}
	
	@Bean
	public DemoResponse response() {
		DemoResponse response = new DemoResponse(200, "Hello Raju");
		return response;
	}
}

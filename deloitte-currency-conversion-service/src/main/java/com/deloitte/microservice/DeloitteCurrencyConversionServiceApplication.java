package com.deloitte.microservice;

import javax.validation.constraints.Digits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.deloitte.microservice.controller")
public class DeloitteCurrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeloitteCurrencyConversionServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplateBean() {
		return new RestTemplate();
	}

}

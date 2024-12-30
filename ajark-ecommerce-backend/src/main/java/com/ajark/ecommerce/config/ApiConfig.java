package com.ajark.ecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.client.RestTemplate;

@Configuration
public class ApiConfig {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	/*
	 * @Bean public PasswordEncoder passwordEncoder() { return new
	 * BCryptPasswordEncoder(); }
	 */

}

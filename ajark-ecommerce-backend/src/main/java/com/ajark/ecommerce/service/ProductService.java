package com.ajark.ecommerce.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ajark.ecommerce.model.ProductResponse;

@Service
public class ProductService {

	@Value("${dummyjson.base-url}")
	private String baseUrl;

	private final RestTemplate restTemplate;

	public ProductService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public ProductResponse fetchProducts() {
		String url = baseUrl + "/products";
		return restTemplate.getForObject(url, ProductResponse.class);
	}

}

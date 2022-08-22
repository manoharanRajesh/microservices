package com.example.microservice.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplicationV1 {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplicationV1.class, args);
	}
}

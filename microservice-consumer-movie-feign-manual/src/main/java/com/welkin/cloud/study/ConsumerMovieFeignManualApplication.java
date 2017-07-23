package com.welkin.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerMovieFeignManualApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMovieFeignManualApplication.class, args);
	}
}

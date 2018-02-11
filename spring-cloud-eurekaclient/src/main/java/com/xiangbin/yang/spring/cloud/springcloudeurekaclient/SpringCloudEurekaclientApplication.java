package com.xiangbin.yang.spring.cloud.springcloudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringCloudEurekaclientApplication {
	@RequestMapping("/hello")
	public String hello() {
		 return "Hello Spring cloud";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaclientApplication.class, args);
	}
}

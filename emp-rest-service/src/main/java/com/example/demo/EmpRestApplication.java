package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages="com.decret")
public class EmpRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpRestApplication.class, args);
	}
}

package com.decret.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class EmpHystrixServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpHystrixServiceApplication.class, args);
	}
}

package com.ust.microservice.timeSheetServiceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TimeSheetServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeSheetServiceRegistryApplication.class, args);
	}

}

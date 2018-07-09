package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@EnableEurekaClient
@SpringBootApplication
public class ActuatorEurekaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ActuatorEurekaApplication.class, args);
		ConfigurableEnvironment environment = context.getEnvironment();
		String port = environment.getProperty("server.port");
		System.out.println("***********************************************");
		System.out.println("		Eureka-Client:");
		System.out.println("		http://localhost:" + port);
		System.out.println("		is OK");
		System.out.println("***********************************************");
	}
	
	
}

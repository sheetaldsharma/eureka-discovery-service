package com.eshopper.eurekadiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
@EnableAutoConfiguration
public class EurekaDiscoveryServiceApplication {

	public static void main(String[] args) {
		System.out.println("-------------------------- In spring--------------------");
		SpringApplication.run(EurekaDiscoveryServiceApplication.class, args);
	}

}

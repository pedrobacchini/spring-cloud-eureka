package com.github.pedrobacchini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerSandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerSandboxApplication.class, args);
	}

}

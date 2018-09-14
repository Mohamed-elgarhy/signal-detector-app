package com.server.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SignalDetectorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignalDetectorAppApplication.class, args);
	}
}

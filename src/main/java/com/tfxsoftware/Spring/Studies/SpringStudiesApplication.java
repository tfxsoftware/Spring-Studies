package com.tfxsoftware.Spring.Studies;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStudiesApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringStudiesApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringStudiesApplication.class, args);
		logger.info("SpringStudiesApplication started");
	}

}

package com.nalaan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class LeonWordApplication {
	private static final Logger logger = LogManager.getLogger(LeonWordApplication.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(LeonWordApplication.class, args);
	}
}

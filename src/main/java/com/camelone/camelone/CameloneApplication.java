package com.camelone.camelone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.camelone")
@SpringBootApplication
public class CameloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(CameloneApplication.class, args);
	}
}

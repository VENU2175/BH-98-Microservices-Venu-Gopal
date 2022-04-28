package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.example.demo")
@SpringBootApplication
@EnableJpaRepositories("com.example.demo")
public class DemoSbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSbootApplication.class, args);
	}

}

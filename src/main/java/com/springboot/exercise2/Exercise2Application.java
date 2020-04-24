package com.springboot.exercise2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan({"com.springboot.controller","com.springboot.exceptionhandler"})
@EnableJpaRepositories("com.springboot.dao")
@EntityScan("com.springboot.model")
@SpringBootApplication
public class Exercise2Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercise2Application.class, args);
	}

}

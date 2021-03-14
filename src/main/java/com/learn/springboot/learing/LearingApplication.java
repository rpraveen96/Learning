package com.learn.springboot.learing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.learn.springboot")
public class LearingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearingApplication.class, args);
	}

}

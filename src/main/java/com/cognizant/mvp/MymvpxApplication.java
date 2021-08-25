package com.cognizant.mvp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "cognizant", "com" })
public class MymvpxApplication {
	public static void main(String[] args) {
		SpringApplication.run(MymvpxApplication.class, args);
	}

}

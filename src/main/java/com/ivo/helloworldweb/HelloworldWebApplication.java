package com.ivo.helloworldweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ivo"})
public class HelloworldWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldWebApplication.class, args);
	}
}

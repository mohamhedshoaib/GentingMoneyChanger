package com.shoaib.webapp.moneyChangerWebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.shoaib")
public class moneyChangerWebapp {

	public static void main(String[] args) {
		SpringApplication.run(moneyChangerWebapp.class, args);
	}

}

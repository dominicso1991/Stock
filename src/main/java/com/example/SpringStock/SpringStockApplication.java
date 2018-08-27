package com.example.SpringStock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.Controller"})
public class SpringStockApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStockApplication.class, args);
	}
}

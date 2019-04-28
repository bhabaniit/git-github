package com.irctc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.irctc.*")
public class IrctcApplication {

	public static void main(String[] args) {
		SpringApplication.run(IrctcApplication.class, args);
	}

}

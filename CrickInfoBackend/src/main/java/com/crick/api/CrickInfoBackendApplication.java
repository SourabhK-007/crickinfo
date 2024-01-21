package com.crick.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EntityScan(basePackages = "com/crick/api/entities")
//@ComponentScan(basePackages = "com/crick/api/controllers" + "com/crick/api/services")
public class CrickInfoBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrickInfoBackendApplication.class, args);
	}

}

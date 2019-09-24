package com.example.actuatordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(
		basePackages = {"com.example.actuatordemo"}
)public class ActuatordemoApplication {
	public ActuatordemoApplication() {
	}
	public static void main(String[] args) {
		SpringApplication.run(ActuatordemoApplication.class, args);
	}

}

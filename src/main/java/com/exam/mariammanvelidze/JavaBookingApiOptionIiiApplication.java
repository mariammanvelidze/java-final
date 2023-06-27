package com.exam.mariammanvelidze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.exam.mariammanvelidze.repositories"})
public class JavaBookingApiOptionIiiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBookingApiOptionIiiApplication.class, args);
	}

}

package com.samsung.theater;

import com.samsung.theater.domain.CostumeElement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheaterApplication {

	public static void main(String[] args) {
		CostumeElement costumeElement = CostumeElement.builder().id(4).name("Fds").build();
		SpringApplication.run(TheaterApplication.class, args);
	}

}

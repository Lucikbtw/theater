package com.samsung.theater;

import com.samsung.theater.domain.CostumeElement;
import com.samsung.theater.rest.controller.CostumeElementController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheaterApplication {

	public static void main(String[] args) {
		CostumeElement costumeElement1 = CostumeElement.builder().id(0).name("Fds1").build();
		CostumeElement costumeElement2 = CostumeElement.builder().id(0).name("Fds2").build();
		CostumeElement costumeElement3 = CostumeElement.builder().id(0).name("Fds3").build();
		CostumeElementController controller = SpringApplication.run(TheaterApplication.class, args).getBean(CostumeElementController.class);
		controller.insert(costumeElement1);
		controller.insert(costumeElement2);
		controller.insert(costumeElement3);
	}

}

package com.arthur.locadoramotos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class LocadoramotosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocadoramotosApplication.class, args);
	}

}

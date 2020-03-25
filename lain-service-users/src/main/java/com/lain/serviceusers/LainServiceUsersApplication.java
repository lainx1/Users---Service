package com.lain.serviceusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LainServiceUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(LainServiceUsersApplication.class, args);
	}

}

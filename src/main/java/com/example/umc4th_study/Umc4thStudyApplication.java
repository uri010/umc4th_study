package com.example.umc4th_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Umc4thStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(Umc4thStudyApplication.class, args);
	}

}
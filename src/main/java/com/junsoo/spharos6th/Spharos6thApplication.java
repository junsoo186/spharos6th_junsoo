package com.junsoo.spharos6th;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Spharos6thApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spharos6thApplication.class, args);
	}

}

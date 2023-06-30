package com.factory.woodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // JPA Auditing 기능을 활성화합니다.
public class WoodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WoodoApplication.class, args);
	}

}

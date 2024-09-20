package com.education.ecovisionschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.education.ecovisionschool.repository")
@EntityScan("com.education.ecovisionschool.model")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class EcoVisionSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcoVisionSchoolApplication.class, args);
	}

}

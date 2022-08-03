package com.springmc.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.springmc.controller,com.springmc.service")
@EntityScan("com.springmc.entity")
@EnableJpaRepositories(basePackageClasses = com.springmc.repository.DepartmentRepository.class)
@SpringBootApplication
public class DepartmentSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentSvcApplication.class, args);
	}

}

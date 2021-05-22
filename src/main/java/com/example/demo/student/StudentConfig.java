package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student rain =  new Student(
					1L,
					"Rain",
					"rain@gmail.com",
					LocalDate.of(1997, 1, 13)
			);
			Student sarah =  new Student(
					2L,
					"Sarah",
					"sarah@gmail.com",
					LocalDate.of(1998, 1, 13)
			);
			
			repository.saveAll(List.of(rain, sarah));
		};
	}
}

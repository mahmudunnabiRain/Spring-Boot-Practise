package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.Student;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@GetMapping
	public List<Student> hello() {
		return List.of(
					new Student(1L,
							"rain",
							"rain@gmail.com",
							LocalDate.of(1997, 1, 13),
							24
							),
					new Student(2L,
							"rakib",
							"rakib@gmail.com",
							LocalDate.of(2000, 1, 14),
							21)
				);
	}

}

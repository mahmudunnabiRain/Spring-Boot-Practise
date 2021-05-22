package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public List<Student> getStudents() {
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

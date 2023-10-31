package com.arktechsms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arktechsms.entity.Student;
import com.arktechsms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	// injecting student repository
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1 = new Student("Akshay", "Kanawade", "tech.akshak@gmail.com",
		 * "9579987678");
		 * 
		 * // calling studentRepository and used save method
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("shreyas", "Kanawade",
		 * "tech.shreyas@gmail.com", "9374987678");
		 * 
		 * // calling studentRepository and used save method
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("samiksha", "Landge", "tech.sam@gmail.com",
		 * "9876543456");
		 * 
		 * // calling studentRepository and used save method
		 * studentRepository.save(student3);
		 */

	}

}

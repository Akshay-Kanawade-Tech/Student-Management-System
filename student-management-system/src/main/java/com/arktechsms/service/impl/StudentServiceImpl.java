package com.arktechsms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.arktechsms.entity.Student;
import com.arktechsms.repository.StudentRepository;
import com.arktechsms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	//Constructor injection
	
	private StudentRepository studentRepository;
	
	//creating constructor
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		
		//finds list of all student
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}
@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

@Override
public void deleteStudentById(Long id) {
	studentRepository.deleteById(id);
	
}

	

}

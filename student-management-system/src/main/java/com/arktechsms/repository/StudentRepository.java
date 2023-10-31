package com.arktechsms.repository;

//repository layer of aapplication

import org.springframework.data.jpa.repository.JpaRepository;

import com.arktechsms.entity.Student;

public interface StudentRepository  extends JpaRepository<Student, Long>{

}

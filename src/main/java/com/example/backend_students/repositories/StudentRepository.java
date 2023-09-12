package com.example.backend_students.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend_students.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

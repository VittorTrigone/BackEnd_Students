package com.example.backend_students.mappers;

import com.example.backend_students.dtos.StudentRequest;
import com.example.backend_students.dtos.StudentResponse;
import com.example.backend_students.entities.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentMapper {

    public static Student toEntity(StudentRequest request) {

        Student student = new Student();
        student.setName(request.name());
        student.setEmail(request.email());
        student.setCPF(request.cpf());
        student.setLocation(request.location());
        return student;

    }

    public static StudentResponse toDTO(Student student) {

        return new StudentResponse(student.getId(), student.getName(), student.getEmail(), student.getCPF(),
                student.getLocation());

    }

    public static List<StudentResponse> toDTOList(List<Student> students) {

        return students.stream()
                .map(StudentMapper::toDTO)
                .collect(Collectors.toList());

    }

}

package com.example.backend_students.dtos;

public record StudentResponse(
    
    long id,
    String name,
    String email,
    String cpf,
    String location

) {}

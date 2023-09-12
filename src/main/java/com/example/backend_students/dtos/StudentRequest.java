package com.example.backend_students.dtos;

import jakarta.validation.constraints.NotBlank;

public record StudentRequest(

        @NotBlank(message = "O Nome é obrigatório!") String name,
        @NotBlank(message = "O Email é obrigatório!") String email,
        @NotBlank(message = "O CPF é obrigatório!") String cpf,
        @NotBlank(message = "O endereço é obrigatório!") String location

) {

}

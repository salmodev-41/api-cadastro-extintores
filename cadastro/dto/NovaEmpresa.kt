package com.example.cadastro.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

data class NovaEmpresa (
    @field: NotNull(message = "O código não pode ser nulo") var codigo: String,
    @field: NotBlank(message = "A descrição não pode estar em branco") var descricao: String
)
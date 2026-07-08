package com.example.cadastro.dto

import com.example.cadastro.model.LocalizacaoTipo

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull


data class NovaLocalizaoForm(

    val id: Int = 0,

    @field:NotBlank(message = "O código da empresa é obrigatório")
    val empresaCodigo: String,

    @field:NotBlank(message = "A descrição é obrigatória")
    val descricao: String,

    @field:NotBlank(message = "O centro de custo é obrigatório")
    val centroCusto: String,

    @field:NotNull(message = "O tipo de localização é obrigatório")
    val tipo: LocalizacaoTipo?
)
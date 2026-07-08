package com.example.cadastro.dto

data class CategoriaForm(
    val id: Int,
    val descricao: String,
    val unidade: String,
    val periodoInspecao: Int,
    val periodoValidade: Int
)

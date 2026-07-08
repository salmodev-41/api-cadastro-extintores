package com.example.cadastro.dto

import com.example.cadastro.model.Empresas
import com.example.cadastro.model.LocalizacaoTipo

data class LocalizacaoView(
    val id: Int? = null,
    val empresa: Empresas?,
    val descricao: String,
    val centroCusto: String,
    val tipo: LocalizacaoTipo?
)

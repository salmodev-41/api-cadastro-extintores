package com.example.cadastro.dto

import com.example.cadastro.model.MovimentoTipo
import java.time.LocalDate

data class NovoMovimentoForm(
    var empresaCodigo: String,
    var data: LocalDate,
    var tipo: MovimentoTipo,
    var empresaDestinoCodigo: String
)
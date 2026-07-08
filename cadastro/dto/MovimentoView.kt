package com.example.cadastro.dto

import com.example.cadastro.model.Empresas
import com.example.cadastro.model.MovimentoTipo
import java.time.LocalDate

data class MovimentoView(
    var id: Int? = null,
    var empresa: Empresas? = null,
    var data: LocalDate? = null,
    var tipo: MovimentoTipo? = null,
    var empresaDestino: Empresas? = null,
)

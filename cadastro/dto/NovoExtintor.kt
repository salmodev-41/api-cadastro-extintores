package com.example.cadastro.dto

import com.example.cadastro.model.ExtintorSituacao
import java.math.BigDecimal
import java.time.LocalDate

data class NovoExtintor(
    val numero: String,
    val situacao: ExtintorSituacao,
    val tipoId: Int,
    val cargaTotal: BigDecimal,
    val localizacaoId: Int,
    val cargaVencimento: LocalDate,
    val dataProxInspecao: LocalDate,
    val centroCusto: String
)
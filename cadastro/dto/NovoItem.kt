package com.example.cadastro.dto

import com.example.cadastro.model.*
import java.time.LocalDate

data class NovoItem(
    var movimentoId: Int,
    var extintorNumero: String,
    var destinoId: Int,
    var tipoMovimentoItem: ItemMovimentoTipo,
    var conferido: Boolean = false,
    var tipoRetorno: TipoRetorno,
    var cargaVencimento: LocalDate,
    var dataProxInspecao: LocalDate,
    var numeroSubstituto: String = ""
)
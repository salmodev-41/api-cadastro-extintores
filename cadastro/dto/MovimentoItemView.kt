package com.example.cadastro.dto

import com.example.cadastro.model.*
import java.time.LocalDate

data class MovimentoItemView(
    var id: Int = 0,
    var movimento: ExtintoresMovimento? = null,
    var extintor: Extintores? = null,
    var destino: ExtintoresLocalizacoes? = null,
    var tipoMovimentoItem: ItemMovimentoTipo? = null,
    var conferido: Boolean = false,
    var tipoRetorno: TipoRetorno? = null,
    var cargaVencimento: LocalDate? = null,
    var dataProxInspecao: LocalDate? = null,
    var numeroSubstituto: String = ""
)

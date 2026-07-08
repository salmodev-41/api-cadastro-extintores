package com.example.cadastro.model

import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDate

@Entity
@Table(name = "extintores")
 class Extintores(

    @Id
    @Column(name = "numero", length = 15)
    var numero: String = "",

    @ManyToOne
    @JoinColumn(name = "tipo_id")
    var tipo: ExtintoresCategorias? = null,

    @Column(name = "carga_total", length = 15)
    var cargaTotal: BigDecimal? = null,

    @Column(name = "carga_vencimento")
    var cargaVencimento: LocalDate? = null,

    @Column(name = "data_prox_inspecao")
    var dataProxInspecao: LocalDate? = null,

    @ManyToOne
    @JoinColumn(name = "localizacao_id")
    var localizacao: ExtintoresLocalizacoes? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "situacao", length = 1)
    var situacao: ExtintorSituacao? = null,

    @Column(name = "centro_custo", length = 20)
    var centroCusto: String = ""

 )




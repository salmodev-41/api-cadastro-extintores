package com.example.cadastro.model

import jakarta.persistence.*

@Entity
@Table(name = "extintores_localizacoes")
class ExtintoresLocalizacoes(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_localizacao")
    var id: Int = 0,

    @ManyToOne
    @JoinColumn(name = "empresa_codigo")
    var empresa: Empresas? = null,

    @Column(name = "descricao", length = 200)
    var descricao: String = "",

    @Column(name = "centro_custo", length = 20)
    var centroCusto: String = "",

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo" , length = 1)
    var tipo: LocalizacaoTipo? = null
)

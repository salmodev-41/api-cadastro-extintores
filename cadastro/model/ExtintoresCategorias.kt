package com.example.cadastro.model

import jakarta.persistence.*

@Entity
@Table(name = "extintores_categorias")
 class ExtintoresCategorias(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
     var id: Int = 0,

    @Column(name = "descricao", length = 30)
     var descricao: String = "",

    @Column(name = "unidade", length = 2)
     var unidade: String = "",

    @Column(name = "periodo_inspecao")
     var periodoInspecao: Int = 0,

    @Column(name = "periodo_validade")
     var periodoValidade: Int = 0
)




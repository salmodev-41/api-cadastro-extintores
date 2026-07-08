package com.example.cadastro.model

import jakarta.persistence.*
import java.time.LocalDate


@Entity
@Table(name = "extintores_movimento")
class ExtintoresMovimento(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movimento")
    var id: Int = 0,

    @ManyToOne
    @JoinColumn(name = "empresa_codigo")
    var empresa: Empresas? = null,

    @Column(name = "data_movimento")
    var data: LocalDate? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", length = 1)
    var tipo: MovimentoTipo? = null,

    @ManyToOne
    @JoinColumn(name = "empresa_destino")
    var empresaDestino: Empresas? = null,
)


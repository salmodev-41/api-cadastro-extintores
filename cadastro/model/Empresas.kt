package com.example.cadastro.model

import jakarta.persistence.*



@Entity
@Table(name = "empresas")
class Empresas(

    @Id
    @Column(name = "codigo")
    var codigo: String? = null,

    @Column(name = "descricao", length = 200)
    var descricao: String = ""
)

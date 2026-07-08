package com.example.cadastro.repository

import com.example.cadastro.model.ExtintoresLocalizacoes
import org.springframework.data.jpa.repository.JpaRepository

interface ExtintoresLocalizacoesRepository: JpaRepository<ExtintoresLocalizacoes, Int> {
}
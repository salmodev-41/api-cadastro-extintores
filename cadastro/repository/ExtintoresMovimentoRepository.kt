package com.example.cadastro.repository

import com.example.cadastro.model.ExtintoresMovimento
import org.springframework.data.jpa.repository.JpaRepository

interface ExtintoresMovimentoRepository: JpaRepository<ExtintoresMovimento, Int> {
}
package com.example.cadastro.repository

import com.example.cadastro.model.ExtintoresMovimentoItem
import org.springframework.data.jpa.repository.JpaRepository

interface ExtintoresMovimentoItemRepository:  JpaRepository<ExtintoresMovimentoItem, Int> {
}
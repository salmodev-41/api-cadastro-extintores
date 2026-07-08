package com.example.cadastro.repository

import com.example.cadastro.model.Extintores
import org.springframework.data.jpa.repository.JpaRepository


interface ExtintoresRepository: JpaRepository<Extintores, String> {
}
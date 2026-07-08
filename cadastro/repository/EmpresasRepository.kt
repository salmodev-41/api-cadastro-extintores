package com.example.cadastro.repository

import com.example.cadastro.model.Empresas
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface EmpresasRepository: JpaRepository<Empresas, String> {
}
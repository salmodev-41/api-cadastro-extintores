package com.example.cadastro.mapper

import com.example.cadastro.dto.EmpresasView
import com.example.cadastro.model.Empresas
import org.springframework.stereotype.Component

@Component
class EmpresasViewMapper(): Mapper<Empresas, EmpresasView> {
    override fun map(e: Empresas): EmpresasView {
        return EmpresasView(
            codigo = e.codigo!!,
            descricao = e.descricao
        )
    }
}
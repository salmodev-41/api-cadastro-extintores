package com.example.cadastro.mapper

import com.example.cadastro.dto.NovaEmpresa
import com.example.cadastro.model.Empresas
import org.springframework.stereotype.Component

@Component
class EmpresasFormMapper(): Mapper<NovaEmpresa, Empresas> {
    override fun map(e: NovaEmpresa): Empresas {
        return Empresas(
            codigo = e.codigo,
            descricao = e.descricao
        )
    }
}
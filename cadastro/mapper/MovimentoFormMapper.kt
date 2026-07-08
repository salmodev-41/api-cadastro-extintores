package com.example.cadastro.mapper

import com.example.cadastro.dto.NovoMovimentoForm
import com.example.cadastro.model.ExtintoresMovimento
import com.example.cadastro.service.EmpresasService
import org.springframework.stereotype.Component

@Component
class MovimentoFormMapper(

    private val empresasService: EmpresasService
) : Mapper<NovoMovimentoForm, ExtintoresMovimento> {

    override fun map(t: NovoMovimentoForm): ExtintoresMovimento {

        val empresaOrigem = empresasService.buscarEmpresas(t.empresaCodigo)
        val empresaDestino = empresasService.buscarEmpresas(t.empresaDestinoCodigo)

        return ExtintoresMovimento(
            empresa = empresaOrigem,
            data = t.data,
            tipo = t.tipo,
            empresaDestino = empresaDestino
        )
    }
}
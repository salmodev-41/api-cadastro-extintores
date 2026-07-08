package com.example.cadastro.mapper

import com.example.cadastro.dto.NovaLocalizaoForm
import com.example.cadastro.exception.NotFoundException
import com.example.cadastro.model.ExtintoresLocalizacoes
import org.springframework.stereotype.Component
import com.example.cadastro.repository.EmpresasRepository


@Component
class LocalizacaoFormMapper(
    private val empresasRepository: EmpresasRepository
) : Mapper<NovaLocalizaoForm, ExtintoresLocalizacoes> {

    override fun map(t: NovaLocalizaoForm): ExtintoresLocalizacoes {
        val empresaValido = t.empresaCodigo?: throw IllegalArgumentException("Id Inválido")
        val empresaObjeto = empresasRepository.findById(empresaValido)
            .orElseThrow { NotFoundException("Empresa com codigo $empresaValido não encontrada") }

        return ExtintoresLocalizacoes(
            id = t.id,
            empresa = empresaObjeto,
            descricao = t.descricao,
            centroCusto = t.centroCusto,
            tipo = t.tipo
        )
    }
}
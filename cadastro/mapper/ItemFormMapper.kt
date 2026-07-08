package com.example.cadastro.mapper

import com.example.cadastro.dto.NovoItem
import com.example.cadastro.model.ExtintoresMovimentoItem
import com.example.cadastro.repository.ExtintoresLocalizacoesRepository
import com.example.cadastro.repository.ExtintoresMovimentoRepository
import com.example.cadastro.repository.ExtintoresRepository
import org.springframework.stereotype.Component

@Component
class ItemFormMapper(
    private val extintoresMovimentoRepository: ExtintoresMovimentoRepository,
    private val extintoresRepository: ExtintoresRepository,
    private val extintoresLocalizacoesRepository: ExtintoresLocalizacoesRepository
) : Mapper<NovoItem, ExtintoresMovimentoItem> {

    override fun map(t: NovoItem): ExtintoresMovimentoItem {


        val movimentoCompleto = extintoresMovimentoRepository.findById(t.movimentoId)
            .orElseThrow { IllegalArgumentException("Movimento com ID ${t.movimentoId} não encontrado") }

        val extintorCompleto = extintoresRepository.findById(t.extintorNumero)
            .orElseThrow { IllegalArgumentException("Extintor número ${t.extintorNumero} não encontrado") }

        val destinoCompleto = extintoresLocalizacoesRepository.findById(t.destinoId)
            .orElseThrow { IllegalArgumentException("Localização de destino com ID ${t.destinoId} não encontrada") }


        return ExtintoresMovimentoItem(
            movimento = movimentoCompleto,
            extintor = extintorCompleto,
            destino = destinoCompleto,
            tipoMovimentoItem = t.tipoMovimentoItem,
            conferido = t.conferido,
            tipoRetorno = t.tipoRetorno,
            cargaVencimento = t.cargaVencimento,
            dataProxInspecao = t.dataProxInspecao,
            numeroSubstituto = t.numeroSubstituto
        )
    }
}
package com.example.cadastro.mapper

import com.example.cadastro.dto.ExtintorView
import com.example.cadastro.model.Extintores
import org.springframework.stereotype.Component


@Component
class ExtintorViewMapper(
    private val localizacaoViewMapper: LocalizacaoViewMapper
) : Mapper<Extintores, ExtintorView> {

    override fun map(t: Extintores): ExtintorView {
        return ExtintorView(
            numero = t.numero,
            tipo = t.tipo,
            cargaTotal = t.cargaTotal,
            cargaVencimento = t.cargaVencimento,
            dataProxInspecao = t.dataProxInspecao,
            localizacao = t.localizacao?.let { localizacaoViewMapper.map(it) },
            situacao = t.situacao,
            centroCusto = t.centroCusto
        )
    }
}
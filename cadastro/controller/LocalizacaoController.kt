package com.example.cadastro.controller

import com.example.cadastro.dto.LocalizacaoView
import com.example.cadastro.dto.NovaLocalizaoForm
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder
import com.example.cadastro.service.ExtintoresLocalizacaoService
//projeto pronto, so revisar e alterar os valores das variaveis dentro dos models, forms, views e mappers(deixar todos os valores iguais, pra compilar de maneira correta)
@RestController
@RequestMapping("/localizacoes")
class LocalizacaoController(
    private val service: ExtintoresLocalizacaoService
){
    @GetMapping("/{id}")
    fun buscarLocalizacao(@PathVariable id: Int): ResponseEntity<LocalizacaoView> {
        val view = service.buscarLocalizacao(id)
        return ResponseEntity.ok(view)
    }

    @GetMapping
    fun listarLocalizacao(): ResponseEntity<List<LocalizacaoView>> {
        val lista = service.listarLocalizacoes()
        return ResponseEntity.ok(lista)
    }

    @PostMapping
    fun cadastrarLocalizacao(
        @RequestBody @Valid form: NovaLocalizaoForm,
        uriBuilder: UriComponentsBuilder
    ): ResponseEntity<LocalizacaoView> {
        val localizacaoView = service.cadastrarLocalizacao(form)
        val uri = uriBuilder.path("/localizacoes/{id}")
            .buildAndExpand(localizacaoView.id)
            .toUri()
        return ResponseEntity.created(uri).body(localizacaoView)
    }

    @PutMapping("/{id}")
    fun atualizarLocalizacao(
        @PathVariable id: Int,
        @RequestBody @Valid form: NovaLocalizaoForm
    ): ResponseEntity<LocalizacaoView> {
        val localizacoesView = service.atualizarLocalizacao(id, form)
        return ResponseEntity.ok(localizacoesView)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deletarLocalizacao(@PathVariable id: Int){
        service.deletarLocalizacao(id)
    }
}

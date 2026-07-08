package com.example.cadastro.controller

import com.example.cadastro.dto.MovimentoView
import com.example.cadastro.dto.NovoMovimentoForm
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder
import com.example.cadastro.service.ExtintoresMovimentoService


@RestController
@RequestMapping("/movimentacoes")
class MovimentoController(
    private val service : ExtintoresMovimentoService
){
    @GetMapping("/{id}")
    fun buscarMovimento(@PathVariable id: Int): ResponseEntity<MovimentoView> {
        val view = service.buscarMovimento(id)
        return ResponseEntity.ok(view)
    }

    @GetMapping
    fun listarMovimento(): ResponseEntity<List<MovimentoView>> {
        val lista = service.listarMovimentacoes()
        return ResponseEntity.ok(lista)
    }

    @PostMapping
    fun cadastrarMovimento(
        @RequestBody @Valid form: NovoMovimentoForm,
        uriBuilder: UriComponentsBuilder
    ): ResponseEntity<MovimentoView> {
        val movimentacaoView = service.cadastrarMovimento(form)
        val uri = uriBuilder.path("/movimentacoes/{id}")
            .buildAndExpand(movimentacaoView.id)
            .toUri()
        return ResponseEntity.created(uri).body(movimentacaoView)
    }

    @PutMapping("/{id}")
    fun atualizarMovimento(
        @PathVariable id: Int,
        @RequestBody @Valid form: NovoMovimentoForm
    ): ResponseEntity<MovimentoView>{
        val movimentoView = service.atualizarMovimento(id, form)
        return ResponseEntity.ok(movimentoView)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deletarMovimento(@PathVariable id: Int){
        service.deletarMovimento(id)
    }
}

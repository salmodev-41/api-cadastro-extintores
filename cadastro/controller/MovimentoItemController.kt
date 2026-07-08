package com.example.cadastro.controller

import com.example.cadastro.dto.MovimentoItemView
import com.example.cadastro.dto.NovoItem
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder
import com.example.cadastro.service.MovimentoItemService


@RestController
@RequestMapping("/movimento-itens")
class MovimentoItemController(
    private val service: MovimentoItemService
) {

    @GetMapping
    fun listarMovimentoItem(): ResponseEntity<List<MovimentoItemView>> {
        val lista = service.listarMovimentoItem()
        return ResponseEntity.ok(lista)
    }

    @GetMapping("/{id}")
    fun buscarMovimentoItem(@PathVariable id: Int): ResponseEntity<MovimentoItemView> {
        val item = service.buscarMovimentoItem(id)
        return ResponseEntity.ok(item)
    }

    @PostMapping
    fun cadastrarMovimentoItem(
        @RequestBody @Valid e: NovoItem,
        uriBuilder: UriComponentsBuilder
    ): ResponseEntity<MovimentoItemView> {
        val movimentoItemView = service.cadastrarMovimentoItem(e)
        val uri = uriBuilder.path("/movimento-itens/{id}")
            .buildAndExpand(movimentoItemView.id)
            .toUri()
        return ResponseEntity.created(uri).body(movimentoItemView)
    }

    @PutMapping("/{id}")
    fun atualizarMovimentoItem(
        @PathVariable id: Int,
        @RequestBody @Valid e: NovoItem
    ): ResponseEntity<MovimentoItemView> {
        val movimentoItemView = service.atualizarMovimentoItem(id, e)
        return ResponseEntity.ok(movimentoItemView)
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deletarMovimentoItem(@PathVariable id: Int) {
        service.deletarMovimentoItem(id)
    }
}
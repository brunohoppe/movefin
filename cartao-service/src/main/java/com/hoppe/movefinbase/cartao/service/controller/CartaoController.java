package com.hoppe.movefinbase.cartao.service.controller;

import com.hoppe.movefinbase.cartao.service.repository.CartaoEntity;
import com.hoppe.movefinbase.cartao.service.service.CartaoOperacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path ="cartoes")
public class CartaoController {
    public CartaoOperacaoService cartaoOperacaoService;

    public CartaoController(CartaoOperacaoService cartaoOperacaoService) {
        this.cartaoOperacaoService = cartaoOperacaoService;
    }

    @GetMapping(path = "{nome}")
    public ResponseEntity<CartaoEntity> pegarNomeCartao(@PathVariable String nome) {
        Optional<CartaoEntity> cartao = cartaoOperacaoService.recuperarNomeCartao(nome);
        return ResponseEntity.ok().body(cartao.get());
    }

    @GetMapping()
    public ResponseEntity<String> findAll() {
        System.out.println("found all card");
        return ResponseEntity.ok().body("Cards");
    }
}

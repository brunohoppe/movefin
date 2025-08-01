package com.hoppe.movefinbase.cartao.service;

import com.hoppe.movefinbase.cartao.service.repository.TipoCartao;
import com.hoppe.movefinbase.cartao.service.service.CartaoOperacaoService;
import com.hoppe.movefinbase.cartao.service.service.impl.CartaoOperacaoServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CartaoServiceApplication implements CommandLineRunner {

    private final CartaoOperacaoService cartaoOperacaoService;

    public CartaoServiceApplication(CartaoOperacaoService cartaoOperacaoService) {
        this.cartaoOperacaoService = cartaoOperacaoService;
    }

    public static void main(String[] args) {
        SpringApplication.run(CartaoServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        cartaoOperacaoService.criarCartao("bradesco", TipoCartao.DEBITO);

    }
}

package com.hoppe.movefinbase.cartao.service.service;

import com.hoppe.movefinbase.cartao.service.repository.CartaoEntity;
import com.hoppe.movefinbase.cartao.service.repository.TipoCartao;

import java.util.Optional;

public interface CartaoOperacaoService {

    Optional<CartaoEntity> recuperarNomeCartao(String nomeCartao);
    void criarCartao(String nome, TipoCartao tipoCartao);
}

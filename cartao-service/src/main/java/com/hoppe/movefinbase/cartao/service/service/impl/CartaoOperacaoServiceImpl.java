package com.hoppe.movefinbase.cartao.service.service.impl;

import com.hoppe.movefinbase.cartao.service.repository.CartaoEntity;
import com.hoppe.movefinbase.cartao.service.repository.CartaoOperacaoRepository;
import com.hoppe.movefinbase.cartao.service.repository.TipoCartao;
import com.hoppe.movefinbase.cartao.service.service.CartaoOperacaoService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartaoOperacaoServiceImpl implements CartaoOperacaoService {

    public final CartaoOperacaoRepository cartaoOperacaoRepository;

    public CartaoOperacaoServiceImpl(CartaoOperacaoRepository cartaoOperacaoRepository) {
        this.cartaoOperacaoRepository = cartaoOperacaoRepository;
    }

    public Optional<CartaoEntity> recuperarNomeCartao(String nomeCartao) {
        return this.cartaoOperacaoRepository.findByNomeCartao(nomeCartao);
    }


    @Override
    public void criarCartao(String nome, TipoCartao tipoCartao) {
        this.cartaoOperacaoRepository.save(new CartaoEntity(nome, tipoCartao));

    }
}

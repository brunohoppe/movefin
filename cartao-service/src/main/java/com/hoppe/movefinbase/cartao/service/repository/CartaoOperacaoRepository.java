package com.hoppe.movefinbase.cartao.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartaoOperacaoRepository extends JpaRepository<CartaoEntity, Long> {

    Optional<CartaoEntity> findByNomeCartao(String nome);
}

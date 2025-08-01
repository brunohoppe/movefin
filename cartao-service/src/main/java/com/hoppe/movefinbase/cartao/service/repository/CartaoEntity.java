package com.hoppe.movefinbase.cartao.service.repository;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "cartao")
public class CartaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private UUID hashCartao;
    @Column(nullable = false)
    private String nomeCartao;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoCartao tipoCartao;
    @Column(insertable = false, nullable = false)
    @ColumnDefault("0")
    private BigDecimal saldo;

    public CartaoEntity(
            String nomeCartao,
            TipoCartao tipoCartao
    ) {
        this.nomeCartao = nomeCartao;
        this.tipoCartao = tipoCartao;
        this.hashCartao = UUID.randomUUID();

    }

}

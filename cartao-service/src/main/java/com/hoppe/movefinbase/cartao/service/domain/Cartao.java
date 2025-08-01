package com.hoppe.movefinbase.cartao.service.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Cartao {

    private final Long idCartao;
    private final String nomeCartao;
    private BigDecimal saldoCartao;

    public Cartao(String nomeCartao, Long idCartao) {
        this.idCartao = idCartao;
        this.nomeCartao = nomeCartao;
    }

    public String exibirNomeCartao() {
        return this.nomeCartao;
    }
    public void adicionarSaldo(BigDecimal valor) {
        this.saldoCartao = this.saldoCartao.add(valor);
    }
    public void pagarDespesa(BigDecimal valor) {
        this.saldoCartao = this.saldoCartao.subtract(valor);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cartao cartao)) return false;
        return Objects.equals(idCartao, cartao.idCartao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idCartao);
    }
}

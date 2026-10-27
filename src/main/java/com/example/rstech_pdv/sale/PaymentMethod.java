package com.example.rstech_pdv.sale;

import lombok.Getter;

@Getter
public enum PaymentMethod {
    DINHEIRO("Dinheiro"),
    PIX("PIX"),
    CARTAO_CREDITO("Cartão de crédito"),
    CARTAO_DEBITO("Cartão de débito");

    private final String label;

    PaymentMethod(String label) {
        this.label = label;
    }

}
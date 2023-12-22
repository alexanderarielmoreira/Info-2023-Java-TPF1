package com.informatorio.dominio;

public class CuentaCorriente extends Cuenta {
    private Double limiteSobregiro;

    public CuentaCorriente() {}

    public CuentaCorriente(Double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }

    public CuentaCorriente(Long id, Cliente titular, Double saldo, Double limiteSobregiro) {
        super(id, titular, saldo);
        this.limiteSobregiro = limiteSobregiro;
    }

    public Double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public void setLimiteSobregiro(Double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }

}

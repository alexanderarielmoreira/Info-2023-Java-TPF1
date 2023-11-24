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

    // Retirar con límite de sobregiro;
    @Override
    public void retirar(double monto) {
        double saldoActual = getSaldo();
        if (monto <= saldoActual + limiteSobregiro) {
            setSaldo(saldoActual - monto);
        } else {
            System.out.println("No se puede realizar el retiro de dinero porque ha excedido el limite de sobregiro");
        }
    }
}

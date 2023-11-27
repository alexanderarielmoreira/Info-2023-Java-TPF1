package com.informatorio.dominio;

public class CuentaCorriente extends Cuenta {

    public static final String MENSAJE_ALERTA_LIMITE_SOBREGIRO = "No se puede realizar el " +
                                                                 "retiro de dinero porque ha excedido " +
                                                                 "el limite de sobregiro";
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
        if (monto <= saldoActual + getLimiteSobregiro()) {
            setSaldo(saldoActual - monto);
        } else {
            System.out.println(MENSAJE_ALERTA_LIMITE_SOBREGIRO);
        }
    }
}

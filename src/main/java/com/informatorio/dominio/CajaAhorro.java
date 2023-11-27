package com.informatorio.dominio;

public class CajaAhorro extends Cuenta{

    private Double interes;

    public CajaAhorro(){ }

    public CajaAhorro(Double interes) {
        this.interes = interes;
    }

    public CajaAhorro(Long id, Cliente titular, Double saldo, Double interes) {
        super(id, titular, saldo);
        this.interes = interes;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    // Retirar dinero;
    @Override
    public void retirar(double monto) {
        setSaldo(getSaldo() - monto);
    }

    // Calcular intereses;
    public void calcularInteres() {
        double intereses = ((getSaldo() * interes) / 100);
        setSaldo(getSaldo() + intereses);
    }

}

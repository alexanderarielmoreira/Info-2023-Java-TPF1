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
    public Double retirar(Double monto) {
        System.out.println("Saldo actual: $" + getSaldo());
        System.out.println("Monto a retirar: $" + monto);
        setSaldo(getSaldo() - monto);
        System.out.println("Saldo restante: $" );
        return getSaldo();
    }

    // Calcular intereses;
    public Double calcularInteres() {
        System.out.println("Saldo previo al cálculo: $" + getSaldo());
        System.out.println("Tasa de interés aplicable: " + getInteres() + " %");
        double intereses = ((getSaldo() * interes) / 100);
        System.out.println("Intereses ganados: " + intereses);
        setSaldo(getSaldo() + intereses);
        System.out.println("Nuevo saldo con intereses ganados: ");
        return getSaldo();
    }
}

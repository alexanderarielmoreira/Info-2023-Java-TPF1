package com.informatorio.dominio;

public class Cuenta {
    private Long id;
    private Cliente titular;
    private Double saldo;

    public Cuenta() { }
    public Cuenta(Long id, Cliente titular, Double saldo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // Depositar Pesos en cuenta;
    public void depositar(double monto) {
        System.out.println("Ha depositado: $" + monto);
        setSaldo(getSaldo() + monto);
    }

    // Consultar saldo;
    public Double consultarSaldo(){
        System.out.println("- Saldo actual: -");
        return getSaldo();
    }

    // Retirar Pesos de la cuenta;
    public void retirar (double monto){};

}

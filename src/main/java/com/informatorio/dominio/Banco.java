package com.informatorio.dominio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    public Banco() {
        this.clientes = new ArrayList<>();
    }

    // Agregar cliente;
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Abrir cuenta;
    public void abrirCuenta(Cliente cliente, Cuenta cuenta) {
        cliente.agregarCuenta(cuenta);
    }

    // Gestionar clientes;
    public void gestionarClientes() {
        //// código;
    }

    public void exportarCSV() {
        // Lógica para exportar a CSV
        // Ordenar por número único del titular y saldo
        // Imprimir en formato CSV
    }







}

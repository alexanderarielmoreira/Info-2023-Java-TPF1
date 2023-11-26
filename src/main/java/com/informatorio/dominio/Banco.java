package com.informatorio.dominio;
import java.util.ArrayList; 
import java.util.List;

public class Banco {
    protected List<Cliente> clientes;

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Banco() {
        this.clientes = new ArrayList<>();
    }

}
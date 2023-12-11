package com.informatorio.basededatos;

import com.informatorio.dominio.CajaAhorro;
import com.informatorio.dominio.Cliente;
import com.informatorio.dominio.Cuenta;
import com.informatorio.dominio.CuentaCorriente;

import java.util.ArrayList;
import java.util.List;

public class BdClientes {
    private List<Cliente> bdClientesBancarios = new ArrayList<>();

    public List<Cliente> getBdClientesBancarios() {
        return bdClientesBancarios;
    }

    // Agrega una lista de clientes;
    public void setBdClientesBancarios(List<Cliente> ClientesBancarios) {
        this.bdClientesBancarios = ClientesBancarios;
    }

    // Agrega un cliente;
    public void setBdCliente(Cliente cliente) {
        this.bdClientesBancarios.add(cliente);
    }

}

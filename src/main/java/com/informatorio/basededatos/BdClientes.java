package com.informatorio.basededatos;

import com.informatorio.dominio.Cliente;


import java.util.ArrayList;
import java.util.List;

public class BdClientes {
    public static List<Cliente> bdClientesBancarios = new ArrayList<>();

    public static List<Cliente> getBdClientesBancarios() {
        return bdClientesBancarios;
    }

    // Agrega una lista de clientes;
    public static void setBdClientesBancarios(List<Cliente> ClientesBancarios) {
        bdClientesBancarios = ClientesBancarios;
    }

    // Agrega un cliente;
    public static void setBdCliente(Cliente cliente) {
        bdClientesBancarios.add(cliente);
    }

}

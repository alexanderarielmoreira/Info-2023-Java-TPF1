package com.informatorio.servicio.banco;

import com.informatorio.basededatos.BdClientes;
import com.informatorio.dominio.Cliente;

public class BancoServicioImpl implements BancoServicio{

    // Muestra una una lista de clientes bancarios;
    @Override
    public void listaClientesDeBD() {
        System.out.println("CLIENTES BANCARIOS EN BASE DE DATOS:");
        BdClientes.getClientes();
    }

    // Muestra datos de un cliente por su ID:
    @Override
    public void mostrarDatosCliente(Long id) {
        System.out.println("DATOS DEL CLIENTE: ");
        BdClientes.getClientePorId(id);
    }

    @Override
    public void agregarCliente(Long clave, Cliente cliente) {
        ////;
    }

    @Override
    public void abrirCuenta(Long id, Cliente titular, Double saldo) {
        ////;
    }

}

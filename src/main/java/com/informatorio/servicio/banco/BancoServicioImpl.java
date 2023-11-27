package com.informatorio.servicio.banco;

import com.informatorio.basededatos.BdClientes;
import com.informatorio.dominio.Cliente;
import com.informatorio.dominio.CajaAhorro;
import com.informatorio.dominio.CuentaCorriente;

import java.util.ArrayList;
import java.util.List;

public class BancoServicioImpl implements BancoServicio{

    // Lista de clientes;
    @Override
    public void listaDeClientes(BdClientes listaDeClientes) {
        // ;
    }

    // Agregar cliente;
    @Override
    public void agregarCliente(Cliente cliente) {
        ///
    }

    // Regitrarse en el banco;
    @Override
    public void registrarseEnElBanco(Cliente cliente) {
        ///
    }

    // Remover cliente;
    @Override
    public void removerCliente(Cliente cliente) {
        ///
    }

    // Abrir Caja de Ahorro;
    @Override
    public void abrirCajaAhorro(Cliente cliente, CajaAhorro cajaAhorro) {
        cajaAhorro.setTitular(cliente);
    }

    @Override
    public void abrirCuentaCorriente(Cliente cliente, CuentaCorriente cuentaCorriente) {
        cuentaCorriente.setTitular(cliente);
    }
}

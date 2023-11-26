package com.informatorio.servicio.banco;

import com.informatorio.dominio.Cliente;
import com.informatorio.dominio.CajaAhorro;
import com.informatorio.dominio.CuentaCorriente;

import java.util.ArrayList;
import java.util.List;

public class BancoServicioImpl implements BancoServicio{

    // Cargar una lista de clientes;

    private List<Cliente> clientes = new ArrayList<>();

    // Agregar cliente;
    @Override
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Remover cliente;
    @Override
    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
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

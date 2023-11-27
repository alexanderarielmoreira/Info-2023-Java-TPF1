package com.informatorio.servicio.banco;

import com.informatorio.dominio.*;
import com.informatorio.basededatos.BdClientes;

public interface BancoServicio {

    // Obtener una lista de clientes de la BD;
    public void listaDeClientes(BdClientes listaDeClientes);

    public void registrarseEnElBanco(Cliente cliente);

    public void agregarCliente(Cliente cliente);

    public void removerCliente(Cliente cliente);

    public void abrirCajaAhorro(Cliente cliente, CajaAhorro cajaAhorro);

    public void abrirCuentaCorriente(Cliente cliente, CuentaCorriente cuentaCorriente);

}

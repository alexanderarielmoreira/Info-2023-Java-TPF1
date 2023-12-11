package com.informatorio.servicio.banco;

import com.informatorio.dominio.*;
import com.informatorio.basededatos.BdClientes;

public interface BancoServicio {

    // Obtener una lista de clientes de la BD;
    public void listaClientesDeBD();

    // Obtener datos de un cliente por su ID:
    public void mostrarDatosCliente();

    // Agregar cliente manualmente;
    public void agregarClienteEnBD(Cliente cliente);

    // Agregar clientes por consola;
    public void agregarNuevoCliente();

    public void abrirCajaDeAhorro();

    public void abrirCuentaCorriente();

    // Agregar cuenta a cliente;
    public void agregarCuentaEnCliente(Long idClienteUser, Long idCuenta, Double saldo);

}



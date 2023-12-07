package com.informatorio.servicio.banco;

import com.informatorio.dominio.*;
import com.informatorio.basededatos.BdClientes;

public interface BancoServicio {

    // Los clientes pueden registrarse en el Banco;

    // Ofrece los servicios de:
    //          1) Abrir cuentas;
    //          2) Gestionar clientes;

    // Obtener una lista de clientes de la BD;
    public void listaClientesDeBD();

    // Obtener datos de un cliente por su ID:
    public void mostrarDatosCliente(Long id);

    // Agregar clientes;
    public void agregarNuevoCliente(Long id, String nombre, String domicilio);

    public void abrirCajaDeAhorro(Long id, Cliente titular, Double saldo, Double interes);

    public void abrirCuentaCorriente(Long id, Cliente titular, Double saldo, Double limiteSobregiro);

}

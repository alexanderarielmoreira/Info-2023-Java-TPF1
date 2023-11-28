package com.informatorio.servicio.banco;

import com.informatorio.dominio.*;
import com.informatorio.basededatos.BdClientes;

public interface BancoServicio {

    // Los clientes pueden registrarse en el Banco;

    // Ofrece los servicios de:
    //          1) Abrir cuentas;
    //          2) Gestionar clientes;

    // Obtener una lista de clientes de la BD;
    public void listaClientesDeBD(BdClientes baseDeDatos);

    // Agregar clientes;
    public void agregarCliente(Long clave, Cliente cliente);

    public void abrirCuenta(Long id, Cliente titular, Double saldo);

    public void exportarCSV();

}

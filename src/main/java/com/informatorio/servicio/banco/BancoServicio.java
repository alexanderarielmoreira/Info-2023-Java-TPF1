package com.informatorio.servicio.banco;

import com.informatorio.dominio.*;


public interface BancoServicio {

    public void agregarCliente(Cliente cliente);

    public void removerCliente(Cliente cliente);

    public void abrirCajaAhorro(Cliente cliente, CajaAhorro cajaAhorro);

    public void abrirCuentaCorriente(Cliente cliente, CuentaCorriente cuentaCorriente);

    // Refactorizar a una clase de archivos (files CSV);
    // public void exportarCSV();

}

package com.informatorio.servicio.cliente;

import com.informatorio.dominio.Cuenta;
import com.informatorio.dominio.Cliente;

public interface ClienteServicio {

    // Agregar;
    public void agregarCuenta(Cliente cliente, Cuenta cuenta);

    // Eliminar;
    public void eliminarCuenta(Cliente cliente, Cuenta cuenta);

    // Consultar saldo total;
    public double consultarSaldosTotales(Cliente cliente);

}

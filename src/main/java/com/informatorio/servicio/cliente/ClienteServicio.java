package com.informatorio.servicio.cliente;

import com.informatorio.dominio.Cuenta;

public interface ClienteServicio {

    public void agregarCuenta(Cuenta cuenta);

    public void eliminarCuenta(Cuenta cuenta);

    public double consultarSaldosTotales();

}

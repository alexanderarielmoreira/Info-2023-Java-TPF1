package com.informatorio.servicio.cuenta;

import com.informatorio.dominio.Cliente;
import com.informatorio.dominio.Cuenta;

public interface CuentaServicio {

    // Agregar cuenta;
    public void agregarCuenta();

    // Eliminar cuenta;
    public void eliminarCuenta();

    // Consultar saldo de una cuenta;
    public void consultarSaldo(); 

    // Consultar saldo total de la cuenta;
    public void consultarSaldosTotales();

    // Deposita dinero en una cuenta;
    public void depositar();

    // Extraer dinero de una cuenta;
    public void extraer();

}

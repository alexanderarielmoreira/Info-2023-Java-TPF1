package com.informatorio.servicio.cliente;

import com.informatorio.dominio.Cliente;
import com.informatorio.dominio.Cuenta;

public class ClienteServicioImpl extends Cliente implements ClienteServicio {

    public static final String MENSAJE_SALDO_TOTAL_CUENTAS = "El saldo total de sus cuentas " +
                                                             "asciende a la suma de Pesos ($):";

    // Agregar cuenta;
    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    // Eliminar cuenta;
    public void eliminarCuenta(Cuenta cuenta) { cuentas.remove(cuenta);}

    public double consultarSaldosTotales() {
        double saldoTotal = 0;
        for (Cuenta cuenta : cuentas) {
            saldoTotal += cuenta.getSaldo();
        }
        System.out.println(MENSAJE_SALDO_TOTAL_CUENTAS);
        return + saldoTotal;
    }

}

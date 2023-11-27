package com.informatorio.servicio.cliente;

import com.informatorio.dominio.Cliente;
import com.informatorio.dominio.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class ClienteServicioImpl implements ClienteServicio {

    public static final String MENSAJE_SALDO_TOTAL_CUENTAS = "El saldo total de sus cuentas " +
                                                             "asciende a la suma de Pesos ($):";

    // Agregar cuenta;
    @Override
    public  void agregarCuenta(Cliente cliente, Cuenta cuenta) {
        List<Cuenta> agregarCta = new ArrayList<>();
        agregarCta.add(cuenta);
        cliente.setCuentas(agregarCta);
    }

    // Eliminar cuenta;
    @Override
    public void eliminarCuenta(Cliente cliente, Cuenta cuenta) {
        List<Cuenta> eliminarCta = new ArrayList<>();
        eliminarCta.remove(cuenta);
        cliente.setCuentas(eliminarCta);
    }

    public double consultarSaldosTotales(Cliente cliente) {

        double saldoTotal = 0;

        List<Cuenta> listaDeCuentas = new ArrayList<>();
        listaDeCuentas = cliente.getCuentas();

        for (Cuenta cuenta : listaDeCuentas) {
            saldoTotal += cuenta.getSaldo();
        }
        System.out.println(MENSAJE_SALDO_TOTAL_CUENTAS);
        return + saldoTotal;
    }

}

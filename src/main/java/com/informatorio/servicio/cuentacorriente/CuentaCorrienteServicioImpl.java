package com.informatorio.servicio.cuentacorriente;

import com.informatorio.basededatos.BdClientes;
import com.informatorio.dominio.Cliente;
import com.informatorio.dominio.CuentaCorriente;
import com.informatorio.entrada.IngresoPorConsola;

public class CuentaCorrienteServicioImpl implements CuentaCorrienteServicio {

    public static final String MENSAJE_ALERTA_LIMITE_SOBREGIRO = "No se puede realizar el " +
            "retiro de dinero porque ha excedido " +
            "el limite de sobregiro";

    // Abre una nueva Cuenta Corriente;
    @Override
    public void abrirCuentaCorriente() {
        CuentaCorriente cuentaCorriente = new CuentaCorriente();

        System.out.println("Crear Cuenta Corriente: \n" +
                "Ingrese el Número Único de Identificación: ");
        Long idCtaCte = IngresoPorConsola.getScanner().nextLong();
        cuentaCorriente.setId(idCtaCte);

        System.out.println("Ingrese el monto de dinero a depositar: ");
        Double saldoUser = IngresoPorConsola.getScanner().nextDouble();
        cuentaCorriente.setSaldo(saldoUser);

        cuentaCorriente.setLimiteSobregiro(300000.00);

        System.out.println("CUENTA CORRIENTE:");
        System.out.println("Identificación: " + cuentaCorriente.getId());
        System.out.println("Saldo: $ " + cuentaCorriente.getSaldo());
        System.out.println("Límite de sobregiro: " + cuentaCorriente.getLimiteSobregiro());

    }

    @Override
    public void retirarConLimiteDeSobregiro() {
        System.out.println("Ingrese el ID del cliente cuya Cuenta Corriente desea extraer dinero con eventual sobregiro:");
        Long idCliente = IngresoPorConsola.getScanner().nextLong();
        System.out.println("Ingrese el monto de dinero a retirar: ");
        double monto = IngresoPorConsola.getScanner().nextDouble();
        for (Cliente cliente : BdClientes.getBdClientesBancarios()) {
            if (idCliente.equals(cliente.getId())) {
                System.out.println("Saldo actual: $ " + cliente.getCuentas().get(1).getSaldo());
                System.out.println("Límite de sobregiro: $ 200.000,00");
                double saldoActual = cliente.getCuentas().get(1).getSaldo();
                double limiteDeSobregiro = 200000.00;
                if (monto <= saldoActual + limiteDeSobregiro) {
                    cliente.getCuentas().get(1).setSaldo(saldoActual - monto);
                    System.out.println("Saldo actualizado: $ " + cliente.getCuentas().get(1).getSaldo());
                } else {
                    System.out.println(MENSAJE_ALERTA_LIMITE_SOBREGIRO);
                }
                break;

            }
        }
    }
}
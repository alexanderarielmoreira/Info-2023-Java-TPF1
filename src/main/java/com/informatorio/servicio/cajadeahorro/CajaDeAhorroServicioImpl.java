package com.informatorio.servicio.cajadeahorro;

import com.informatorio.basededatos.BdClientes;
import com.informatorio.dominio.CajaAhorro;
import com.informatorio.dominio.Cliente;
import com.informatorio.entrada.IngresoPorConsola;

public class CajaDeAhorroServicioImpl implements CajaDeAhorroService{

    // Abre una Caja de ahorro;
    @Override
    public void abrirCajaDeAhorro() {
        // Se crea la nueva C.A;
        CajaAhorro cajaAhorro = new CajaAhorro();

        System.out.println("Crear Caja de Ahorros\n" +
                "Ingrese el Número Único de Identificación: ");
        Long idCa = IngresoPorConsola.getScanner().nextLong();
        cajaAhorro.setId(idCa);

        System.out.println("Ingrese el monto de dinero a depositar: ");
        Double saldoUser = IngresoPorConsola.getScanner().nextDouble();
        cajaAhorro.setSaldo(saldoUser);

        // Intereses a ganar por el cliente;
        cajaAhorro.setInteres(8.27);

        System.out.println("CAJA DE AHORRO:");
        System.out.println("Identificación: " + cajaAhorro.getId());
        System.out.println("Saldo: $ " + cajaAhorro.getSaldo());
        System.out.println("Porcentaje de interés a favor del cliente: " + cajaAhorro.getInteres() + "%");

    }

    // Calcular intereses;
    public void calcularInteres() {
        System.out.println("Ingrese el ID del cliente cuyos intereses de su Caja de Ahorros desea calcular:");
        Long idCliente = IngresoPorConsola.getScanner().nextLong();
        for ( Cliente cliente : BdClientes.getBdClientesBancarios() ) {
            if (idCliente.equals(cliente.getId())){
                System.out.println("Saldo actual: $ " + cliente.getCuentas().get(0).getSaldo());
                System.out.println("Tasa de interés aplicable: 8,34 %");
                double interes = ((cliente.getCuentas().get(0).getSaldo() * 8.34) / 100);
                System.out.println("Intereses ganados: " + interes);
                double saldoMasInteres = cliente.getCuentas().get(0).getSaldo() + interes;
                System.out.println("Saldo con intereses: $ " + saldoMasInteres);
                break;

            }
        }

    }

}

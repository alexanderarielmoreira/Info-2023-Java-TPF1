package com.informatorio.basededatos;

import com.informatorio.dominio.CajaAhorro;
import com.informatorio.dominio.Cliente;
import com.informatorio.dominio.Cuenta;
import com.informatorio.dominio.CuentaCorriente;

import java.util.ArrayList;
import java.util.List;

public class BdClientes {
    public static List<Cliente> clientes = iniciarClientes();

    public static List<Cliente> iniciarClientes() {

        // Clientes;
        Cliente cliente1 = new Cliente(1L, "Pedro Sanchez", "San Martin 1452");
        Cliente cliente2 = new Cliente(2L, "Simón Fernandez", "Seitor 123");
        Cliente cliente3 = new Cliente(3L, "Roberto Vallejos", "Juan Pablo Duarte 1417");
        Cliente cliente4 = new Cliente(4L, "Beatriz Gomez", "Honduras 1267");
        Cliente cliente5 = new Cliente(5L, "Claudio Lampertti", "Galápagos 1527");
        Cliente cliente6 = new Cliente(6L, "Romina Piteri", "San Bueventura 345");
        Cliente cliente7 = new Cliente(7L, "Norberto Napolitano", "Salguero 678");
        Cliente cliente8 = new Cliente(8L, "Ramón Romero Feris", "Los Chorrillos 56");
        Cliente cliente9 = new Cliente(9L, "Liliana Bettina", "Italia 234");
        Cliente cliente10 = new Cliente(10L, "Flavio Mendoza", "Palazzo 2278");

        // Cuenta;
        Cuenta cuenta1 = new Cuenta(1111L, cliente1, 1000000.00);
        Cuenta cuenta2 = new Cuenta(1112L, cliente1, 2000000.00);
        CuentaCorriente cuentaCorriente3 = new CuentaCorriente(1113L, cliente1, 300000.00, 100000.00);
        CajaAhorro cajaAhorro4 = new CajaAhorro(1114L, cliente1, 500000.00, 8.41);

        // Lista de cuentas del cliente 1;
        List<Cuenta> listaDeCuentasCliente1 = new ArrayList<>();
        listaDeCuentasCliente1.add(cuenta1);
        listaDeCuentasCliente1.add(cuenta2);
        listaDeCuentasCliente1.add(cuentaCorriente3);
        listaDeCuentasCliente1.add(cajaAhorro4);

        // Asiganción de Cuenta a Cliente;
        cliente1.setCuentas(listaDeCuentasCliente1);

        // Cajas de ahorros;
        CajaAhorro cajaAhorro1 = new CajaAhorro(11L, cliente1, 100000.00, 2.61);
        CajaAhorro cajaAhorro2 = new CajaAhorro(12L, cliente2, 200000.00, 2.61);
        CajaAhorro cajaAhorro3 = new CajaAhorro(13L, cliente3, 300000.00, 2.61);
        CajaAhorro cajaAhorro44 = new CajaAhorro(14L, cliente4, 400000.00, 2.61);
        CajaAhorro cajaAhorro5 = new CajaAhorro(15L, cliente5, 500000.00, 2.61);
        CajaAhorro cajaAhorro6 = new CajaAhorro(16L, cliente6, 600000.00, 2.61);
        CajaAhorro cajaAhorro7 = new CajaAhorro(17L, cliente7, 700000.00, 2.61);
        CajaAhorro cajaAhorro8 = new CajaAhorro(18L, cliente8, 800000.00, 2.61);
        CajaAhorro cajaAhorro9 = new CajaAhorro(19L, cliente9, 900000.00, 2.61);
        CajaAhorro cajaAhorro10 = new CajaAhorro(20L, cliente10, 1000000.00, 2.61);

        // Cuentas Corrientes;
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(111L, cliente1, 300000.00, 300000.00);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente(112L, cliente2, 400000.00, 300000.00);
        CuentaCorriente cuentaCorriente33 = new CuentaCorriente(113L, cliente3, 500000.00, 300000.00);
        CuentaCorriente cuentaCorriente4 = new CuentaCorriente(114L, cliente3, 600000.00, 300000.00);
        CuentaCorriente cuentaCorriente5 = new CuentaCorriente(115L, cliente4, 700000.00, 300000.00);
        CuentaCorriente cuentaCorriente6 = new CuentaCorriente(116L, cliente5, 800000.00, 300000.00);
        CuentaCorriente cuentaCorriente7 = new CuentaCorriente(117L, cliente6, 900000.00, 300000.00);
        CuentaCorriente cuentaCorriente8 = new CuentaCorriente(118L, cliente7, 1000000.00, 300000.00);
        CuentaCorriente cuentaCorriente9 = new CuentaCorriente(119L, cliente8, 110000.00, 300000.00);
        CuentaCorriente cuentaCorriente10 = new CuentaCorriente(120L, cliente9, 1200000.00, 300000.00);

        // Asignación de cuentas a cliente2;
        cliente2.setCuentaUnica(cajaAhorro2);
        cliente2.setCuentaUnica(cuentaCorriente2);

        clientes = List.of(cliente1, cliente2, cliente3, cliente4, cliente5, cliente6, cliente7, cliente8, cliente9, cliente10);

        return clientes;

    }

    // Muestra los elementos de la lista clientes:
    public static void getClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("ID: " + cliente.getId() + " | Nombre: " + cliente.getNombre() +
                    " | Domicilio: " + cliente.getDomicilio());
        }
    }

    // Muestra un cliente determinado, ingresando su id:

    public static void getClientePorId (Long id){
        for (Cliente cliente : clientes) {
            if (id.equals(cliente.getId())) {
                System.out.println("ID: " + cliente.getId());
                System.out.println("Nombre: " + cliente.getNombre());

                for (Cuenta cuenta : cliente.getCuentas()) {
                    System.out.println("Cuenta N° " + cuenta.getId());
                    System.out.println("Saldo: $ " + cuenta.getSaldo());
                    Class<?> tipo = cuenta.getClass();
                    System.out.println("Tipo de cuenta: " + tipo.getSimpleName());
                    System.out.println("* * * * * * * * * * * * * * * * *");
                }
            }
        }
    }

}
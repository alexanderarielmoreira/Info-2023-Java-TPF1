package com.informatorio.basededatos;

import com.informatorio.dominio.CajaAhorro;
import com.informatorio.dominio.Cliente;
import com.informatorio.dominio.CuentaCorriente;
import com.informatorio.entrada.IngresoPorConsola;
import com.informatorio.servicio.banco.BancoServicioImpl;

public class DatosDeClientesBancarios extends BancoServicioImpl {
    BancoServicioImpl bancoServicioImpl1 = new BancoServicioImpl();
    public void cargarDatos() {

        // Carga de datos;

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
        cliente1.setCuentaUnica(cajaAhorro1);
        cliente1.setCuentaUnica(cuentaCorriente1);

        cliente2.setCuentaUnica(cajaAhorro2);
        cliente2.setCuentaUnica(cuentaCorriente2);

        cliente3.setCuentaUnica(cajaAhorro3);
        cliente3.setCuentaUnica(cuentaCorriente33);

        cliente4.setCuentaUnica(cajaAhorro44);
        cliente4.setCuentaUnica(cuentaCorriente4);

        cliente5.setCuentaUnica(cajaAhorro5);
        cliente5.setCuentaUnica(cuentaCorriente5);

        cliente6.setCuentaUnica(cajaAhorro6);
        cliente6.setCuentaUnica(cuentaCorriente6);

        cliente7.setCuentaUnica(cajaAhorro7);
        cliente7.setCuentaUnica(cuentaCorriente7);

        cliente8.setCuentaUnica(cajaAhorro8);
        cliente8.setCuentaUnica(cuentaCorriente8);

        cliente9.setCuentaUnica(cajaAhorro9);
        cliente9.setCuentaUnica(cuentaCorriente9);

        cliente10.setCuentaUnica(cajaAhorro10);
        cliente10.setCuentaUnica(cuentaCorriente10);

        bancoServicioImpl1.agregarClienteEnBD(cliente1);
        bancoServicioImpl1.agregarClienteEnBD(cliente2);
        bancoServicioImpl1.agregarClienteEnBD(cliente3);
        bancoServicioImpl1.agregarClienteEnBD(cliente4);
        bancoServicioImpl1.agregarClienteEnBD(cliente5);
        bancoServicioImpl1.agregarClienteEnBD(cliente6);
        bancoServicioImpl1.agregarClienteEnBD(cliente7);
        bancoServicioImpl1.agregarClienteEnBD(cliente8);
        bancoServicioImpl1.agregarClienteEnBD(cliente9);
        bancoServicioImpl1.agregarClienteEnBD(cliente10);

        // Muestra todos los clientes de la bd;
        bancoServicioImpl1.listaClientesDeBD();

        // Muestra las cuentas asociadas mediante el ingreso de su id;
        System.out.println("\n Ver cuentas asociadas a los clientes: \n");
        bancoServicioImpl1.mostrarDatosCliente();

    }

}


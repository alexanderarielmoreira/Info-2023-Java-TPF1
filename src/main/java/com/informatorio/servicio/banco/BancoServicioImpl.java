package com.informatorio.servicio.banco;

import com.informatorio.basededatos.BdClientes;
import com.informatorio.dominio.Cliente;
import com.informatorio.dominio.Cuenta;
import com.informatorio.servicio.cajadeahorro.CajaDeAhorroServicioImpl;
import com.informatorio.servicio.cliente.ClienteServicioImpl;
import com.informatorio.entrada.IngresoPorConsola;
import com.informatorio.servicio.cuentacorriente.CuentaCorrienteServicioImpl;

public class BancoServicioImpl implements BancoServicio {

    // Muestra datos de un cliente por su ID:
    @Override
    public void mostrarDatosClientePorID() {
        System.out.println("Ingrese el N° de ID del cliente: ");
        Long idUser = IngresoPorConsola.getScanner().nextLong();
        System.out.println("DATOS DEL CLIENTE: ");
        for (Cliente cliente : BdClientes.getBdClientesBancarios()) {
            if (idUser.equals(cliente.getId())) {
                System.out.println("ID: " + cliente.getId());
                System.out.println("Nombre: " + cliente.getNombre());
                if (cliente.getCuentas() != null && !cliente.getCuentas().isEmpty()) {
                    for (Cuenta cuenta : cliente.getCuentas()) {
                        System.out.println("Cuenta N° " + cuenta.getId());
                        System.out.println("Saldo: $ " + cuenta.getSaldo());
                        Class<?> tipo = cuenta.getClass();
                        System.out.println("Tipo de cuenta: " + tipo.getSimpleName());
                        System.out.println(":::::::::::::::::::::::::::::::::::::::");
                    }
                } else {
                    System.out.println("No existen cuentas asociadas al cliente: " + cliente.getNombre());
                }

            }
        }
    }

    // Registra (crea) un nuevo cliente:
    // Falta indexar las cuentas creadas a las cuentas del nuevo cliente!!!
    @Override
    public void registrarseEnBanco() {
        // Crear cliente;
        ClienteServicioImpl crearCliente = new ClienteServicioImpl();
        crearCliente.agregarNuevoCliente();
        // Agregarle C.A;
        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        System.out.println("REGISTRO EXITOSO.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Apertura de nueva CAJA DE AHORROS:");
        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        CajaDeAhorroServicioImpl agregarCA = new CajaDeAhorroServicioImpl();
        agregarCA.abrirCajaDeAhorro();
        // Agregarle Cta. Cte;
        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        System.out.println("CAJA DE AHORRO CREADA.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Apertura de nueva CUENTA CORRIENTE:");
        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        CuentaCorrienteServicioImpl agregarCtaCte = new CuentaCorrienteServicioImpl();
        agregarCtaCte.abrirCuentaCorriente();
        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        System.out.println("CUENTA CORRIENTE CREADA.");
        System.out.println(":::::::: PROCESO FINALIZADO ::::::::");
    }

}

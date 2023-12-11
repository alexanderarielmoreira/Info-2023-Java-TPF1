package com.informatorio.servicio.banco;

import com.informatorio.basededatos.BdClientes;
import com.informatorio.dominio.CajaAhorro;
import com.informatorio.dominio.Cliente;
import com.informatorio.dominio.Cuenta;
import com.informatorio.dominio.CuentaCorriente;
import com.informatorio.entrada.IngresoPorConsola;

import java.util.List;

public class BancoServicioImpl implements BancoServicio {
    BdClientes bdClientesBancarios = new BdClientes();

    // Muestra una lista de clientes bancarios traidos desde la base de datos;
    @Override
    public void listaClientesDeBD() {
        System.out.println("CLIENTES BANCARIOS EN BASE DE DATOS:");
        for (Cliente cliente : bdClientesBancarios.getBdClientesBancarios()) {
            System.out.println("ID: " + cliente.getId() + " | Nombre: " + cliente.getNombre() +
                    " | Domicilio: " + cliente.getDomicilio());
        }
    }

    // Muestra datos de un cliente por su ID:
    @Override
    public void mostrarDatosCliente() {
        System.out.println("Ingrese el N° de ID del cliente: ");
        Long idUser = IngresoPorConsola.getScanner().nextLong();
        System.out.println("DATOS DEL CLIENTE: ");
        for (Cliente cliente : bdClientesBancarios.getBdClientesBancarios()) {
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

    // Agrega un cliente manualmente;
    @Override
    public void agregarClienteEnBD(Cliente cliente) {
        bdClientesBancarios.setBdCliente(cliente);
    }

    // Agrega los datos de un nuevo cliente ingresados desde la consola;
    @Override
    public void agregarNuevoCliente() {
        // Se crea el nuevo cliente;
        Cliente cliente = new Cliente();

        System.out.println("Ingrese el número de Identifiación: ");
        Long identicacion = IngresoPorConsola.getScanner().nextLong();
        IngresoPorConsola.getScanner().nextLine();
        cliente.setId(identicacion);

        System.out.println("Ingrese su nombre y apellido: ");
        String nombreUser = IngresoPorConsola.getScanner().nextLine();
        cliente.setNombre(nombreUser);

        System.out.println("Ingrese su domicilio actual: ");
        String domicilioUser = IngresoPorConsola.getScanner().nextLine();
        cliente.setDomicilio(domicilioUser);

        // Se agrega el cliente a la lista de la BD;
        bdClientesBancarios.setBdCliente(cliente);

        System.out.println("Identificación: " + cliente.getId());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Domicilio: " + cliente.getDomicilio());

    }

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
        //System.out.println("Titular de cuenta: " + cajaAhorro.getTitular().getNombre());
        System.out.println("Saldo: $ " + cajaAhorro.getSaldo());
        System.out.println("Porcentaje de interés a favor del cliente: " + cajaAhorro.getInteres() + "%");

    }

    // Abrir una nueva Cuenta Corriente:
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
        //System.out.println("Titular de cuenta: " + cuentaCorriente.getTitular().getNombre());
        System.out.println("Saldo: $ " + cuentaCorriente.getSaldo());
        System.out.println("Límite de sobregiro: " + cuentaCorriente.getLimiteSobregiro());

    }

    // Agregar cuenta a cliente (Le falta poder ingrsarlo por consola);
    // VER POR QUE NO FUNCIONA ???
    @Override
    public void agregarCuentaEnCliente(Long idClienteUser, Long idCuenta, Double saldo) {
        for (Cliente cliente : bdClientesBancarios.getBdClientesBancarios()) {
            if (idClienteUser.equals(cliente.getId())) {
                Cuenta cuenta = new Cuenta();
                cuenta.setId(idCuenta);
                cuenta.setSaldo(saldo);
                cliente.setCuentaUnica(cuenta);
                System.out.println("Cuentas relacionadas al titular " + cliente.getNombre());
                for (Cuenta c : cliente.getCuentas()) {
                    System.out.println("Cuenta N° " + c.getId());
                    System.out.println("Saldo: $ " + c.getSaldo());
                }
            } else if ( !idClienteUser.equals(cliente.getId())){
                System.out.println("El id no coincide con ningún cliente registrado.");
                return;
            }
        }
    }
}

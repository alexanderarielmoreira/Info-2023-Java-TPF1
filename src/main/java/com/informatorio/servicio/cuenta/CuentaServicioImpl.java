package com.informatorio.servicio.cuenta;

import com.informatorio.basededatos.BdClientes;
import com.informatorio.dominio.Cliente;
import com.informatorio.dominio.Cuenta;
import com.informatorio.entrada.IngresoPorConsola;

public class CuentaServicioImpl implements CuentaServicio {

    // Agrega una cuenta a un cliente registrado;
    @Override
    public void agregarCuenta() {
        System.out.println("Ingrese el ID del cliente buscado: ");
        Long idCliente = IngresoPorConsola.getScanner().nextLong();
        for ( Cliente c :  BdClientes.getBdClientesBancarios()) {
            if(idCliente.equals(c.getId())) {
                System.out.println("Ingrese un nuevo Identificador para la cuenta: ");
                Long idCuenta = IngresoPorConsola.getScanner().nextLong();
                Cuenta cuenta = new Cuenta();
                cuenta.setId(idCuenta);
                System.out.println("Ingrese el monto de dinero a depositar en el saldo: ");
                Double saldoCuenta = IngresoPorConsola.getScanner().nextDouble();
                cuenta.setSaldo(saldoCuenta);
                c.setCuentaUnica(cuenta);
                System.out.println("Cuentas asociadas al titular del ID: \n");
                for ( Cuenta cuen : c.getCuentas()) {
                    System.out.println("Nombre: " + c.getNombre());
                    System.out.println("Domicilio: " + c.getDomicilio());
                    Class<?> tipo = cuen.getClass();
                    System.out.println("Tipo de cuenta: " + tipo.getSimpleName());
                    System.out.println("Saldo: $ " + cuen.getSaldo());
                }
            } else {
                System.out.println("Cliente no registrado");
            }
        }
    }

    // Elimina una cuenta;
    @Override
    public void eliminarCuenta() {
        System.out.println("Ingrese el ID del cliente cuya cuenta quiere eliminar: ");
        Long idCliente = IngresoPorConsola.getScanner().nextLong();
        for ( Cliente c :  BdClientes.getBdClientesBancarios()) {
            if( idCliente.equals(c.getId()) ) {
                for (  Cuenta cuenta:  c.getCuentas() ) {
                    System.out.println("Titular: " + c.getNombre());
                    System.out.println("ID de la cuenta: " + cuenta.getId());
                    System.out.println("Saldo: $ " + cuenta.getSaldo());
                }
                System.out.println("- Indice de cuentas existentes: -");
                for (int i = 0; i < c.getCuentas().size(); i++) {
                    System.out.println("Indice de cuenta: N° " + i);
                }
                System.out.println("Ingrese el índice correspondiente para eliminar la cuenta: ");
                int index = IngresoPorConsola.getScanner().nextInt();
                c.getCuentas().remove(index);
                System.out.println("Estado actualizado de cuentas: ");
                for (  Cuenta cuenta:  c.getCuentas()) {
                    System.out.println("Titular: " + c.getNombre());
                    System.out.println("ID de la cuenta: " + cuenta.getId());
                    System.out.println("Saldo: $ " + cuenta.getSaldo());
                }
            }
        }

    }

    // Consultar saldo;
    @Override
    public void consultarSaldo() {
        System.out.println("Ingrese el ID del cliente cuyo saldo/s desea saber: ");
        Long id = IngresoPorConsola.getScanner().nextLong();
        for (Cliente cliente : BdClientes.getBdClientesBancarios()) {
            if (id.equals(cliente.getId())) {
                System.out.println("Cliente: " + cliente.getNombre() + " | " + "Id: " + cliente.getId());
                for (Cuenta cuenta : cliente.getCuentas()) {
                    System.out.println("Saldo: $ " + cuenta.getSaldo());
                }
            }
        }
    }

    // Suma todos los saldos de las cuentas del cliente;
    public void consultarSaldosTotales() {
        double saldoTotal = 0;
        System.out.println("Ingrese el ID del cliente para saber su saldo total de cuentas: ");
        Long idCliente = IngresoPorConsola.getScanner().nextLong();
        for ( Cliente cliente :  BdClientes.getBdClientesBancarios()) {
            if (idCliente.equals(cliente.getId())){
                for ( Cuenta cuenta : cliente.getCuentas()) {
                    saldoTotal += cuenta.getSaldo();
                }
                System.out.println("Cliente: " + cliente.getNombre() + " | " + "Id: " + cliente.getId());
                for ( Cuenta cuenta : cliente.getCuentas() ) {
                    System.out.println("Saldo: $ " + cuenta.getSaldo());
                }
                System.out.println("Saldos totales: $ " + saldoTotal);
            }
        }
    }

    // Depositar Pesos en cuenta;
    public void depositar() {
        System.out.println("Ingrese el ID del cliente al que desea depositar dinero: ");
        Long idCliente = IngresoPorConsola.getScanner().nextLong();
        for (Cliente cliente : BdClientes.getBdClientesBancarios()){
            if(idCliente.equals(cliente.getId())){
                System.out.println("LISTA DE CUENTAS DE " + cliente.getNombre().toUpperCase() + ":");
                for ( Cuenta cuenta: cliente.getCuentas() ) {
                    System.out.println("Cuenta N° " + cuenta.getId() + " | " + "Saldo: " + cuenta.getSaldo() + " | ");
                    Class<?> tipo = cuenta.getClass();
                    System.out.println("Tipo de cuenta: " + tipo.getSimpleName());
                }

                System.out.println("Ingrese el monto a depositar en la PRIMER cuenta: ");
                Double deposito = IngresoPorConsola.getScanner().nextDouble();

                for ( Cuenta cuenta : cliente.getCuentas()) {
                    cuenta.setSaldo(cuenta.getSaldo() + deposito);
                    break;
                }

                System.out.println("Saldo actualizado de Cuenta:");
                for (  Cuenta cuenta: cliente.getCuentas()  ) {
                    System.out.println("Cuenta N° " + cuenta.getId() + " | " + "Saldo: " + cuenta.getSaldo());
                    System.out.println(":::::::::::::::::::::::::::::::::");
                    break;
                }

                }
            }
    }

    // Extraer dinero de una cuenta;
    @Override
    public void extraer() {
        System.out.println("Ingrese el ID del cliente de cuya cuenta se quiere EXTRAER dinero: ");
        Long idCliente = IngresoPorConsola.getScanner().nextLong();
        for (Cliente cliente : BdClientes.getBdClientesBancarios()){
            if(idCliente.equals(cliente.getId())){
                System.out.println("LISTA DE CUENTAS DE " + cliente.getNombre().toUpperCase() + ":");
                for ( Cuenta cuenta: cliente.getCuentas() ) {
                    System.out.println("Cuenta N° " + cuenta.getId() + " | " + "Saldo: " + cuenta.getSaldo() + " | ");
                    Class<?> tipo = cuenta.getClass();
                    System.out.println("Tipo de cuenta: " + tipo.getSimpleName());
                }

                System.out.println("Ingrese el monto a EXTRAER de la PRIMERA cuenta listada: ");
                Double deposito = IngresoPorConsola.getScanner().nextDouble();

                for ( Cuenta cuenta : cliente.getCuentas()) {
                    cuenta.setSaldo(cuenta.getSaldo() - deposito);
                    break;
                }

                System.out.println("Saldo actualizado de Cuenta:");
                for (  Cuenta cuenta: cliente.getCuentas()  ) {
                    System.out.println("Cuenta N° " + cuenta.getId() + " | " + "Saldo: " + cuenta.getSaldo());
                    System.out.println(":::::::::::::::::::::::::::::::::");
                    break;
                }

            }
        }

    }
}







package com.informatorio.servicio.banco;

import com.informatorio.basededatos.BdClientes;
import com.informatorio.dominio.CajaAhorro;
import com.informatorio.dominio.Cliente;
import com.informatorio.dominio.CuentaCorriente;

public class BancoServicioImpl implements BancoServicio{

    // Muestra una una lista de clientes bancarios;
    @Override
    public void listaClientesDeBD() {
        System.out.println("CLIENTES BANCARIOS EN BASE DE DATOS:");
        BdClientes.getClientes();
    }

    // Muestra datos de un cliente por su ID:
    @Override
    public void mostrarDatosCliente(Long id) {
        System.out.println("DATOS DEL CLIENTE: ");
        BdClientes.getClientePorId(id);
    }

    @Override
    public void agregarNuevoCliente(Long id, String nombre, String domicilio) {
        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNombre(nombre);
        cliente.setDomicilio(domicilio);

        System.out.println("Identificación: " + cliente.getId());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Domicilio: " + cliente.getDomicilio());
    }

    @Override
    public void abrirCajaDeAhorro(Long id, Cliente titular, Double saldo, Double interes) {
        CajaAhorro cajaAhorro = new CajaAhorro();
        cajaAhorro.setId(id);
        cajaAhorro.setTitular(titular);
        cajaAhorro.setSaldo(saldo);
        cajaAhorro.setInteres(interes);

        System.out.println("CAJA DE AHORRO:");
        System.out.println("Identificación: " + cajaAhorro.getId());
        System.out.println("Titular de cuenta: " + cajaAhorro.getTitular().getNombre());
        System.out.println("Saldo: $ " + cajaAhorro.getSaldo());
        System.out.println("Porcentaje de interés a favor del cliente: " + cajaAhorro.getInteres() + "%");

    }

    @Override
    public void abrirCuentaCorriente(Long id, Cliente titular, Double saldo, Double limiteSobregiro) {
        CuentaCorriente cuentaCorriente = new CuentaCorriente();
        //// CONTINUAR DESDE ACA!!!

    }
}

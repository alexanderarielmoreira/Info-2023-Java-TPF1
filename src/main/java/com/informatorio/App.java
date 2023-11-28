package com.informatorio;

import com.informatorio.basededatos.BdClientes;
import com.informatorio.dominio.CajaAhorro;
import com.informatorio.dominio.Cliente;
import com.informatorio.servicio.cliente.ClienteServicioImpl;
import com.informatorio.servicio.banco.BancoServicio;
import com.informatorio.servicio.banco.BancoServicioImpl;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main( String[] args ) {

        BdClientes.iniciarClientes();

        System.out.println("Id: " + BdClientes.getClientePorId(6L).getId());
        System.out.println("Nombre: " + BdClientes.getClientePorId(6L).getNombre());
        System.out.println("Domicilio: " + BdClientes.getClientePorId(6L).getDomicilio());
        System.out.println("Cuentas: " + BdClientes.getClientePorId(6L).getCuentas());


    }
}

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
        BancoServicioImpl bancoServicioImpl = new BancoServicioImpl();
        bancoServicioImpl.listaClientesDeBD();
        bancoServicioImpl.mostrarDatosCliente(1L);

        /*
        System.out.println("Id: " + BdClientes.getClientePorId(1L).getId());
        System.out.println("Nombre: " + BdClientes.getClientePorId(1L).getNombre());
        System.out.println("Domicilio: " + BdClientes.getClientePorId(1L).getDomicilio());
        // Me dice si el cliente 1 tiene o no vacia su lista de cuestas. Da false;
        System.out.println("Cuentas: " + BdClientes.getClientePorId(1L).getCuentas().isEmpty());
        */

    }
}

package com.informatorio;

import com.informatorio.basededatos.BdClientes;
import com.informatorio.dominio.CajaAhorro;
import com.informatorio.dominio.Cliente;
import com.informatorio.dominio.Cuenta;
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
        System.out.println("--------------------------------------------------");
        bancoServicioImpl.mostrarDatosCliente(1L);
        System.out.println("--------------------------------------------------");
        bancoServicioImpl.mostrarDatosCliente(2L);

    }
}

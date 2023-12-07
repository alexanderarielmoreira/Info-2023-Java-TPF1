package com.informatorio;

import com.informatorio.basededatos.BdClientes;
import com.informatorio.dominio.CajaAhorro;
import com.informatorio.dominio.Cliente;
import com.informatorio.dominio.Cuenta;
import com.informatorio.dominio.CuentaCorriente;
import com.informatorio.servicio.cliente.ClienteServicioImpl;
import com.informatorio.servicio.banco.BancoServicio;
import com.informatorio.servicio.banco.BancoServicioImpl;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main( String[] args ) {

        Cliente clienteAriel = new Cliente(99L,"Ariel Moreira","calle Salta N° 1420");
        CajaAhorro cajaAhorro1 = new CajaAhorro(6457L,clienteAriel,500000.00,9.84);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(898L,clienteAriel,900000.00,200000.00);

        BdClientes.iniciarClientes();
        BancoServicioImpl bancoServicioImpl = new BancoServicioImpl();
        bancoServicioImpl.listaClientesDeBD();
        System.out.println("--------------------------------------------------");
        bancoServicioImpl.mostrarDatosCliente(1L);
        System.out.println("--------------------------------------------------");
        bancoServicioImpl.mostrarDatosCliente(2L);
        System.out.println("--------------------------------------------------");
        bancoServicioImpl.agregarNuevoCliente(45325L, "Carlos Montero","Pasaje De Los Patos N° 234. Resistencia, Chaco");
        System.out.println("--------------------------------------------------");
        bancoServicioImpl.abrirCajaDeAhorro(25362L,clienteAriel,500000.00,8.42);
        System.out.println("--------------------------------------------------");
        System.out.println(cajaAhorro1.calcularInteres());
        System.out.println("--------------------------------------------------");
        System.out.println(cajaAhorro1.retirar(50000.00));
        System.out.println("--------------------------------------------------");
        cuentaCorriente1.retirar(1200000.00);
        System.out.println("--------------------------------------------------");


        }

    }



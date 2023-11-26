package com.informatorio.basededatos;

import com.informatorio.dominio.CajaAhorro;
import com.informatorio.dominio.Cliente;

import java.util.List;

public class BdClientes {

    public static List<Cliente> clientes = iniciarClientes();

    public static List<Cliente> iniciarClientes() {

        Cliente cliente1 = new Cliente(1L,"Pedro Sanchez","San Martin 1452");
        Cliente cliente2 = new Cliente(2L,"Simón Fernandez","Seitor 123");
        Cliente cliente3 = new Cliente(3L,"Roberto Vallejos","Juan Pablo Duarte 1417");
        Cliente cliente4 = new Cliente(4L,"Beatriz Gomez","Honduras 1267");
        Cliente cliente5 = new Cliente(5L,"Claudio Lampertti","Galápagos 1527");
        Cliente cliente6 = new Cliente(6L,"Romina Puttina","San Bullo 345");
        Cliente cliente7 = new Cliente(7L,"Norberto Napolitano","Salguero 678");
        Cliente cliente8 = new Cliente(8L,"Ramon Romero Feris","Los Chorrillos 56");
        Cliente cliente9 = new Cliente(9L,"Liliana Bettina","Italia 234");
        Cliente cliente10 = new Cliente(10L,"Flavio Mendoza","Palazzo 2278");

        clientes = List.of(cliente1,cliente2,cliente3,cliente4,cliente5,cliente6,cliente7,cliente8,cliente9,cliente10);

        return clientes;

    }

    public static Cliente getClientePorId(Long id) {
        for ( Cliente cliente: clientes) {
            if( id.equals(cliente.getId()) ){
                return cliente;
            }
        }
        return null;
    }

}

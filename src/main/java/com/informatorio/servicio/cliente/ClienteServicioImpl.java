package com.informatorio.servicio.cliente;

import com.informatorio.basededatos.BdClientes;
import com.informatorio.dominio.Cliente;
import com.informatorio.entrada.IngresoPorConsola;


public class ClienteServicioImpl implements ClienteServicio {

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
        BdClientes.setBdCliente(cliente);

        System.out.println("Identificación: " + cliente.getId());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Domicilio: " + cliente.getDomicilio());

    }



}

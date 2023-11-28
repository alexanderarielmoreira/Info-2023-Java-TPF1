package com.informatorio.dominio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Banco {

    private String nombreDelBanco;
    private String domicilioDelBanco;
    private HashMap<Long, Cliente> clientesDelBanco;
    private List<Cuenta> listaDeCuentas;

    public Banco() {};

    public Banco(String nombreDelBanco, String domicilioDelBanco, HashMap<Long, Cliente> clientesDelBanco, List<Cuenta> listaDeCuentas) {
        this.nombreDelBanco = nombreDelBanco;
        this.domicilioDelBanco = domicilioDelBanco;
        this.clientesDelBanco = new HashMap<>();
        this.listaDeCuentas = new ArrayList<>();
    }

    public String getNombreDelBanco() {
        return nombreDelBanco;
    }

    public void setNombreDelBanco(String nombreDelBanco) {
        this.nombreDelBanco = nombreDelBanco;
    }

    public String getDomicilioDelBanco() {
        return domicilioDelBanco;
    }

    public void setDomicilioDelBanco(String domicilioDelBanco) {
        this.domicilioDelBanco = domicilioDelBanco;
    }

    public HashMap<Long, Cliente> getClientesDelBanco() {
        return clientesDelBanco;
    }

    public void setClientesDelBanco(HashMap<Long, Cliente> clientesDelBanco) {
        this.clientesDelBanco = clientesDelBanco;
    }

    public List<Cuenta> getListaDeCuentas() {
        return listaDeCuentas;
    }

    public void setListaDeCuentas(List<Cuenta> listaDeCuentas) {
        this.listaDeCuentas = listaDeCuentas;
    }





}
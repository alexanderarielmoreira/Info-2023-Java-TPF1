package com.informatorio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Long id;
    private String nombre;
    private String domicilio;
    protected List<Cuenta> cuentas = new ArrayList<>();

    public Cliente() { }
    public Cliente(Long id, String nombre, String domicilio) {
        this.id = id;
        this.nombre = nombre;
        this.domicilio = domicilio;
    }
    public Cliente(Long id, String nombre, String domicilio, List<Cuenta> cuentas) {
        this.id = id;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.cuentas = cuentas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }


}

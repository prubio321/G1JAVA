package com.generation.f20220531;

import java.util.List;

public class Cliente {
    private String rut;
    private Integer id;
    private List<Integer> numerosVenta;
    protected String nombre;
    public String correo;


    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Integer> getNumerosVenta() {
        return numerosVenta;
    }

    public void setNumerosVenta(List<Integer> numerosVenta) {
        this.numerosVenta = numerosVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void modificarAtributo(){
        this.rut="123456789-0";


    }

}

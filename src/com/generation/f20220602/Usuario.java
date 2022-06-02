package com.generation.f20220602;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private String password;
    private String email;
    private String sexo;

    public Usuario() {
    }

    public Usuario(String nombre, String password, String email, String sexo) {
        this.nombre = nombre;
        this.password = password;
        this.email = email;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}

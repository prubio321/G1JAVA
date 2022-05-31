package com.generation.f20220530;

public class Alumno {//Cuando es una coleccion ahi se recomienda la clase en plural
    //atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String curso;
    //protected podemos acceder entre las clases del package
    //private solo accedemos dentro de la misma clase
    //encapsulamiento podemos proteger la informacion, no cualquiera va a tener acceso a los atributos del alumno
    //public todos pueden acceder

    //constructores
    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int edad, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
    }

    //get y set // El get para obtener el valor de mi variable

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    //funciones


    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                '}';
    }
}


package com.generation.f20220530;

import com.generation.f20220531.Cliente;

import java.util.ArrayList;//Es una clase como tal, tenemos atributos, metodos y va mas alla de la implementacion.
import java.util.List;//interfaz que es?//las interfaces solamente definen los metodos, es decir solo la estructura

public class Main {
    public static void main(String[] args) {

        List<Alumno> listaAlumnos = new ArrayList<Alumno>();

        Alumno alumno20 = new Alumno();
        Alumno alumno21 = new Alumno("Paulino", "Rubio", 28, "G1");

        listaAlumnos.add(alumno20);
        listaAlumnos.add(alumno21);

        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println(listaAlumnos.get(i).getNombre());
            System.out.println(listaAlumnos.get(i).getApellido());
            System.out.println(listaAlumnos.get(i).toString());

            //sobreescritura y sobrecarga de metodos
        }

        for (Alumno objetoAlumno : listaAlumnos) {

            System.out.println(objetoAlumno.toString());
        }

        Cliente cliente = new Cliente();



        // instancia de una clase
        // Es la definicion de un objeto
       /* Alumno alumno = new Alumno();//Cuando se usa el constructor vacio a posterior, Se usa para asignar valores a nuestros atributos
        Alumno alumno2 = new Alumno("Paulino", "Rubio", 28, "G1");

        System.out.println(alumno.getNombre());
        System.out.println(alumno2.getNombre());

        //setter //asignar o cambiar contenido de variable
        alumno.setNombre("Rogers");
        System.out.println(alumno.getNombre());

        //crear instancias como miembros del equipo existan nombre, apellido, edad y todos G1*/

        /*
        Alumno alumno = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        Alumno alumno4 = new Alumno();
        Alumno alumno5 = new Alumno();

        alumno.setNombre("Alondra");
        alumno2.setNombre("Diana");
        alumno3.setNombre("Matias");
        alumno4.setNombre("Michael");
        alumno5.setNombre("Paulino");

        alumno.setApellido("Valenzuela");
        alumno2.setApellido("Miranda");
        alumno3.setApellido("Rebolledo");
        alumno4.setApellido("Roldan");
        alumno5.setApellido("Rubio");

        alumno.setEdad(24);
        alumno2.setEdad(27);
        alumno3.setEdad(28);
        alumno4.setEdad(28);
        alumno5.setEdad(28);

        alumno.setCurso("G1");
        alumno2.setCurso("G1");
        alumno3.setCurso("G1");
        alumno4.setCurso("G1");
        alumno5.setCurso("G1");

        //SYSOS GET

        System.out.println("****INTEGRANTES GRUPO 6****");

        System.out.println("Nombre: " + alumno.getNombre() + " Apellido: " + alumno.getApellido() + " Edad: " + alumno.getEdad() + " Curso: " + alumno.getCurso());
        System.out.println("Nombre: " + alumno2.getNombre() + " Apellido: " + alumno2.getApellido() + " Edad: " + alumno2.getEdad() + " Curso: " + alumno2.getCurso());
        System.out.println("Nombre: " + alumno3.getNombre() + " Apellido: " + alumno3.getApellido() + " Edad: " + alumno3.getEdad() + " Curso: " + alumno3.getCurso());
        System.out.println("Nombre: " + alumno4.getNombre() + " Apellido: " + alumno4.getApellido() + " Edad: " + alumno4.getEdad() + " Curso: " + alumno4.getCurso());
        System.out.println("Nombre: " + alumno5.getNombre() + " Apellido: " + alumno5.getApellido() + " Edad: " + alumno5.getEdad() + " Curso: " + alumno5.getCurso());

         */

        System.out.println("----------------------------------------------------------LISTA DE ESTUDIANTES--------------------------------------------------------------------");

        Alumno alumno6 = new Alumno("Alondra", "Valenzuela", 24, "G1");
        Alumno alumno7 = new Alumno("Diana", "Miranda", 27, "G1");
        Alumno alumno8 = new Alumno("Matias", "Rebolledo", 28, "G1");
        Alumno alumno9 = new Alumno("Michael", "Roldan", 28, "G1");
        Alumno alumno10 = new Alumno("Paulino", "Rubio", 28, "G1");

        System.out.println("Nombre: " + alumno6.getNombre() + "; Apellido: " + alumno6.getApellido() + "; Edad: " + alumno6.getEdad() + "; Curso: " + alumno6.getCurso());
        System.out.println("Nombre: " + alumno7.getNombre() + "; Apellido: " + alumno7.getApellido() + "; Edad: " + alumno7.getEdad() + "; Curso: " + alumno7.getCurso());
        System.out.println("Nombre: " + alumno8.getNombre() + "; Apellido: " + alumno8.getApellido() + "; Edad: " + alumno8.getEdad() + "; Curso: " + alumno8.getCurso());
        System.out.println("Nombre: " + alumno9.getNombre() + "; Apellido: " + alumno9.getApellido() + "; Edad: " + alumno9.getEdad() + "; Curso: " + alumno9.getCurso());
        System.out.println("Nombre: " + alumno10.getNombre() + "; Apellido: " + alumno10.getApellido() + "; Edad: " + alumno10.getEdad() + "; Curso: " + alumno10.getCurso());

        System.out.println("------------------------------------------------------------------------------------------------------------------------------");


    }

}
//que proyecto vamos hacer como grupo (14:10 - 15:30)
//baterias educativas
//viernes 17 modelo de dato que informacion vamos a almacenar, usuario, puntaje,
//10 variables funciones condicionales bucles.

//GENERAR VALOR, NO HACER: NO CONVERSAR CON LAS AREAS DE AL LADO, VER BIEN EL ALCANCE DEL PROYECTO, MEDIR Y TENER HARTA DATA PARA GENERAR ESE VALOR DESEADO, NO HACER: ESTAR DESINFORMADO, HACER: ES MUY IMPORTANTE LA ESPECTATIVA, QUE EL CLIENTE ESTE CLARO DE LO QUE QUIERE HACER Y ORIENTARLO A IDENTIFICAR PARA RESOLVER SUS NECESIDADES, NO HACER: UTILIZAR UNA METODOLOGIA SIN TENER UNA VERDADERA SOLUCION E INTERIORIZACION DEL TEMA
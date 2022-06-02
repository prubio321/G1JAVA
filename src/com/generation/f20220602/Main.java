package com.generation.f20220602;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Listas
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        List<Profesor> listaProfesores = new ArrayList<Profesor>();
        List<Alumno> listaAlumnos = new ArrayList<Alumno>();

        //Instancias
       /* Usuario usuario = new Usuario();
        Profesor profesor = new Profesor();
        Alumno alumno = new Alumno();*/

        //set
        Usuario diana321 = new Usuario();
        diana321.setNombre("Diana321");
        diana321.setPassword("hola1234");
        diana321.setSexo("Femenino");
        diana321.setEmail("dianamp@gmail.com");
        listaUsuarios.add(diana321);

        Alumno diana = new Alumno();
        diana.setId_alum(1);
        diana.setCurso("G1");
        diana.setNombre("Diana");
        diana.setAsistencia(true);
        diana.setAsignatura("Java");
        listaAlumnos.add(diana);

        Profesor israel = new Profesor();
        israel.setAsignatura("JAVA");
        israel.setNombre("Israel");
        israel.setPrueba("HOLAMUNDO");
        israel.setDireccion("Av. Padre las casas 2309");
        israel.setTelefono("+56936748593");
        israel.setId_escuela("I01");
        israel.setAnioentrada(2022);
        israel.setCurriculum("Al dia");
        listaProfesores.add(israel);

        System.out.println((listaUsuarios));
        System.out.println((listaProfesores));
        System.out.println((listaAlumnos));


    }
}

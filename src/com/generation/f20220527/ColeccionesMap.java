package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ColeccionesMap {
    public static void main(String[] args) {
        // colecciones Map
        // Pares clave <-> valor
        // HashMap<K, V> map = new HashMap<K, V>();// K -> KEY O CLAVE; V -> VALUE O VALOR
        // HashMap mapa = new HashMap();

        HashMap objHashMap = new HashMap<>();
       String nombre = "Rogers";

        objHashMap.put("Nombre",nombre);
        objHashMap.put("Apellido1","Rubio");
        objHashMap.put("Apellido2","Herrera");
        objHashMap.put("edad", "42");

        System.out.println("Elemento del mapa");
        System.out.println(objHashMap);

        //obtener un valor a traves de la clave
        System.out.println(objHashMap.get("Apellido2"));

        //eliminar par
        objHashMap.remove("Apellido2","Herrera");
        System.out.println(objHashMap);

        //muestra todas las llaves disponibles
        System.out.println(objHashMap.keySet());

        //mostrar todos los valores en el mapa
        System.out.println(objHashMap.values());

        //tamaño de los valores
        System.out.println(objHashMap.size());

        ArrayList<String> platillos = new ArrayList<>();
        platillos.add("pure");
        platillos.add("papa");
        platillos.add("arroz");
        platillos.add("cazuela");
        platillos.add("vegano");
        objHashMap.put("platillos",platillos);


        objHashMap.put("vocales",platillos);
        System.out.println(objHashMap);

        //si no encuentra la clave, retorna un null
        System.out.println(objHashMap.get("vocales"));

        //crear un menu de comida

        //solicitar al usuario que elija el plato




    }
}

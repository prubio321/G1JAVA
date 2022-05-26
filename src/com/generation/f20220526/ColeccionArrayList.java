package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionArrayList {
    public static void main(String[] args) {
        // ArrayList DINAMICOS .size; ESTATICOS .length
        //instancia de clase, definicion de arreglo
        ArrayList<String> colores = new ArrayList<String>();
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();

        //agregar un elemento a la lista
        colores.add("Azul");
        System.out.println("Estoy agregando el color azul" + colores);
        colores.add("Rojo");
        System.out.println("Estoy agregando el color rojo" + colores);

        //si existe un elemento en esa posicion lo desplaza a la derecha
        colores.add(2, "verde");
        System.out.println("Estoy agregando el color verde " + colores);

        //acceder a un elemento
        System.out.println("Estoy obteniendo el valor de la casilla [1] rojo = " + colores.get(1));

        //tamaño del arreglo size()
        System.out.println("Estoy obteniendo el tamaño del array colores " + colores.size());

        //modificar un elemento
        colores.set(1, "Negro");
        System.out.println("Estoy cambiando rojo por negro " + colores);

        //quitar un elemento arreglo.remove(posicion)
        colores.remove(2);
        System.out.println("Estoy quitando el color verde " + colores);

        System.out.println("*********FOR*********");
        //recorrer el arreglo
        for (int i = 0; i < colores.size(); i++) {
            System.out.println("En la posicion " + i + " esta el color " + colores.get(i));
        }
        System.out.println("*********FIN FOR*********");

        System.out.println("*********FOREACH*********");
        for (String color : colores) {
            System.out.println(color);
        }
        System.out.println("***********FIN FOREACH*********");

        //ordenar el arreglo ascendentemente; lo ordena alfabeticamente, lo impacta directo
        Collections.sort(colores);
        System.out.println(colores);

        //quitar todos los elementos
        colores.clear();
        System.out.println("Estoy quitando todos los elementos de colores " + colores);

        numerosPares.add(20);
        numerosPares.add(12);
        numerosPares.add(2);
        numerosPares.add(6);
        numerosPares.add(14);
        numerosPares.add(8);
        System.out.println(numerosPares+" ");
        System.out.println();
        Collections.sort(numerosPares);
        System.out.println(numerosPares+" ");

        System.out.println();
        //el reserver no ordena descendentemente, solo invierte los valores actuales en el mismo orden
        Collections.reverse(numerosPares);
        System.out.println();
        System.out.println(numerosPares+" ");






    }
}

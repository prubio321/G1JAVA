package com.generation.f20220526;

import java.util.Arrays;

public class ColeccionArray {
    public static void main(String[] args) {
        //Array
        String[] colores = {"Rojo", "azul", "amarillo", "negro", "verde"};
        Integer[] numerosPares = {2, 4, 6, 8, 10, 12};
        int[] primerosNumeros = {1, 2, 3, 4, 5, 6, 7};

        //posicion inicial es cero (0)
        System.out.println(colores[0]);
        System.out.println(numerosPares[0]);
        System.out.println(primerosNumeros[0]);

        //nombreArray[posicion]-> accediendo al elemento del arreglo en esa posicion
        System.out.println(numerosPares[4]);//10

        numerosPares[4] = 14;//modificando el elemento en esa posicion
        System.out.println(numerosPares[4]);

        // numerosPares[7]= 14;//Error fuera de indice
        // no podemos agregar por posicion si no existe un elemento

        System.out.println("tamaño array colores: " + colores.length);
        System.out.println("tamaño array pares: " + numerosPares.length);
        System.out.println("tamaño array primerosnumeros: " + primerosNumeros.length);

        //imprimir el contenido del arreglo
        System.out.println(Arrays.toString(colores));
        System.out.println(Arrays.toString(numerosPares));
        System.out.println(Arrays.toString(primerosNumeros));

        //recorrer un arreglo
        for (int i = 0; i < primerosNumeros.length; i++) {
            System.out.print(primerosNumeros[i]+" ");
        }
        System.out.println("\n");

        //foreach
        for (int elemento: primerosNumeros) {//{1,2,3,4,5,6,7};
            //int elemento=0;
            System.out.println(elemento);
        }

        for (String color: colores) {//{"Rojo", "azul", "amarillo", "negro", "verde};
            System.out.println(color);
        }

    }

}


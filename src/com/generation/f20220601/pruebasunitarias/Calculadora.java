package com.generation.f20220601.pruebasunitarias;

import java.util.Scanner;

public class Calculadora {

    public int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicacion(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public String division(int numero1, int numero2) {
        if (numero2 != 0) {
            String resultado = Integer.toString(numero1 / numero2);
            return resultado;
        }
        return "No se puede dividir por cero";

    }

    public String resto(int n) {

        int numero =3;

        int resultadoResto = (numero % 2);// si el numero es par el resto es 0, si es impar es 1
        String resultado = "";
        if (resultadoResto == 0) {
            resultado="Es par";
        } else {
            resultado="Es impar";
        }

        return resultado;
    }
}




// modelar como objetos un usuario(padre), profesor(hijo) y alumno(hijo)
// alumno debe decir presente con test
// lista usuario, profesor, alumno y probar test matematicos
// hasta las 11:45 a.m




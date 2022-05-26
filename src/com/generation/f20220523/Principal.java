package com.generation.f20220523;

public class Principal {

    public static void main(String[] args) {
       int resultado = sumar(2, 4);
        System.out.println("El resultado de la suma es: "+resultado);
    }

    private static int sumar(int num1, int num2) {
        System.out.println("Bienvenidos a la calculadora de sumas");
        return num1 + num2;
    }
    }


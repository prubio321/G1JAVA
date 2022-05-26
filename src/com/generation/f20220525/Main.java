package com.generation.f20220525;

import java.util.Scanner;

import static com.generation.f20220523.Operaciones.suma;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int num1 = 2;
        int num2 = 4;
        int num3 = 6;
        int num4 = 8;
        int num5 = 10;
        int num6 = 12;
        int num7 = 14;
        int num8 = 16;
        int num9 = 18;
        int num10 = 20;

        int oddsAddition = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        System.out.println("La suma de los primeros 10 números impares es:" + oddsAddition);

        public static boolean isOdd (int número){
            return número % 2 == 0;*/

        int contador = 0;
        int resultadoSuma = 0;

        System.out.println("¿Cuántos números impares deseas sumar?:");

        contador = sc.nextInt();
        int numeros[]=new int[contador];

        for (int i = 0; i < contador  ; i++) {

            System.out.println("Ingrese número " + (i + 1) + ": ");
            int numero = sc.nextInt();;
            if (numero % 2 ==1){
                numeros[i] = numero;
                resultadoSuma = suma(resultadoSuma,numeros[i]);
            }
        }
        System.out.println("El resultado de la suma es: "+resultadoSuma);

    }
}






package com.generation.f20220523;

import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int contador;
        int resultadoSuma = 0;
        int resultadoResta = resta(6,2);
        float resultadoMultiplicacion = multiplicacion(6,2);
        float resultadoDivision = division(6,2);
        System.out.println("¿Cuántos números deseas sumar?:");
        contador = scanner.nextInt();
        int numeros[]=new int[contador];

        for (int i = 0; i < contador  ; i++) {

                System.out.println("Ingrese número " + (i + 1) + ": ");
                int numero = scanner.nextInt();
                numeros[i] = numero;
                resultadoSuma = suma(resultadoSuma,numeros[i]);
        }
        System.out.println("El resultado de la suma es: "+resultadoSuma);
        System.out.println("El resultado de la resta es: "+resultadoResta);
        System.out.println("El resultado de la multiplicacion es: "+resultadoMultiplicacion);
        System.out.println("El resultado de la division es: "+resultadoDivision);


    }

    private static float division(float num1, float num2) {
        return num1 / num2;

    }

    private static float multiplicacion(float num1, float num2) {
        return num1 * num2;

    }

    private static int resta(int num1, int num2) {
        return num1 - num2;

    }

    public static int suma(int num1, int num2) {

        return num1 + num2;
    }

}

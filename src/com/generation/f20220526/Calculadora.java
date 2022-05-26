package com.generation.f20220526;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador;
        int resultadoSuma = 0;
        int resultadoResta = 0;
        float resultadoMultiplicacion = 0;
        float resultadoDivision = 0;
        int resto;
        System.out.println("Ingrese opción: ");
        System.out.println("1 sumar\n2 restar\n3 multiplicar\n4 dividir");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:// sumar
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            case 4:// division

                division();
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }

    }

    private static void suma() {
        System.out.println("¿Cuántos números deseas sumar?:");
        Scanner scanner = new Scanner(System.in);
        int contador = scanner.nextInt();
        int numeros[] = new int[contador];

        int resultadoSuma = 0;
        for (int i = 0; i < contador; i++) {

            System.out.println("Ingrese número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
            resultadoSuma = (resultadoSuma + numeros[i]);
        }
        System.out.println("El resultado de la suma es: " + resultadoSuma);
        ;

    }

    private static void resta() {
        System.out.println("¿Cuántos números deseas restar?:");
        Scanner scanner = new Scanner(System.in);
        int contador = scanner.nextInt();
        int numeros[] = new int[contador];

        int resultadoResta = 0;
        for (int i = 0; i < contador; i++) {

            System.out.println("Ingrese número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
            resultadoResta = (resultadoResta + numeros[i]);
        }
        System.out.println("El resultado de la resta es: " + resultadoResta);
        ;

    }

    private static void multiplicacion() {
        System.out.println("¿Cuántos números deseas multiplicar?:");
        Scanner scanner = new Scanner(System.in);
        int contador = scanner.nextInt();
        int numeros[] = new int[contador];

        int resultadoMultiplicacion = 1;
        for (int i = 0; i < contador; i++) {

            System.out.println("Ingrese número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
            resultadoMultiplicacion = resultadoMultiplicacion * (numeros[i]);

        }
        System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicacion);
        ;

    }

    private static void division() {
        System.out.println("¿Cuántos números deseas dividir?:");
        Scanner scanner = new Scanner(System.in);
        int contador = scanner.nextInt();
        int numeros[] = new int[contador];

        int resultadoDivision = 1;
        for (int i = 0; i < contador; i++) {

            System.out.println("Ingrese número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
            int numDiv =
                    resultadoDivision = (numeros[i]) / resultadoDivision;
        }
        System.out.println("El resultado de la division es: " + resultadoDivision);
        ;

    }



    /*public static float division(float num1, float num2) {
        return num1 / num2;
        }


    public static float multiplicacion(float num1, float num2) {
        return num1 * num2;

    }
    private static int resta(int num1, int num2) {
        return num1 - num2;

    }*/


}



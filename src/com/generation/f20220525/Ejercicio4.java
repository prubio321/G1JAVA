package com.generation.f20220525;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorInferior, totalSuma=0, valor=0, valorSuperior, contador;

        System.out.println("Escriba numero inferior: ");
        valorInferior = sc.nextInt();
        System.out.println("Escriba numero superior: ");
        valorSuperior = sc.nextInt();

        if(valorInferior > valorSuperior) {
            for (int i = valorInferior; i < (valorSuperior - valorInferior); i++) {
                System.out.println("hola");
            }
        }


        do {


        }while (valor != 0);{
            totalSuma = totalSuma + valorInferior;
            System.out.println("El valor total de la suma es: "+totalSuma);




        }
    }
}

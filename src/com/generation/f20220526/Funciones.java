package com.generation.f20220526;

import java.util.Scanner;

public class Funciones {

    public static void main(String[] args) {
        //Funciones
        //4 tipo de funciones
        //Las funciones de tipo void, no retornan, solo ejecutan codigo
        //nombre_funcion se escribe con minuscula la primera letra
        //no puede CREAR un metodo dentro de otro metodo, SI puede llamar a otro metodo

        saludo();//llamado al metodo
        calculoSumaPares(true,33,"34",35l,"sumar");

        int edad = obtenerEdad();
        System.out.println(edad);

       Boolean mayorOMenor = validarMayorEdad(edad);

       if (mayorOMenor){
           System.out.println("Puede ingresar al curso");

       }else{
           System.out.println("No tiene la edad suficiente para acceder al curso");
       }

    }

    //accesador | tipo_de_retorno | nombre_funcion(parametro a recibir){}
    public static void calculoSumaPares(boolean verdad, int numero1, String numero2, Long numero3, String accion) {
        Integer num2 = Integer.parseInt(numero2);

        System.out.println(numero1 + numero3 + num2);
    }

    //static nos permite acceder al metodo
    public static void saludo() {
        System.out.println("Buenos dias");
    }

    public void calculoSumaImpares() {
        //solicitar el ingreso de datos


    }

    //funciones que retornan un tipo de datos
    public static Integer obtenerEdad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese edad");
        Integer edad = sc.nextInt();//18;

        return edad;//retornar el contenido de la variable

    }

    //12
    public static Boolean validarMayorEdad(Integer edad) {

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
            return true;
        } else {
            System.out.println("Es menor de edad");
            return false; //false
        }

    }
}


package com.generation.f20220525;

public class BucleDoWhile {
    public static void main(String[] args) {
        //Dowhile
        //a lo menos se ejecutara una vez
        int termino = 8;
        do {
            System.out.println("DoWHILE el valor de termino es "+termino);
            termino++;
        }while (termino <= 10);

        System.out.println("*******************");

        while(termino <= 10){
            System.out.println("el valor de termino es "+termino);
            termino++;
        }
        System.out.println("********FIN********");
    }
}

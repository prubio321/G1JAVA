package f20220525;

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la opcion (1) para entrar; (0) para salir");
        int opcion = sc.nextInt();//capturando el ingreso por consola

        /**VALIDAR EL INGRESO ERRONEO DE LA OPCION**/

        //while valida que la condicion sea verdadera

        while (opcion !=1 && opcion !=0) {

            System.out.println("Incorrecto, por favor reingresar opcion valida\n");
            System.out.println("Ingrese la opcion (1) para entrar; (0) para salir");
            opcion = sc.nextInt();
        }
        System.out.println(" fuera del while\n");

        if(opcion == 1){
        System.out.println("********BIENVENIDO********");
        System.out.println("Ingrese la opcion:\n(1) SUMAR \n(2) RESTAR \n(3) MULTIPLICAR \n(4) DIVIDIR");
        System.out.println("**************************");

            opcion = sc.nextInt();
            while (opcion !=1 && opcion !=2 && opcion !=3 && opcion !=4) {
                System.out.println("Incorrecto, por favor reingresar opcion valida\n");
                opcion = sc.nextInt();
            }
                switch (opcion) {
                    case 1:// sumar
                        // accion para la opcion 1
                        System.out.println("** Suma");
                        break;
                    case 2:
                        System.out.println("** Resta");
                        break;
                    case 3:
                        System.out.println("** Multiplicacion");
                        break;
                    case 4:// division
                        System.out.println("** Division");
                        break;

                    default:
                        System.out.println("opcion invalida");
                        break;
                }
        }else{
            System.out.println("Sesion Finalizada con Exito!\n");
            System.out.println("*******************************");

        }

    }
}

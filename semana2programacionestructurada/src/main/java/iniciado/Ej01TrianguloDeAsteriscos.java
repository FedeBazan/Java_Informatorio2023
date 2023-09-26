package iniciado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej01TrianguloDeAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filas;
        //Bucle aplicando un control de varible con Do-While y manejo de Exepciones Try-Catch
        do {
            try {
                System.out.print("\nIngrese numero de filas:");
                filas=scanner.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("ERROR-SE INGRESO UN VALOR INOPERABLE");
                System.out.print("Se aconseja agregar un numero ENTER POSITIVO");
                scanner.nextLine();
            }
        }while (true);
        /*
        El bucle a continuacion es sin exepciones y tira un error frenando la ejecucion de codigo

        System.out.print("Ingrese numeros de filas para el Triangulo: ");
        filas = scanner.nextInt();

        //Bucle para confirmar valor ingresado

        while (filas<=0){
            System.out.println("Error-El numero ingresado es 0 o negativo");
            System.out.print("Ingresar un numero mayor a 0: ");
            filas = scanner.nextInt();
        }
        */
        //Triangulo de Arriba hacia Abajo
        System.out.println("Triangulo\n");
        for (int i=0;i<filas;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");

        //Triangulo version invertida
        System.out.println("Triangulo Invertido\n");
        for (int i=filas;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}

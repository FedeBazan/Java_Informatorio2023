package Ejercicios_Iniciado_JAVA_JEDI;

import java.util.Scanner;

public class Ej05_TrianguloDeAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque de cuantas filas quiere el triangulo: ");
        int num=scanner.nextInt();
        for (int i=1;i!=num+1;i++){
            for (int j=0;j!=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

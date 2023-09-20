package Ejercicios_Iniciado_JAVA_JEDI;

import java.util.Scanner;

public class Ej09_Potencia2Y3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = scanner.nextByte();
        System.out.println("Su cuadrado es: "+(numero*numero));
        System.out.println("Su cubo es: "+(numero*numero*numero));
    }
}

package Ejercicios_Iniciado_JAVA_JEDI;

import java.util.Scanner;

public class Ej01_SumaDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2;

        System.out.println("Escriba un numero y luego otro para sumarlos: ");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma entre "+num1+" y "+num2+" es de: "+suma);
    }
}

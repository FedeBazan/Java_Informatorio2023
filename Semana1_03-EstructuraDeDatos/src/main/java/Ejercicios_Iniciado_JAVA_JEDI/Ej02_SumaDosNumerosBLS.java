package Ejercicios_Iniciado_JAVA_JEDI;

import java.util.Scanner;

public class Ej02_SumaDosNumerosBLS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2;

        System.out.println("Escriba un numero y luego otro para sumarlos: ");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        int suma = num1 + num2;
        if (suma%2==0){
            System.out.println("La suma entre "+num1+" y "+num2+" es de: "+suma+" \nLa suma es PAR");
        }else {
            System.out.println("La suma entre "+num1+" y "+num2+" es de: "+suma+" \nLa suma es IMPAR");
        }

    }
}
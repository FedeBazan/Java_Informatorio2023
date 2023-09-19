package Ejercicios_Iniciado_JAVA_JEDI;

import java.util.Scanner;

public class Ej04_CalculoDeDivisibilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.println("Registre 2 numeros:");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        if (num1%num2==0){
            System.out.println("El numero: "+num1+" es divisible por "+num2);
        }else {
            System.out.println("El numero: "+num1+" no es divisible por "+num2);
        }
    }
}

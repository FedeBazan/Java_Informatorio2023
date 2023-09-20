package Ejercicios_Iniciado_JAVA_JEDI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej10_Acumulador {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00"); // Clase para modificar el formato de un Decimal
        int num1,num2;
        float multi,acumulador=0;
        System.out.println("Ingrese los 2 numeros para el proceso:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        multi= num1*num2;
        for (int i=1;i<=15;i++) acumulador += (multi / i);
        System.out.println(formato.format(acumulador));
    }
}

package Ejercicios_Caballero_JAVA_JEDI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej01_ObtenerPorcentaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        System.out.print("Indique un numero: ");
        float numero = scanner.nextFloat();
        System.out.print("Indique el porcentaje del numero que desea sacar: ");
        int porcentaje = scanner.nextInt();
        float total = numero*((float) porcentaje /100);
        System.out.println("\nEl "+porcentaje+"% de "+numero+" es:"+formato.format(total));
    }
}

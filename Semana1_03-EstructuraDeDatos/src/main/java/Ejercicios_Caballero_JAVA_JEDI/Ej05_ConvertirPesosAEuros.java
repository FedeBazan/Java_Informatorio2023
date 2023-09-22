package Ejercicios_Caballero_JAVA_JEDI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej05_ConvertirPesosAEuros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        float peso,euro;
        System.out.print("Ingrese una cantidad de Pesos: ");
        peso= scanner.nextFloat();
        euro= (float) (peso/20);
        System.out.print("EL equivalente en Euro es: "+ formato.format(euro));
    }
}

package Ejercicios_Caballero_JAVA_JEDI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej02_ConvertirDolAPesos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        float dolar,pesos;
        int tasa;
        System.out.print("Ingrese el precio de 1 dolar (tasa fija) : ");
        tasa=scanner.nextInt();
        System.out.print("Ingrese la cantidad de dolares a cambiar : ");
        dolar= scanner.nextFloat();
        pesos= dolar*tasa;
        System.out.println("El total en pesos es de: "+formato.format(pesos));
    }
}

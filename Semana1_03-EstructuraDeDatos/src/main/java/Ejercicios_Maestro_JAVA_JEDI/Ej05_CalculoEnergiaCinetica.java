package Ejercicios_Maestro_JAVA_JEDI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej05_CalculoEnergiaCinetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        float masa,velocidad;
        System.out.println("Calculo de la Energia Cinetica");
        System.out.print("Ingrese la MASA del objeto:");
        masa = scanner.nextFloat();
        System.out.print("Ingrese la VELOCIDAD del objeto:");
        velocidad = scanner.nextFloat();
        float energia = ((float) 1 / 2) * masa * (velocidad * velocidad);
        System.out.println("La energia Cinectica resultante será: "+energia);
    }
}

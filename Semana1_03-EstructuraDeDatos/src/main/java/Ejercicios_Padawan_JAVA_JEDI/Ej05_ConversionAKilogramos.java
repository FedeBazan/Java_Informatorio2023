package Ejercicios_Padawan_JAVA_JEDI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej05_ConversionAKilogramos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        float libras,kilogramos;
        final float LB_CONS = 2.2046F;

        System.out.print("Ingrese su peso en LIBRAS: ");
        libras=scanner.nextFloat();
        kilogramos=libras*(1/LB_CONS);
        System.out.println("Su peso en KILOGRAMOS es: "+ formato.format(kilogramos));
    }
}

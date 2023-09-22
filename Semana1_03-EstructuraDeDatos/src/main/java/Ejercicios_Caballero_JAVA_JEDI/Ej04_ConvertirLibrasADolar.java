package Ejercicios_Caballero_JAVA_JEDI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej04_ConvertirLibrasADolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        float libras,dolar;
        System.out.print("Ingrese una cantidad de Libras Esterlinas: ");
        libras= scanner.nextFloat();
        dolar= (float) (libras*1.4);
        System.out.print("EL equivalente en Dolar es: "+ formato.format(dolar));
    }
}

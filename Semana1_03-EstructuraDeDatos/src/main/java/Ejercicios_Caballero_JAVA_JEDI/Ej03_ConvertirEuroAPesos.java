package Ejercicios_Caballero_JAVA_JEDI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej03_ConvertirEuroAPesos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        float euro,dolar;
        System.out.print("Ingrese una cantidad de Euros: ");
        euro= scanner.nextFloat();
        dolar= (float) (euro*1.2);
        System.out.print("EL equivalente en Dolar es: "+ formato.format(dolar));
    }
}

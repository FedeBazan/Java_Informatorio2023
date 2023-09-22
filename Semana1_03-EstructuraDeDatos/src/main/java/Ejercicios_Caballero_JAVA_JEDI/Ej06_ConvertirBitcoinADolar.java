package Ejercicios_Caballero_JAVA_JEDI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej06_ConvertirBitcoinADolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        float bitcoin,dolar;
        System.out.print("Ingrese una cantidad de BitCoins: ");
        bitcoin= scanner.nextFloat();
        dolar= (float) (bitcoin*50000);
        System.out.print("EL equivalente en Dolar es: "+ formato.format(dolar));
    }
}

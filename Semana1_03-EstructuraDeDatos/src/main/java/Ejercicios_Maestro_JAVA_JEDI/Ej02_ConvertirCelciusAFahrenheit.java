package Ejercicios_Maestro_JAVA_JEDI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej02_ConvertirCelciusAFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        float celcius,fahrenheit;
        System.out.print("Ingrese la temperatura en °C: ");
        celcius=scanner.nextFloat();
        fahrenheit=(celcius*(9/5))+32;
        System.out.println("El equivalente en °F es : "+formato.format(fahrenheit));
    }
}

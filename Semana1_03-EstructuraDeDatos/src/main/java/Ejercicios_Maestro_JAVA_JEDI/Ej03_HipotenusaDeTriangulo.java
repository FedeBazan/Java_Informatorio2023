package Ejercicios_Maestro_JAVA_JEDI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej03_HipotenusaDeTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");

        float catA,catB;
        double hip;

        System.out.print("Ingrese el valor de un cateto: ");
        catA=scanner.nextFloat();
        System.out.print("Ingrese el valor del otro cateto: ");
        catB= scanner.nextFloat();
        hip=((catA*catA)+(catB*catB));
        hip=Math.sqrt(hip); //Math.sqrt(double) , se usa para sacar la raiz cuadrada de X numero
        System.out.println("El valor de la Hipotenusa es: "+formato.format(hip));
    }
}

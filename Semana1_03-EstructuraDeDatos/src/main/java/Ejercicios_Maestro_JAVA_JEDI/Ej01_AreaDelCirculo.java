package Ejercicios_Maestro_JAVA_JEDI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej01_AreaDelCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        float radio,area;
        final float PI= 3.1416F;
        System.out.print("Ingrese el valor del RADIO del circulo: ");
        radio= scanner.nextFloat();
        area = PI*(radio*radio);//math.pow funcion para calcular el exponente de un numero
        System.out.println("El Area es: "+formato.format(area));
    }
}

package Ejercicios_Maestro_JAVA_JEDI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej06_CalculoVelocidadFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        float velIn,velFin;
        int tiempo;
        final float GRAVEDAD= 9.41F;
        System.out.println("Calculo de la VELOCIDAD FINAL");
        System.out.print("Ingrese valor de la VELOCIDAD INICIAL: ");
        velIn=scanner.nextFloat();
        System.out.print("Ingrese valor del TIEMPO: ");
        tiempo=scanner.nextInt();
        velFin=velIn+GRAVEDAD*tiempo;
        System.out.println("La VELOCIDAD FINAL será de : "+formato.format(velFin));
    }
}

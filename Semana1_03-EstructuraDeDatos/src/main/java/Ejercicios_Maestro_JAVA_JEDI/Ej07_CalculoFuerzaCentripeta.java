package Ejercicios_Maestro_JAVA_JEDI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej07_CalculoFuerzaCentripeta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        float fueCen,masa,velAng,radio;
        System.out.println("Calculo de la FUERZ CENTRIPETA");
        System.out.print("Ingrese la MASA del objeto: ");
        masa = scanner.nextFloat();
        System.out.print("Ingrese la VELOCIDAD ANGULAR del objeto: ");
        velAng = scanner.nextFloat();
        System.out.print("Ingrese el RADIO del objeto: ");
        radio = scanner.nextFloat();
        fueCen=masa*((velAng*velAng)/radio);
        System.out.println("La Fuerza Centrípeta el objeta es de: "+formato.format(fueCen));
    }
}

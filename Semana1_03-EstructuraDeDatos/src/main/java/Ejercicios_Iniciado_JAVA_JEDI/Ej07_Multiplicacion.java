package Ejercicios_Iniciado_JAVA_JEDI;

import java.util.Scanner;

public class Ej07_Multiplicacion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int int1,int2,multint;
        float flo1,flo2,multiflo;
        System.out.println("Coloque 2 numeros ENTEROS para multiplicarlos: ");
        int1 = scanner.nextInt();
        int2 = scanner.nextInt();
        multint = int1 * int2;
        System.out.println("La multiplicacion entre ambos es de : "+multint);
        System.out.println("Coloque 2 numeros REALES para multiplicarlos");
        flo1 = scanner.nextFloat();
        flo2 = scanner.nextFloat();
        multiflo = flo1*flo2;
        System.out.printf("La multiplicacion entre ambos es de : %.2f", multiflo);
        System.out.println("\nLa suma entre ambos es de: " +(multint*multiflo));
        //Las operaciones aritmeticas entre un FLOAT y un INT da como resultado un FLOAT
        //Java convierte en float el valor del int para mantener la preciosion del resultado
    }
}

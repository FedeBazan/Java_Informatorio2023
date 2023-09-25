package Ejercicios_Maestro_JAVA_JEDI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej04_CalculoDeLaMediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        int k;
        float n,media,contador=0;
        System.out.print("Ingrese la cantidad de elementos para calcular su media: ");
        k=scanner.nextInt();
        while (k<=0){
            System.out.println("Debe ingresa un valor positivo");
            k=scanner.nextInt();
        }
        for (int i=0;i!=k;i++){
            System.out.print("Ingrese el numero " +(i+1)+": ");
            n=scanner.nextFloat();
            contador+=n;
            //System.out.println(contador);
        }
        media=contador/k;
        System.out.println("La media de los numeros es de: "+formato.format(media));
    }
}

package padawan;

import java.util.Scanner;

public class Ej04SumaDelRangoDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ini,fin,sum=0;
        System.out.print("Ingresa el numero de rango minimo: ");
        ini=scanner.nextInt();
        System.out.print("Ingrese el numero de rango maximo: ");
        fin=scanner.nextInt();
        for (;ini!=fin;ini++){
            if (ini%2==0) sum+=ini;
        }
        System.out.println("La sunma de los numeros impares entre el rango de "+ini+" y "+fin+" es: "+sum);
    }
}

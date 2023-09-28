package caballero;

import java.util.Arrays;
import java.util.Scanner;

public class Ej04OrdenarloTodo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float[] numeros,numerosOrd;
        int cantidad;

        System.out.println("¿Cuantos numeros desea registrar?: ");
        cantidad = scanner.nextInt();
        numeros=new float[cantidad];

        for (int i=0;i<numeros.length;i++){
            System.out.println("Ingresa el numero "+(i+1)+" : ");
            numeros[i]=scanner.nextFloat();
        }

        System.out.print("Arreglo resultante: ");
        for (int i=0;i<numeros.length;i++) System.out.print("\""+numeros[i]+"\" ");

        Arrays.sort(numeros);

        System.out.print("\nArreglo ordenado de Forma Ascendente: ");
        for (int i=0;i<numeros.length;i++) System.out.print("\""+numeros[i]+"\" ");

    }
}

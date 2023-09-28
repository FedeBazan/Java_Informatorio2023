package maestro;

import java.util.Random;
import java.util.Scanner;

public class Ej01EliminacionDeUnElemento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] numeros = new int[10];
        int numero,contador=0;
        for (int i=0;i<numeros.length;i++) numeros[i]= random.nextInt(10)+1;
        for (int i=0;i<numeros.length;i++) System.out.print(numeros[i]+" ");
        System.out.print("\nIngrese un numero entre 1 a 10: ");
        numero =scanner.nextInt();
        for (int i=0;i<numeros.length;i++){
            if (numero==numeros[i]){
                numeros[i]=numeros[i+1];
                for (int j = i; j<numeros.length-1;j++){
                    numeros[j]=numeros[j+1];
                }
                contador++;
            }
            if (numero==numeros[i]){
                numeros[i]=numeros[i+1];
                for (int j = i; j<numeros.length-1;j++){
                    numeros[j]=numeros[j+1];
                }
                contador++;
            }
        }
        for (int i=0;i<numeros.length-contador;i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println("\nEl numero se repite "+contador);
    }
}

//TODO MAL

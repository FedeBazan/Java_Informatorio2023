package guiadeactividades_06_10;

import java.util.Scanner;

/*
Escribe un programa que tome un array y cree otro array que contenga solo los elementos del medio, es decir, eliminando el primer y último elemento.
        myArray = [1, 2, 3, 4]
        middle(myArray)  # [2,3]
*/
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[]=new int[4];
        int array2[]=new int[array.length-2];
        int contador=0;

        System.out.println("Ingrese los valores del array:");
        for (int i=0;i<array.length;i++){
            System.out.print("Ingrese valor de indice "+i +" del array: ");
            array[i]=scanner.nextInt();
            if (i!=0 && i!=array.length-1){
                array2[contador]=array[i];
                contador++;
            }
        }

        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("\n");
        for (int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
    }
}

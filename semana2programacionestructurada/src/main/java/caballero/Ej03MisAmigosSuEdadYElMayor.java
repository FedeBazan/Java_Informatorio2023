package caballero;

import java.util.Scanner;

public class Ej03MisAmigosSuEdadYElMayor {
    public static void main(String[] args) {
        //Definicion de Variables
        Scanner scanner = new Scanner(System.in);
        String [] nombres;
        int[] edades;
        int cantidad;
        //Registro de los amigos
        System.out.print ("¿Cuantos amigos va a registrar? :");
        cantidad = scanner.nextInt();
        scanner.nextLine();
        nombres = new String[cantidad];
        edades = new int[cantidad];
        for (int i=0;i<cantidad;i++){
            System.out.println("-------------------");
            System.out.print("Ingrese el nombre: ");
            nombres[i]=scanner.nextLine();
            System.out.print("Ingrese edad: ");
            edades[i]=scanner.nextInt();
            scanner.nextLine();
        }
        //Mostrar a los amigos con edad mayor a 18
        System.out.println("--\"LISTA DE AMIGOS MAYORES DE EDAD\"--");
        for (int i=0;i<cantidad;i++){
            if (edades[i]>=18){
                System.out.println("-------------------");
                System.out.print("Nombre: "+nombres[i]);
                System.out.println("\nEdad: "+edades[i]);
            }
        }
        System.out.println("-------------------");
        System.out.println("Aquellas persona que no aparecieron es por ser menores de EDAD");
        //Buscar al Amigo con mayor edad
        int max=edades[0],bandera=0;
        for (int i=0;i<cantidad;i++){
            if (edades[i]>max){
                bandera=i;
            }
        }
        System.out.println("-------------------");
        System.out.println("El amigo con mayor edad es: "+nombres[bandera]+"\nEdad: "+edades[bandera]);
    }
}

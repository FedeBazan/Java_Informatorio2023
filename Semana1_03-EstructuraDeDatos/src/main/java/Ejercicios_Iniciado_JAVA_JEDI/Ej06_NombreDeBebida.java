package Ejercicios_Iniciado_JAVA_JEDI;

import java.util.Scanner;

public class Ej06_NombreDeBebida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreMascota;
        String ultimaPelicula;
        System.out.print("Ingrese el nombre de su última mascota: ");
        nombreMascota = scanner.next();
        //con scanner.nextLine() la variable puede tomar una linea de texto, de esta forma tambien puede incluirse los " "
        scanner.nextLine(); // Limpiar el scanner para una nueva linea
        System.out.print("Ingrese el nombre de la última película: ");
        ultimaPelicula = scanner.nextLine();
        System.out.println("\nNombre de su mascota: " + nombreMascota + "\nNombre película: " + ultimaPelicula);
    }
}

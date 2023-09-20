package Ejercicios_Iniciado_JAVA_JEDI;

import java.io.PrintStream;
import java.util.Scanner;

public class Ej08_NombreYEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.print("Ingrese su nombre: ");
        nombre=scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
}

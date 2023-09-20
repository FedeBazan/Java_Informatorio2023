package Ejercicios_Padawan_JAVA_JEDI;

import java.util.Scanner;

public class Ej02_Descontador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num,limite=20;
        System.out.print("Ingrese un numero: ");
        num = scanner.nextInt();
        for (;limite!=0;limite--){
            num--;//Se usa el operador de "--" para no usar una ASIGNACION DIRECTA
        }
        System.out.println("Numero con -20: "+num);
    }
}

package padawan;

import java.util.Scanner;

public class Ej08MisAmigosYSuEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num,edad;
        String nombre;
        System.out.print("Ingrese la cantidad de amigos a registrar: ");
        num=scanner.nextInt();
        for (int i=1;i<=num;i++){
            System.out.println("Amigo nro."+i);
            System.out.print("Ingrese el nombre: ");
            nombre=scanner.next();
            System.out.print("Ingrese edad: ");
            edad=scanner.nextInt();
            if (edad>=18){
                System.out.println(""+nombre+" ES MAYOR");
            } else{
                System.out.println("El sujeto no es MAYOR");
            }
        }
    }
}

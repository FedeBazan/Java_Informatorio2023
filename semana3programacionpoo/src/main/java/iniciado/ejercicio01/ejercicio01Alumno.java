package iniciado.ejercicio01;

import iniciado.ejercicio01.Alumno;

import java.util.Scanner;

public class ejercicio01Alumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Alumno alumno = new Alumno();
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        String nombre;
        String apellido;
        String fechaNac;
        int edad;

        for (int i=0;i<3;i++){
            System.out.println("Alumno "+(i+1));
            scanner.nextLine();
            System.out.print("Ingrese nombre del alumno: ");
            nombre=scanner.nextLine();
            System.out.print("Ingrese apellido del alumno: ");
            apellido=scanner.next();
            System.out.print("Ingrese fecha de Nacimiento formato \" DD/MM/AAAA\": ");
            fechaNac=scanner.next();
            System.out.print("Ingrese edad del alumno: ");
            edad= scanner.nextInt();
            switch (i){
                case 0:
                    alumno.setNombre(nombre);
                    alumno.setApellido(apellido);
                    alumno.setFechaNac(fechaNac);
                    alumno.setEdad(edad);
                    break;
                case 1:
                    alumno1.setNombre(nombre);
                    alumno1.setApellido(apellido);
                    alumno1.setFechaNac(fechaNac);
                    alumno1.setEdad(edad);
                    break;
                case 2:
                    alumno2.setNombre(nombre);
                    alumno2.setApellido(apellido);
                    alumno2.setFechaNac(fechaNac);
                    alumno2.setEdad(edad);
                    break;
                default:
                    break;
            }
        }

        System.out.println("\n"+alumno.toString());
        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
    }
}

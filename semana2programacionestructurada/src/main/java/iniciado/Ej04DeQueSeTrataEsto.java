package iniciado;

import java.util.Scanner;

public class Ej04DeQueSeTrataEsto {
    public static void main(String[] args) {
        //Declaraciones de Variables
        Scanner scanner = new Scanner(System.in);
        float num;

        //Bucle de Manejo de dato ingresado
        do {
            try{
                System.out.print("Ingrese un numero: ");
                num = scanner.nextFloat();
                break;
            }catch (Exception e){
                System.out.println("ERROR, DEBE INGRESAR UN NUMERO");
                scanner.nextLine();
            }
        }while (true);

        //Ejecucion
        if (num>0){
            System.out.println("El numero es POSITIVO");
        } else if (num<0) {
            System.out.println("El numero es NEGATIVO");
        }else {
            System.out.println("El numero es CERO");
        }
    }
}

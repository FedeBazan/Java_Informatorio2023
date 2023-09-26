package iniciado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej05SumaDeLosPrimeroNNumeros {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner scanner = new Scanner(System.in);
        int cantidad,suma=0;
        //Control de variables
        do {
            try{
                System.out.println("Ingrese cuantos numeros quiere aplicar para la SUMA DE LOS N PRIMEROS: ");
                cantidad=scanner.nextInt();
                if (cantidad>0){
                    break;
                }else {
                    System.out.println("ERROR, DEBE INGRESAR UN VALOR POSITIVO MAYOR QUE 0");
                }
            }catch (Exception e){
                System.out.println("ERROR, DEBE INGRESAR UN VALOR POSITIVO MAYOR QUE 0");
                scanner.nextLine();
            }
        }while (true);
        for (int i=0; i < cantidad;i++){
            suma+=(i+1);
        }
        System.out.println("La suma de los primeros " +cantidad+ " es de: "+suma);
    }
}

package iniciado;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

public class Ej02MisAmigos {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner scanner = new Scanner(System.in);
        String amigo1 = "Adam West";
        String amigo2 = "El Comandante";
        String amigo3 = "El Fan de Wanda";
        String amigo4 = "Herni de Taringa";
        String amigo5 = "El mago sin dientes";
        String seleccionado = null;
        int opcion;


        System.out.println("Bienvenido a tu lista de amigos, tienes 5");
        //Control de variable opcion
        do {
            try{
                System.out.println("Coloca un numero del 1 al 5 a ver quien te toca");
                opcion = scanner.nextInt();
                if (opcion>0 && opcion<6){
                    break;
                }
            }catch (Exception e){
                System.out.println("Error, debe ingresar un numero entero entre 1 y 5");
                scanner.nextLine();
            }
        }while (true);
        //Ejeccuicion
        switch (opcion){
            case 1: seleccionado=amigo1;
            break;
            case 2: seleccionado=amigo2;
            break;
            case 3:seleccionado=amigo3;
            break;
            case 4:seleccionado=amigo4;
            break;
            case 5:seleccionado=amigo5;
            break;
            default:
                System.out.println("Error de amigo");
        }

        System.out.println("Tu amigo seleccionado es: "+seleccionado);


    }
}

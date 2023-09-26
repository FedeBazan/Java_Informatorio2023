package iniciado;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

public class Ej02MisAmigos {
    public static void main(String[] args) {
        //Declaracion de variables
        String amigo1 = "Adam West";
        String amigo2 = "El Comandante";
        String amigo3 = "El Fan de Wanda";
        String amigo4 = "Herni de Taringa";
        String amigo5 = "El mago sin dientes";
        String seleccionado = null;
        int opcion=1;


        System.out.println("Bienvenido a tu lista de amigos, tienes 5");
        //Ejeccuicion
        while (opcion<=5){
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
            System.out.println(seleccionado);
            opcion++;
        }


    }
}

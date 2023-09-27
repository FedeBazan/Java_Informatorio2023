package padawan;

import java.util.Random;

public class Ej09MenuDeOpciones {
    public static void main(String[] args) {
        //Declaracion de variables
        Random random = new Random(); // Uso de la clase Random
        int opcion = 1+random.nextInt(5); //se trabaja la opcion entre un intervalo  de 1 a 5
        System.out.println(" --Ruleta de Gym-- \n\n1- Pecho,Hombro,Triceps \n2- Espalda,Biceps \n3- Pierna Completo \nOtro numero : Descanso\n");
        System.out.print("Salio el "+opcion+" toca: ");
        switch (opcion){
            case 1:
                System.out.println("Pecho,Hombro,Triceps");
                break;
            case 2:
                System.out.println("Espalda,Bisecps");
                break;
            case 3:
                System.out.println("Pierna Completo");
                break;
            default:
                System.out.println("Descanso");
        }
    }
}

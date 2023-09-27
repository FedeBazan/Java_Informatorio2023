package padawan;

import java.util.Random;

public class Ej10MenuDeOpcionesParte2 {
    public static void main(String[] args) {
        Random random = new Random();
        int opcion,i=1;
        System.out.println("--Ruleta Gym--");
        while (i<=4){
            switch (i){
                case 1:
                    System.out.println("1-Pecho,Hombro,Triceps");
                    break;
                case 2:
                    System.out.println("2-Espalda,Bisecps");
                    break;
                case 3:
                    System.out.println("3-Pierna Completo");
                    break;
                default:
                    System.out.println("4-Descanso");
            }
            i++;
        }
        opcion= 1+random.nextInt(4);
        System.out.println("Tu opcion es: "+opcion);
    }


}

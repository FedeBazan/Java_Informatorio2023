package caballero;

import java.util.Scanner;

public class Ej02DameLosMayoresYMenores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] num5 = new int[5];
        int min=0,max=0;
        for (int i=0;i<num5.length;i++){
            System.out.print("Ingrese un numero entero: ");
            num5[i]=scanner.nextInt();
            switch (i+1){
                case 1:
                    min=num5[0];
                    max=num5[0];
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    if (num5[i]>=max){
                        max=num5[i];
                    } else if (num5[i] <= min) {
                        min=num5[i];
                    }
                    break;
            }
        }
        System.out.println("El valor maximo es: "+max);
        System.out.println("El valor minimo es: "+min);
    }
}

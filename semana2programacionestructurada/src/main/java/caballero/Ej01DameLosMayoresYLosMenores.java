package caballero;

import java.util.Scanner;

public class Ej01DameLosMayoresYLosMenores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros ={1,3,5,7,9};
        int num;
        boolean bandera=false;
        System.out.print("Ingrese el numero: ");
        num = scanner.nextInt();
        for (int i=0;i<numeros.length;i++){
            if (num == numeros[i]) {
                bandera=true;
                break;
            }
        }
        if (bandera){
            System.out.println("Se encontro el numero: "+num);
        }else {
            System.out.println("El numero no se encontro");
        }
    }
}

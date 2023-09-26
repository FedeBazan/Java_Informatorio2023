package iniciado;

import java.util.Scanner;

public class Ej03SumaDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            try {
                System.out.print("Ingrese numero: ");
                numero=scanner.nextInt();
                break;
            }catch (Exception e){
                System.out.println("ERROR DE VALOR INFRESADO, INGRESE UN NUMERO");
                scanner.nextLine();
            }
        }while (true);
        if (numero%2==0){
            System.out.println("El Numero es PAR");
        }else {
            System.out.println("El numero es IMPAR");
        }
    }
}

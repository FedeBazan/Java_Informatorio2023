package padawan;

import java.util.Scanner;

public class Ej03Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num,fac=1;
        System.out.print("Ingrese el numero para saber su factorial: ");
        num=scanner.nextInt();
        for (int i=num;i>0;i--){
            fac=fac*i;
        }
        System.out.println("El factorial de "+num+" es "+fac);
    }
}

package padawan;

import java.util.Scanner;

public class Ej06YMasSumas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        System.out.print("Ingrese un numero: ");
        int num = scanner.nextInt();
        for (int i=1;i<=num;i++) sum+=i;
        System.out.println("La suma de todos los numeros desde 1 hasta "+num+" es: "+sum);
    }
}

package guiadeactividades_06_10;

import java.util.Arrays;

public class Ejercicio03 {
    public static void main(String[] args) {
        int[]  myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int[] fisrtSecond= new int[2];

        for (int i=0;i<myArray.length;i++){
            System.out.print(myArray[i]+" ");
        }
        System.out.println("\n");
        Arrays.sort(myArray);

        for (int i=0;i<myArray.length;i++){
            if (i==myArray.length-1) {
                fisrtSecond[0] = myArray[i];
                continue;
            }
            if (i==myArray.length-2) {
                fisrtSecond[1] = myArray[i];
            }
        }

        for (int i=0;i<fisrtSecond.length;i++){
            System.out.print(fisrtSecond[i]+" ");
        }
    }
}

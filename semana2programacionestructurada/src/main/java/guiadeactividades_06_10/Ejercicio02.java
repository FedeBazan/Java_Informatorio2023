package guiadeactividades_06_10;

public class Ejercicio02 {
    public static void main(String[] args) {
        int[][] myArray2D = {{1,2,3}, {4,5,6}, {7,8,9}};
        int sum=0;
        for (int i=0;i<myArray2D.length;i++){
            for (int j=0;j<myArray2D[i].length;j++){
                if (i==j) sum+=myArray2D[i][j];
            }
        }
        System.out.println("La suma de la diagonal es: " +sum);
    }
}

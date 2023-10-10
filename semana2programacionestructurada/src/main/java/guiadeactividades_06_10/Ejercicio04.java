package guiadeactividades_06_10;

public class Ejercicio04 {
    public static void main(String[] args) {
        int[] inputArray = {1, 1, 2, 2, 3, 4, 5};
        int[] uniqueArray = removeDuplicates(inputArray);

        System.out.print("Input Array: ");
        printArray(inputArray);

        System.out.print("Unique Array: ");
        printArray(uniqueArray);
    }

    public static int[] removeDuplicates(int[] input) {
        int n = input.length;
        int[] unique = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (input[i] == input[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                unique[uniqueCount] = input[i];
                uniqueCount++;
            }
        }

        int[] result = new int[uniqueCount];
        System.arraycopy(unique, 0, result, 0, uniqueCount);
        return result;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

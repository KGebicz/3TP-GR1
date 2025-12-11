import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] arr = {
            {4, 8, 1},
            {9, 3, 7},
            {6, 2, 5}
        };

        System.out.println("Tablica 2D:");
        print2D(arr);

        int[] flat = flatten(arr);

        System.out.println("\nTablica 1D przed sortowaniem:");
        print1D(flat);

        Arrays.sort(flat);

        System.out.println("\nTablica 1D po sortowaniu:");
        print1D(flat);
    }

    public static int[] flatten(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int[] result = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[index] = arr[i][j];
                index++;
            }
        }
        return result;
    }

    public static void print2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(", ", arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void print1D(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

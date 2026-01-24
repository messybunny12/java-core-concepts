import java.util.Scanner;

/**
 * Demonstrates array declaration, initialization,
 * user input, and traversal in Java.
 */
public class ArrayDemo {

    public static void main(String[] args) {

        // Array declarations
        int[] arr1 = new int[10];
        int[] arr2 = new int[5];
        int[] arr3 = {1, 2, 3, 4, 5, 6};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Output of First Array:");
        for (int value : arr1) {
            System.out.print(value + " ");
        }

        System.out.println("\nOutput of Second Array:");
        for (int value : arr2) {
            System.out.print(value + " ");
        }

        System.out.println("\nOutput of Third Array:");
        for (int value : arr3) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}

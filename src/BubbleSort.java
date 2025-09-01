import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number of strings
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];

        // Taking string inputs
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Bubble sort for strings
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // compareTo() returns > 0 if arr[j] > arr[j+1]
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // swap
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Printing sorted strings
        System.out.println("\nSorted Strings:");
        for (String str : arr) {
            System.out.println(str);
        }

        sc.close();
    }
}

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] data = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        Arrays.sort(data); // Ensure the array is sorted

        int target1 = 23;
        int index1 = binarySearchIterative(data, target1);
        System.out.println("Target " + target1 + " found at index: " + index1); // Output: 5

        int target2 = 10;
        int index2 = binarySearchIterative(data, target2);
        System.out.println("Target " + target2 + " found at index: " + index2); // Output: -1

        // Using Java's built-in binarySearch method
        System.out.println("Using Arrays.binarySearch for 23: " + Arrays.binarySearch(data, 23));
        System.out.println("Using Arrays.binarySearch for 10: " + Arrays.binarySearch(data, 10));
    }
}

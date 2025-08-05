// Fix thhhe program below to implement a modified binary search that works on a descending-sorted array AND does not return an infinite loop.

import java.util.Scanner;

public class ModifiedBinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for array values (space-separated)
        System.out.print("Enter a descending-sorted array (space-separated): ");
        String[] input = scanner.nextLine().trim().split("\\s+");
        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }

        // Prompt user for the target value
        System.out.print("Enter the target value to search for: ");
        int target = scanner.nextInt();

        // Perform search
        int result = find(a, 0, a.length - 1, target);

        // Output result
        if (result == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Target found at index: " + result);
        }

        scanner.close();
    }

    // Modified find method with print tracing
    /*
     * static int find(int[] a, int first, int last, int target) {
     * System.out.println("Searching: first = " + first + ", last = " + last);
     * // Base case: if the range is invalid
     * if (first > last) {
     * return -1;
     * }
     * // Calculate mid index
     * int mid = (first + last + 1) / 2;
     * System.out.println("  mid = " + mid + ", a[mid] = " + a[mid]);
     * // Check if the target is found
     * // if (target == a[mid]) {
     * // return mid;
     * // }
     * if (target == a[mid]) {
     * return mid; // target found
     * }
     * // Recursive search in the appropriate half
     * // If target is less than or equal to mid, search right (smaller values)
     * // If target is greater than mid, search left (larger values)
     * // Note: This is the key difference from standard binary search
     * // In a descending-sorted array, we reverse the logic
     * // to search in the correct half.
     * 
     * if (target <= a[mid]) {
     * return find(a, mid, last, target); // go right (smaller values)
     * } else {
     * return find(a, first, mid - 1, target); // go left (larger values)
     * }
     */

    static int find(int[] a, int first, int last, int target) {
        System.out.println("Searching: first = " + first + ", last = " + last);
        if (first > last)
            return -1;
        if (first == last)
            return a[first] == target ? first : -1;

        int mid = (first + last + 1) / 2;
        System.out.println("  mid = " + mid + ", a[mid] = " + a[mid]);

        if (target <= a[mid])
            return find(a, mid, last, target);
        return find(a, first, mid - 1, target);
    }

}

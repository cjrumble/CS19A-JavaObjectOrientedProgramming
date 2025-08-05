/* Chapter5Quiz
// Chris Rumble
// July 17, 2025
 * Write a Java program that gets three integers b, c an d from the user and
 * indicates whether the three numbers go "uphill" (b < c <d), go "downhill" (b
 * > c > d) , form a "mountain" ( b < c > d) , form a "valley" (b > c < d), are
 * "flat" (a = b = c) or have a "miscellaneous" relation (anything else).
 * Copy paste your code and the output for a sample run that illustrates each
 * case. 
 */

import java.util.Scanner;

public class Chapter5Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for three integers
        System.out.print("Please enter three integers: ");
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        // Determine the relationship between the integers
        if (b < c && c < d) {
            System.out.println("Uphill");
        } else if (b > c && c > d) {
            System.out.println("Downhill");
        } else if (b < c && c > d) {
            System.out.println("Mountain");
        } else if (b > c && c < d) {
            System.out.println("Valley");
        } else if (b == c && c == d) {
            System.out.println("Flat");
        } else {
            System.out.println("Miscellaneous");
        }

        // End message
        System.out.println("Happy Trails!");

        // Close the scanner
        scanner.close();
    }
}

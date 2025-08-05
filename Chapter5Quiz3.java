/* Chapter5Quiz3
// Chris Rumble
// July 17, 2025
// Write a Java program that get an int from the user and outputs iscosceles triangles with the given 
// number of rows. The triangle will have an appropriate number of leading spaces in the first row so 
// that there are no leading spaces by the time the last row is reached. See the sample run to guide 
// you. Input of 0 or a negative number ends the program.
 */

import java.util.Scanner;

public class Chapter5Quiz3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;

        while (true) {
            System.out.print("Enter the number of rows or 0 to quit: ");
            rows = scanner.nextInt();

            if (rows <= 0) {
                System.out.println("Bye!");
                break;
            }

            for (int i = 1; i <= rows; i++) {
                // Print leading spaces
                for (int j = i; j < rows; j++) {
                    System.out.print(" ");
                }
                // Print stars
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}


/*
 * Write a Java program that gets three integers b, c an d from the user and
 * indicates whether the three numbers go "uphill" (b < c <d), go "downhill" (b
 * > c > d) , form a "mountain" ( b < c > d) , form a "valley" (b > c < d), are
 * "flat" (a = b = c) or have a "miscellaneous" relation (anything else).
 * 
 * Copy paste your code and the output for a sample run that illustrates each
 * case. Just use material through Chapter 5 (no loops, arrays etc). Hint: You
 * can do it with exactly five uses of the keyword "if" together with five uses
 * of the keyword "else".
 * 
 * 
 * 
 * ____________________________________________________________________________
 * 
 * Six separate sample runs are shown below. (This is NOT output for one run of
 * the program!)
 * 
 * 
 * 
 * Please enter three integers: 3 4 5
 * Uphill
 * Happy Trails!
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Please enter three integers: 8 4 -1
 * Downhill
 * Happy Trails!
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Please enter three integers: 3 8 0
 * Mountain
 * Happy Trails!
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Please enter three integers: 12 9 19
 * Valley
 * Happy Trails!
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Please enter three integers: 3 3 3
 * Flat
 * Happy Trails!
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Please enter three integers: 6 9 9
 * Miscellaneous
 * Happy Trails!
 * 
 * Add comments to your code to explain what it does.
 * 
 */
import java.util.Scanner;

public class Scratchpad {
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

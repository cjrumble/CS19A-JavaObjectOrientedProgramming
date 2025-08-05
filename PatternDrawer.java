// CS19A_Assignment3B_CRUMBLE
// Chris Rumble
// July 12, 2025
// Write a Java program that draws patterns based on the user input. 
// The patterns should be evident based on sample run provided. 
// Copy paste your code and the output for you own sample run the draws 
// 4 patterns  before the user no longer wants to keep playing. 

import java.util.Scanner; // Importing the Scanner class for user input

public class PatternDrawer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console
        String keepPlaying; // Variable to control the loop for repeating the pattern drawing

        do {
            System.out.print("Enter the number of rows: "); // Prompt user for the number of rows
            int rows = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter the first string: "); // Prompt user for the first string
            String firstString = scanner.nextLine();

            System.out.print("Enter the second string: "); // Prompt user for the second string
            String secondString = scanner.nextLine();

            for (int i = 0; i < rows; i++) { // Loop through each row
                // Print first string repeated (i + 1) times
                for (int j = 0; j <= i; j++) { // Loop to print the first string
                    System.out.print(firstString);
                }
                // Print second string repeated (rows - i - 1) times
                for (int j = 0; j < rows - i - 1; j++) { // Loop to print the second string
                    System.out.print(secondString);
                }
                System.out.println(); // Move to the next line after printing one row
            }

            System.out.print("Keep playing? (y/n) "); // Ask user if they want to repeat the pattern drawing
            keepPlaying = scanner.nextLine();
        } while (keepPlaying.equalsIgnoreCase("y")); // Continue if user inputs 'y' or 'Y'

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}

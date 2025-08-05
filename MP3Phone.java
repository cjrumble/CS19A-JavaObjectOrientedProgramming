// CSCI-19A Object-Oriented Programming
// ASSIGN. 6 === Overriding Superclass Methods Problem 4
// 2025/08/02 CRUMBLE

/* Assume the existence of a Phone class with a constructor that accepts two parameters: a string for the phone number followed by a boolean representing whether the phone provides added-value services. Assume a subclass MP3Phone has been defined that has two instance variables: an integer, memorySize. for the size, in megabytes of the phone memory and a boolean, playsAAC, representing whether the phone is capable of playing AAC-encoded audio files.
Write a constructor for MP3Phone that accepts three parameters: a String for the phone number (which is passed up to the Phone constructor, together with the value true for the added-value boolean)), and an integer followed by a boolean for the instance variables */
public class MP3Phone extends Phone {
    private int memorySize; // Size in megabytes of the phone memory
    private boolean playsAAC; // Whether the phone can play AAC-encoded audio files

    // Constructor for MP3Phone
    public MP3Phone(String phoneNumber, int memorySize, boolean playsAAC) {
        super(phoneNumber, true); // Call the Phone constructor with added-value services set to true
        this.memorySize = memorySize; // Set the memory size
        this.playsAAC = playsAAC; // Set whether it plays AAC files
    }

    // Getters for the instance variables
    public int getMemorySize() {
        return memorySize;
    }

    public boolean isPlaysAAC() {
        return playsAAC;
    }
}

// CSCI 19A - Object-Oriented Programming
// 2025/08/02 CRUMBLE
// Assignment: Interfaces and Abstract Classes

// ASSIGN 6 CodeLab === Interfaces 3
/* Regardless of the type of communications device, there must be a way to transmit and receive data.
Define an interface, CommDevice, with two methods:
• transmit, that accepts two parameters -- reference to a Destination object, and a string (in that order), and returns a boolean
• receive, that accepts a parameter of type Duration, and returns a reference to a string */

public interface CommDevice {
    boolean transmit(Destination destination, String data);

    String receive(Duration duration);
}

// ASSIGN 6 CodeLab === Interfaces 4
/*
 * Regardless of its particular nature, all financial accounts provide a way to
 * deposit and withdraw money. Define an interface Account that has two methods:
 * deposit and withdraw, both of which accept a parameter of type Cash and
 * return a boolean
 */
public interface Account {
    boolean deposit(Cash amount);

    boolean withdraw(Cash amount);
}

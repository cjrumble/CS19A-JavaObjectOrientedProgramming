// CSCI 19-A Object-Oriented Programming
// ASSIGN6 ===AbstractClasses Problem #4
// 2025/08/02 CRUMBLE
/*
 * Write a class definition for an abstract class, Vehicle, that contains:
• a double instance variable, maxSpeed
• a protected double instance variable, currentSpeed
• a constructor accepting a double used to initialize the maxSpeed instance variable
• an abstract method, accelerate, that accepts no parameters and returns nothing.
• a method getCurrentSpeed that returns the value of currentSpeed
• a method getMaxSpeed that returns the value of maxSpeed
• a method, pedalToTheMetal, that repeatedly calls accelerate until the speed of the vehicle is equal to maxSpeed. pedalToTheMetal returns nothing.
 */

public abstract class Vehicle {
    private double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0.0; // Initialize current speed to 0
    }

    public abstract void accelerate();

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void pedalToTheMetal() {
        while (currentSpeed < maxSpeed) {
            accelerate();
        }
    }
}

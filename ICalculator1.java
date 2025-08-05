/*
 * Assume the availability of an existing class, ICalculator, that models an integer arithmetic calculator and contains:
• an instance variable currentValue that stores the current int value of the calculator
• a getter method for the above instance variable
• methods add, sub, mul, and div
Each method in ICalculator receives an int argument and applies its operation to currentValue and returns the new value of currentValue. So, if currentValue has the value 8 and sub(6) is
invoked then currentValue ends up with the value 2, and 2 is returned
So, you are to write the definition of a subclass, ICalculator1, based on ICalculator. The class ICalculator has one additional method, sign, that receives no arguments, and doesn't modifv currentvalue. Instead, it simply returns 1, O or -1 depending on the whether currentValue is positive, zero, or negative respectively.
 */
public class ICalculator1 extends ICalculator {

    /**
     * Returns 1 if currentValue is positive, 0 if it is zero, and -1 if it is
     * negative.
     *
     * @return an integer representing the sign of currentValue
     */
    public int sign() {
        if (getCurrentValue() > 0) {
            return 1;
        } else if (getCurrentValue() == 0) {
            return 0;
        } else {
            return -1;
        }
    }
    // Inherits add, sub, mul, and div methods from ICalculator
    // Inherits currentValue and its getter method from ICalculator
    // No additional instance variables needed
    // No additional methods needed beyond sign
}

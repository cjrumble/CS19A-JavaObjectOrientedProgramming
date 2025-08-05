// CSCI-19A Object-Oriented Programming
// ASSIGN 6 > ===Abstract Classes Problem #3
// 2025/08/02 CRUMBLE

/* Given the abstract class, RentableDwelling, containing:
• a (private) double instance variable, rentPerUnit
• a constructor accepting a double used to initialize rentPerUnit
• a method, getRentPerUnit that returns the value of rentPerUnit
• an abstract method getRentalIncome that returns a double
Write a (non-abstract) subclass, ApartmentHouse, containing:
• an int instance variable numberOfApartments
• a constructor accepting a double, passed to the superclass constructor, and an int used to initialize numberOfApartments
• the method getRentalIncome calculated as the product of numberOfApartments and the rent per unit. getRentalIncome returns a double.*/
public abstract class RentableDwelling {
    private double rentPerUnit;

    public RentableDwelling(double rentPerUnit) {
        this.rentPerUnit = rentPerUnit;
    }

    public double getRentPerUnit() {
        return rentPerUnit;
    }

    public abstract double getRentalIncome();
}

public class ApartmentHouse extends RentableDwelling {
    private int numberOfApartments;

    public ApartmentHouse(double rentPerUnit, int numberOfApartments) {
        super(rentPerUnit);
        this.numberOfApartments = numberOfApartments;
    }

    @Override
    public double getRentalIncome() {
        return numberOfApartments * getRentPerUnit();
    }
}

// CSCI-19A Object-Oriented Programming
// ASSIGN 6 Overriding Superclass Methods Problem 3

/* Many city ordinances have a requirement that buildings be surrounded by a certain amount of empty space for sunlight and fresh air. Apartment buildings-- begin residences and in particular multiple dwelling, usually have higher requirements than commercial or single residence properties. These requirements are often based upon square footage, number of occupants. etc
Assume the existence of a class Building with a method getRequiredEmptySpace that returns the amount of empty space (as an integer representing square feet) for the building. Assume further a subclass ApartmentBuilding with two integer instance variables• totalUnits representing the number of apartments in the building and maxOccupantsPerUnit represents the
maximum number of people allowed in each unit by law.
Override getRequiredEmptySpace in ApartmentBuilding to reflect the fact that apartment buildings require an additional square foot of empty space around it for each potential person living in the building */

public class Building {
    public int getRequiredEmptySpace() {
        // Default implementation for general buildings
        return 100; // Example value, can be adjusted
    }
}

public class ApartmentBuilding extends Building {
    private int totalUnits;
    private int maxOccupantsPerUnit;

    public ApartmentBuilding(int totalUnits, int maxOccupantsPerUnit) {
        this.totalUnits = totalUnits;
        this.maxOccupantsPerUnit = maxOccupantsPerUnit;
    }

    @Override
    public int getRequiredEmptySpace() {
        // Calculate the required empty space based on the number of units and maximum
        // occupants
        int additionalSpace = totalUnits * maxOccupantsPerUnit;
        return super.getRequiredEmptySpace() + additionalSpace;
    }
}

public class Main {
    public static void main(String[] args) {
        Building generalBuilding = new Building();
        System.out.println(
                "Required empty space for general building: " + generalBuilding.getRequiredEmptySpace() + " sq ft");

        ApartmentBuilding apartmentBuilding = new ApartmentBuilding(10, 3);
        System.out.println(
                "Required empty space for apartment building: " + apartmentBuilding.getRequiredEmptySpace() + " sq ft");
    }
}

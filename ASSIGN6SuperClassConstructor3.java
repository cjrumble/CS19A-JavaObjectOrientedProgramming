// CSCI-19A Object-Oriented Programming
// ASSIGN. 6 === Invoking the Superclass Constructor Problem 3

/*
 * The superclass, EducationalInstitution, contains:
• an int instance variable, duration, indicating the standard number of years spent at the institution
• A constructor that accepts an int which is used to initialize the duration instance variable
• a method graduationRequirements that returns a String. The (default) behavior of graduationRequirements is to return a String stating "d years of study", where d is the value of the
duration instance variable.
Write a class definition for the subclass LawSchool that contains:
• a (default) constructor that invokes the superclass constructor with the value 3 (law school is typically a three year program).
• a (overridden) method graduationRequirements that returns the string "3 years of study and passing the bar". You MUST invoke the graduationRequirements method of the superclass in this method (to obtain the first portion of the resulting string)
 */
public class EducationalInstitution {
    protected int duration;

    public EducationalInstitution(int duration) {
        this.duration = duration;
    }

    public String graduationRequirements() {
        return duration + " years of study";
    }
}

public class LawSchool extends EducationalInstitution {

    public LawSchool() {
        super(3); // Invokes the superclass constructor
    }

    @Override
    public String graduationRequirements() {
        return super.graduationRequirements() + " and passing the bar"; // Invokes the
        // graduationRequirements method of the superclass
    }
}

public class Main {
    public static void main(String[] args) {
        LawSchool lawSchool = new LawSchool();
        System.out.println(lawSchool.graduationRequirements()); // Output: 3 years of study and passing the bar
    }
}

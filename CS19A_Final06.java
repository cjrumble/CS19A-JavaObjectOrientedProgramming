/*
 * Fill in the blanks appropriately. There is only one correct answer for each
 * blank, so think carefully before you fill it in.
 * 
 * class Person {
 * private Person spouse; // current Person's spouse or null if the Person isn't
 * married
 * public final String name; // Note: it's possible that two diff. people have
 * same name.
 * public Person(String name) {this.name = name;}
 * Person marry(Person p) // p is the prospective spouse of the the current
 * Person
 * {
 * if (_______________________________) // current object and p are the same
 * Person
 * System.out.println("Silly "+ name +". You can't marry yourself!");
 * else if (_____________________________) // current Person is already married
 * if (____________________________) // current Person and p are already married
 * System.out.println(name + ", you don't need to marry " + p.name
 * + " since you guys are already married!");
 * else
 * System.out.println("Sorry "+ name + ", you'll  need to divorce "
 * + spouse.name + " before marrying " + p.name + ".");
 * else if (_____________________________) // p is already married
 * System.out.println("Sorry " + name + ", you'll need to convince "
 * + p.name + " to divorce " + p.spouse.name + " first.");
 * else {
 * _______________________________________
 * _______________________________________
 * System.out.println( "Congratulations " + name + " and "
 * + p.name + ", you are now married!");
 * }
 * return _________________________; // return the current object
 * }
 * Person divorce() {
 * if (_______________________)
 * System.out.println(name + ", you're single, so there's nobody to divorce.");
 * else {
 * String nom = spouse.name; // Save the spouse's name in a temp variable
 * ________________________________________; // Perform the divorce…
 * ________________________________________; // …using two statements.
 * System.out.println("Divorce complete: " + name + " and  "
 * + nom + " are no longer married." );
 * }
 * return _____________________________; // return the current object
 * }
 * Person getSpouse() {return spouse;}
 * // Return a string of the form "<Name: Tam, Spouse: Richard>" or
 * "<Name: Tam, unmarried>"
 * public String toString() {
 * ____________________________________________________________________________________________
 * }
 * } // end of Person class
 */

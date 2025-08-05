/*
 * Implement an abstract Mammal class and concrete (not abstract) derived classes Elephant and Cat. 

Mammal should have constructor
public Mammal(double weight, char gender) {…}
along with…
fields
	protected double weight; // must be positive
	public final char gender;

one abstract method 	
void makeSound(); 

and  concrete methods 

void setWeight(double weight){} 
double getWeight() {}
String toString() {} // return object's class name and data as a String


Use appropriate access modifiers for each method.   
Elephant should extend Mammal with a new public  final field trunkLength of type int (which must be at least 2). Include a three-parameter constructor to initialize the fields weight and gender via the Mammal constructor  and to initialize trunkLength appropriately. Also  override makeSound() to output "Rumble!" and  override toString()  appropriately. 
Cat should extend Mammal and with no new fields. Override just makeSound() to output "Purr!"  and include an appropriate two-parameter constructor.
abstract class Mammal  {
}

class Elephant extends Mammal {
}
class Cat extends Mammal {
}

 */
abstract class Mammal {
    protected double weight; // must be positive
    public
    final char

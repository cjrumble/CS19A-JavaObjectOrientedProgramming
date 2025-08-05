/*
 * Suppose I have implemented classes C and D, where D extends C.  After that, I plan to write code in which a variable of type D refers to an object of type C.  Explain why Java (wisely) will make it impossible for me to achieve my goal.  Provide a simple example to illustrate the issue.
 */

public class Main {
    public static void main(String[] args) {
        C c = new C();
        // The following line will cause a compile-time error
        // D d = c; // This is not allowed in Java

        // Correct way to create an instance of D
        D d = new D();
        d.display(); // This works fine
    }
}

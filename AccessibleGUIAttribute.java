// CSCI-19A Object-Oriented Programming
// ASSIGN 6 === Interfaces Problem #1
// 20025-08-02 CRUMBLE

/*
 * Many systems provide the ability to have alternatives to visual or other sensory attributes (such as color or sound) for the purpose of accessibility (for example a picture to be displayed on a
Web page may have a textual alternative that could be read by a text-to-speech peripheral for the visually impaired).
Define an interface AccessibleGUIAttribute that contains a single method, getAlternativeText, that returns a string representing the textual alternative of an object, getAlternative accepts no parameters.
 */
public interface AccessibleGUIAttribute {
    String getAlternativeText();
}

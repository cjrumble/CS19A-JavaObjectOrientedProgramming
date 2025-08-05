// CSCI-19A Object-Oriented Programming
// ASSIGN 6 === Overriding Superclass Methods Problem 4
// 2025/08/02 CRUMBLE

/* A Color class has a method getColorName that returns a string corresponding to the common name for the color, e.g., yellow, blue, white, etc. If there is no common name associated with the color, null is returned.
The class, AlphaChannelColor-- a subclass of Color-- has an integer instance variable, alpha, containing the alpha channel value, representing the degree of transparency of the color.
Write the method getColorName of AlphaChannelColor, that overrides the method in the Color class. AlphaChannelColor's getColorName should return the name of the color (obtained from the getColorName method of Color) prefixed with the word 'opaque' it the alpha value is less than 100, 'semi-transparent' if the alpha value is otherwise less than 200, and 'transparent' otherwise (separate the prefix from the color name by a blank). If the color has no name, the method should return "opaque color", "semi-transparent color", or "transparent color". according the the same alpha values as above */
public class AlphaChannelColor extends Color {
    private int alpha;

    public AlphaChannelColor(int alpha) {
        this.alpha = alpha;
    }

    @Override
    public String getColorName() {
        String colorName = super.getColorName();
        String prefix;

        if (alpha < 100) {
            prefix = "opaque";
        } else if (alpha < 200) {
            prefix = "semi-transparent";
        } else {
            prefix = "transparent";
        }

        if (colorName == null) {
            return prefix + " color";
        } else {
            return prefix + " " + colorName;
        }
    }
}

public class Color {
    public String getColorName() {
        // This method should be overridden in subclasses
        return null; // Default implementation returns null
    }
}

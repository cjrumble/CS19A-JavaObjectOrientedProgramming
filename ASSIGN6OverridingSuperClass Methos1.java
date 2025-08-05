// CSCI-19A Object-Oriented Programming
// Assignment: 1 ASSIGN 6 ===Overriding superCloss Methods
// 2025/08/02  CRUMBLE

/* Assume the existence ot a Window class with a method getClientAreaHeight that returns an integer representing the height of the portion of the window that an application program can use for its displav. Assume also a subclass BorderedWindow with an integer instance variable borderSize that represents the size of the border around the window.
Override the getClientAreaHeight method in BorderWindow to return the client area height as returned by the superclass minus the border size (takina into account top and bottom borders) */
public class Window {
    public int getClientAreaHeight() {
        // Assume some implementation that returns the height of the client area
        return 500; // Example value
    }
}

public class BorderedWindow extends Window {
    private int borderSize;

    public BorderedWindow(int borderSize) {
        this.borderSize = borderSize;
    }

    @Override
    public int getClientAreaHeight() {
        // Call the superclass method and subtract the top and bottom border sizes
        return super.getClientAreaHeight() - (2 * borderSize);
    }
}

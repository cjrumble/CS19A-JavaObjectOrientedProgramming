// CSCI-19A Object-Oriented Programming
// ASSIGN 6 Abstract Classes Problem 2
// 2025/08/02 CRUMBLE

/*
 * Provide the definition of an abstract class named DesktopComponent that contains the following: - a void (abstract) method, onClicked, that accepts no parameters and is to be supplied by a subclass. - a (private) string named type, describing the sort of Desktop component (e.g. window, icon, taskbar, etc.
- a constructor accepting a string that is used to initialize the type instance variable
 */
public abstract class DesktopComponent {
    private String type;

    public DesktopComponent(String type) {
        this.type = type;
    }

    public abstract void onClicked();
    }
}

// CSCI-19A Object-Oriented Programming
// ASSIGN 6 ===Interfaces Problem #2
// 20025/08/02 CRUMBLE

/* Windows on the desktop are just one ot many objects used in a graphical user intertace (GUI)-- buttons, drop-down list boxes, pop-up menus, are just some ot the many others. Regardless of their particular appearance, tasks, and structure, all such GUI components share some common functionalit-- which is handled in a manner unique to the actual component
Define an interface, GUIComponent, with the following methods:
• onClick-- void-returning and accepts a single integer parameter
• onCursorFocus -- void-returning and accepts a single integer parameter
• move -- 3 overloaded methods: all boolean-returning: one accepts a pair of integer parameters: the second a single parameter of type Position: the third a single parameter ot type Dimension
• resize-- boolean-returning and accepts a pair of integer parameters
*/

public interface GUIComponent {
    void onClick(int buttonId);

    void onCursorFocus(int cursorId);

    boolean move(int x, int y);

    boolean move(Position position);

    boolean move(Dimension dimension);

    boolean resize(int width, int height);
}

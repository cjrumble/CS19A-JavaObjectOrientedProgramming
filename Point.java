/*
 * Suppose we have the class Point shown below
public class Point {
    	private double x, y;  // the Point’s first and second coordinates: (x,y)
public Point(double x, double y)
{
this.x = x;
this.y = y;
		}
		// possibly other methods that you don’t need for this question
}

Implement a method  getMidpoint(Point p) of the Point class that returns a Point object midway between the current object and p. For example, if the current object has coordinates (2.0, 3.0) and p has coordinates (5.0, 7.0) then the return value would be a new Point object with coordinates (3.5, 5.0). Notice: 3.5 = (2+5)/2 and 5 = (3+7)/2.
 */

public class Point {
    private double x, y; // the Point’s first and second coordinates: (x,y)

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point getMidpoint(Point p) {
        double midX = (this.x + p.x) / 2;
        double midY = (this.y + p.y) / 2;
        return new Point(midX, midY);
    }

// possibly other methods that you don’t need for this question

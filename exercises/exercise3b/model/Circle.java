package exercises.exercise3b.model;

public class Circle extends Shape{
    public static String name = "Circle Class";

    public Circle(){}

    public Circle(float radius) {
        super(radius);
    }

    public double calculateArea()
    {
        return 3.14 * getHeight() * getHeight();
    }
}

package exercises.exercise2.model;

public class Circle extends Shape{
    public static String color = "Blue";

    public Circle(float radius) {
        super(radius);
    }

    public double calculateArea()
    {
        return 3.14 * getHeight() * getHeight();
    }
}

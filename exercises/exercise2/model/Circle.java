package exercises.exercise2.model;

public class Circle extends Shape{

    public static String name = "Circle Class";

    public Circle(float radius) {
        super(radius);
    }

    @Override
    public double calculateArea()
    {
        return 3.14 * getHeight() * getHeight();
    }
}

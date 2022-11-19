package exercises.exercise2.model;

public class Rectangle extends Shape{
    public Rectangle(float height, float width) {
        super(height, width);
    }

    @Override
    public double calculateArea()
    {
        return getHeight() * getWidth();
    }
}


package exercises.exercise3b.model;

public class Rectangle extends Shape{

    public Rectangle(){}

    public Rectangle(float height, float width) {
        super(height, width);
    }

    @Override
    public double calculateArea()
    {
        return getHeight() * getWidth();
    }
}


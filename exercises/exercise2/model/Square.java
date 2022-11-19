package exercises.exercise2.model;

public class Square extends Shape{
    public Square(float length) {
        super(length);
    }

    @Override
    public double calculateArea()
    {
        return getHeight();
    }
}

package exercises.exercise3b.model;

public class Square extends Shape{

    public Square(){}

    public Square(float length) {
        super(length);
    }

    @Override
    public double calculateArea()
    {
        return getHeight();
    }
}

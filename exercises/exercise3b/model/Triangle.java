package exercises.exercise3b.model;

public class Triangle extends Shape{

    public Triangle(){}

    public Triangle(float height, float width) {
        super(height, width);
    }

    @Override
    public double calculateArea() {
        return (getWidth() * getHeight()) / 2;
    }
}

package exercises.exercise1.model;

public abstract class Shape {
    private float height;
    private float width;

    public Shape(float height) {
        this.height = height;
    }
    
    public Shape(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public abstract double calculateArea();
}
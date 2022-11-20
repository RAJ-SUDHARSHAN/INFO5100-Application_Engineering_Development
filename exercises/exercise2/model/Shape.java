package exercises.exercise2.model;

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

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public abstract double calculateArea();
}
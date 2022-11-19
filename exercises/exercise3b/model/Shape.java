package exercises.exercise3b.model;

import java.io.Serializable;

public abstract class Shape implements Serializable{
    private float height;
    private float width;

    public Shape(){}

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
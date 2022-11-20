// import exercise2.model.*;
package exercises.exercise2;

import exercises.exercise2.model.Circle;
import exercises.exercise2.model.Rectangle;
import exercises.exercise2.model.Shape;
import exercises.exercise2.model.Square;
import exercises.exercise2.model.Triangle;

public class Main {
    public static void main(String[] args) {
        float length = 15f;
        float width = 20f;
        float height = 10f;
        
        // Abstraction, Overriding, Polymorphism
        Shape s1 = new Triangle(height, length);
        System.out.println("Area of Triangle: " + s1.calculateArea());

        Shape s2 = new Rectangle(length, width);
        System.out.println("Area of Rectangle: " + s2.calculateArea());

        Shape s3 = new Circle(height);
        System.out.println("Area of Circle: " + s3.calculateArea());

        // Static Field
        System.out.println("Circle name: " +  Circle.name);

        Shape s4 = new Square(length);
        System.out.println("Square area: " + s4.calculateArea());
    }
}

// import exercise2.model.*;
package exercises.exercise3b;

import java.io.*;

import exercises.exercise3b.model.*;

public class Exercise3b {
    public static void main(String[] args) {
        float length = 15f;
        float width = 20f;
        float height = 10f;

        // Triangle
        Shape triangle = new Triangle(height, length);

        // Serialization
        try {
            FileOutputStream file = new FileOutputStream("serializedTriangle.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(triangle);
            out.close();
            file.close();

            System.out.println("Triangle instance has been serialized");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Deserialization
        Triangle t = new Triangle();
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream("serializedTriangle.txt");
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            t = (Triangle) in.readObject();

            in.close();
            file.close();

            System.out.println("Triangle instance has been deserialized");

        }

        catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }

        System.out.println("Area of Triangle: " + t.calculateArea());
        System.out.println("----------------------------------------------");

        // ---------------------------------------------------------------------------------------------------------------------------------------

        // Rectangle
        Shape rectangle = new Rectangle(length, width);

        // Serialization
        try {
            FileOutputStream file = new FileOutputStream("serializedRectangle.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(rectangle);
            out.close();
            file.close();

            System.out.println("Rectangle instance has been serialized");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Deserialization
        Shape r = new Rectangle();
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream("serializedRectangle.txt");
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            r = (Rectangle) in.readObject();

            in.close();
            file.close();

            System.out.println("Rectangle instance has been deserialized");

        }

        catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }

        System.out.println("Area of Rectangle: " + r.calculateArea());
        System.out.println("----------------------------------------------");

        // ---------------------------------------------------------------------------------------------------------------------------------------

        // Circle
        Shape circle = new Circle(height);

        // Serialization
        try {
            FileOutputStream file = new FileOutputStream("serializedCircle.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(circle);
            out.close();
            file.close();

            System.out.println("Circle instance has been serialized");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Deserialization
        Shape c = new Circle();
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream("serializedCircle.txt");
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            c = (Circle) in.readObject();

            in.close();
            file.close();

            System.out.println("Circle instance has been deserialized");

        }

        catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }

        System.out.println("Area of Circle: " + c.calculateArea());
        
        // Static Field
        System.out.println("Circle name: " + Circle.name);
        System.out.println("----------------------------------------------");
        
        // ---------------------------------------------------------------------------------------------------------------------------------------

        // Square
        Shape square = new Square(length);
        // Serialization
        try {
            FileOutputStream file = new FileOutputStream("serializedSquare.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(square);
            out.close();
            file.close();

            System.out.println("Square instance has been serialized");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Deserialization
        Shape s = new Square();
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream("serializedSquare.txt");
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            s = (Square) in.readObject();

            in.close();
            file.close();

            System.out.println("Square instance has been deserialized");

        }

        catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }

        System.out.println("Area of Square: " + s.calculateArea());
        System.out.println("----------------------------------------------");

    }
}

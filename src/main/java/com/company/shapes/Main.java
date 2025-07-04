package com.company.shapes;

import com.company.shapes.shape_diameter.Circle;
import com.company.shapes.shape_perimeter.Rectangle;
import com.company.shapes.shape_perimeter.ShapeWithPerimeter;
import com.company.shapes.shape_perimeter.Square;
import com.company.shapes.shape_perimeter.Triangle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, "Blue");
        Square square = new Square(2, "White");
        Rectangle rectangle = new Rectangle(2, 6, "Green");
        Circle circle = new Circle(8, "Pink");

        ArrayList<ShapeWithPerimeter> shapeWithPerimeters = new ArrayList<>();
        shapeWithPerimeters.add(triangle);
        shapeWithPerimeters.add(rectangle);
        shapeWithPerimeters.add(square);

        for (ShapeWithPerimeter swp : shapeWithPerimeters) {
            System.out.println("\nName of the shape is: " + swp.name);
            System.out.println("Area: " + swp.calculateArea());
            System.out.println("Perimeter: " + swp.calculatePerimeter());
            System.out.println(swp.draw());
            System.out.println("Color: " + swp.color);
            System.out.println(Shape.numberOfObjectsCreated);
            System.out.println();
        }

        System.out.println("\nName of the shape is: " + circle.name);
        System.out.println("Area of the circle is " + circle.calculateArea());
        System.out.println(circle.draw());
        System.out.println("Color of the Circle is " + circle.color);

        /* BELOW CODE IS THE PREVIOUS VERSION CONTAINS printObjectCount() METHOD AND
        ARRAY LIST FOR SHAPE CLASS

        Triangle triangle1 = new Triangle(5, "Black");
        Triangle triangle2 = new Triangle(6, "Black");
        System.out.println("Area of the triangle is " + triangle.calculateArea());
        System.out.println("Perimeter of the triangle is " + triangle.calculatePerimeter());
        System.out.println(triangle.draw());
        System.out.println("Color of the triangle is " + triangle.color);
        System.out.println(Triangle.printObjectCount());


        Square square1 = new Square(3, "Brown");
        System.out.println("\nArea of the square is " + square.calculateArea());
        System.out.println("Perimeter of the square is " + square.calculatePerimeter());
        System.out.println(square.draw());
        System.out.println("Color of the Square is " + square.color);
        System.out.println(Square.printObjectCount());


        System.out.println("\nArea of the rectangle is " + rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle is " + rectangle.calculatePerimeter());
        System.out.println(rectangle.draw());
        System.out.println("Color of the Rectangle is " + rectangle.color);
        System.out.println(Rectangle.printObjectCount());


        Circle circle1 = new Circle(9, "Blue");


        List<Shape> shapesList = new ArrayList<>();
        shapesList.add(triangle);
        shapesList.add(square);
        shapesList.add(rectangle);
        shapesList.add(circle);

        for (Shape sh: shapesList) {
            System.out.println("Name of the shape is: " + sh.name);
            System.out.println("\nArea: " + sh.calculateArea());
            System.out.println("Perimeter: " + );
            System.out.println(sh.draw());
            System.out.println("Color: " + sh.color);
            System.out.println();
        };

      */

    }
}

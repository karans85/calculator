package com.company.shapes.shape_perimeter;

import com.company.shapes.constant.ShapeName;

public class Rectangle extends ShapeWithPerimeter {
    double a, b;

    public Rectangle(double a, double b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
        this.name = ShapeName.RECTANGLE;
        numberOfObjectsCreated++;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return (a + b) * 2;
    }

}

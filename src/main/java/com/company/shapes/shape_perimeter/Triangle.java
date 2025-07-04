package com.company.shapes.shape_perimeter;

import com.company.shapes.constant.ShapeName;

public class Triangle extends ShapeWithPerimeter {
    double b;

    public Triangle(double b, String color) {
        this.b = b;
        this.name = ShapeName.TRIANGLE;
        this.color = color;
        numberOfObjectsCreated++;
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * b * b;
    }

    @Override
    public double calculatePerimeter() {
        return b + b + b;
    }

}

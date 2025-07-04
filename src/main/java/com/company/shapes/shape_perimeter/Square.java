package com.company.shapes.shape_perimeter;

import com.company.shapes.constant.ShapeName;

public class Square extends ShapeWithPerimeter {
    double a;

    public Square(double a, String color) {
        this.a = a;
        this.color = color;
        this.name = ShapeName.SQUARE;
        numberOfObjectsCreated++;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public double calculatePerimeter() {
        return a * 4;
    }

}

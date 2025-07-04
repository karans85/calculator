package com.company.shapes.shape_diameter;

import com.company.shapes.constant.ShapeName;

public class Circle extends ShapeWithDiameter {

    static int numberOfObjectsCreated = 0;

    public Circle(double r, String color) {
        this.r = r;
        this.d = 2 * r;
        this.color = color;
        this.name = ShapeName.CIRCLE;
        numberOfObjectsCreated++;
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }
}

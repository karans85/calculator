package com.company.shapes.shape_diameter;

import com.company.shapes.Shape;

public abstract class ShapeWithDiameter extends Shape {
    double d;
    double r;

    @Override
    public String draw() {
        String circleMessage = "I am drawing " + name;
        return circleMessage;
    }
}

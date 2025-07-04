package com.company.shapes.shape_perimeter;

import com.company.shapes.Shape;

public abstract class ShapeWithPerimeter extends Shape {
    public abstract double calculatePerimeter();

    @Override
    public String draw() {
        String rectangleMessage = "I am drawing " + name;
        return rectangleMessage;
    }
}

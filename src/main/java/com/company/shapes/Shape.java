package com.company.shapes;

public abstract class Shape implements iShape {

    protected String name;
    protected String color;
    protected static int numberOfObjectsCreated;

    @Override
    public abstract double calculateArea();

    @Override
    public abstract String draw();


    public static String printObjectCount() {
        return "NUmber of objects created " + numberOfObjectsCreated;
    }

}

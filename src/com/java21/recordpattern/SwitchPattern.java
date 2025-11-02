package com.java21.recordpattern;

public class SwitchPattern {
    static double area (Shape s) {
        return switch (s) {
            case Circle c -> Math.PI * c.radius() * c.radius();
            case Rectangle r -> r.length() * r.width();
            default -> throw new IllegalStateException("Unknown shape: " + s);
        };
    }
    public static void main(String [] args) {
        SwitchPattern switchPattern= new SwitchPattern();
       System.out.println(switchPattern.area(new Circle(12)));
        System.out.println(switchPattern.area(new Rectangle(12,12)));

    }
}

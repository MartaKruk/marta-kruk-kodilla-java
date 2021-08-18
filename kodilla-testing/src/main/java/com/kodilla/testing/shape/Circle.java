package com.kodilla.testing.shape;

public class Circle implements Shape {

    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return r == circle.r;
    }

    @Override
    public int hashCode() {
        return r;
    }

    public String getShapeName() {
        return "circle";
    }
    public double getField() {
        double field = 3.14 * (double) r * (double) r;
        return field;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}

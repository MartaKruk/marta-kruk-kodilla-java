package com.kodilla.testing.shape;

public class Square implements Shape {

    int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return a == square.a;
    }

    @Override
    public int hashCode() {
        return a;
    }

    public String getShapeName() {
        return "square";
    }
    public double getField() {
        double field = (double) a * (double) a;
        return field;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}

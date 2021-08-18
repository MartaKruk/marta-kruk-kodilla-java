package com.kodilla.testing.shape;

public class Triangle implements Shape {

    int a;
    int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public int getH() {
        return h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (a != triangle.a) return false;
        return h == triangle.h;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + h;
        return result;
    }

    public String getShapeName() {
        return "triangle";
    }
    public double getField() {
        double field = ((double) a * (double) h)/2;
        return field;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", h=" + h +
                '}';
    }
}

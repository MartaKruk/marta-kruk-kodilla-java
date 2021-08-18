package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeCollector = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeCollector.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapeCollector.contains(shape)) {
            shapeCollector.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        return shapeCollector.get(n);
    }

    public String showFigures() {
        String figString = "";
        for (Shape shape : shapeCollector) {
            figString += shape;
        }
        return figString;
    }

    public int getFigureCount() {
        return shapeCollector.size();
    }

}

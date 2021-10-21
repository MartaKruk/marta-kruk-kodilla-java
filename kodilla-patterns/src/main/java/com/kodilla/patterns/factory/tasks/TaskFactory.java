package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "oranges",10.0);
            case PAINTING:
                return new PaintingTask("Painting", "green", "cupboard");
            case DRIVING:
                return new DrivingTask("Driving", "home", "car");
            default:
                return null;
        }

    }


}

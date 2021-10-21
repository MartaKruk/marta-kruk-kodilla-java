package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    private final TaskFactory factory = new TaskFactory();

    @Test
    void testFactoryShopping() {
        //Given
        //When
        Task shopping = factory.createTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("Shopping", shopping.getTaskName());
        assertFalse(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        //Given
        //When
        Task painting = factory.createTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        assertEquals("Painting", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryDriving() {
        //Given
        //When
        Task driving = factory.createTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        assertEquals("Driving", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }
}

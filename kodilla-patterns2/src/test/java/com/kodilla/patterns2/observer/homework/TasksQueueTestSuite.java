package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasksQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        TasksQueue student1TasksQueue = new TasksQueue("Student1");
        TasksQueue student2TasksQueue = new TasksQueue("Student2");
        TasksQueue student3TasksQueue = new TasksQueue("Student3");
        Mentor mentor1 = new Mentor("Mentor1");
        Mentor mentor2 = new Mentor("Mentor2");
        student1TasksQueue.registerObserver(mentor1);
        student2TasksQueue.registerObserver(mentor2);
        student3TasksQueue.registerObserver(mentor2);
        //When
        student1TasksQueue.addTask("Sample task");
        student1TasksQueue.addTask("Sample task");
        student2TasksQueue.addTask("Sample task");
        student2TasksQueue.addTask("Sample task");
        student3TasksQueue.addTask("Sample task");
        //Then
        assertEquals(2, mentor1.getUpdateCount());
        assertEquals(3, mentor2.getUpdateCount());
    }
}

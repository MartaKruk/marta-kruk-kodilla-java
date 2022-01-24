package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksQueue implements Observable {
    private final String student;
    private final List<String> tasks;
    private final List<Observer> observers;

    public TasksQueue(String student) {
        this.student = student;
        this.tasks = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getStudent() {
        return student;
    }

    public List<String> getTasks() {
        return tasks;
    }
}

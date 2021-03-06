package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2,1);
        } catch (Exception e) {
            System.out.println("Try different numbers!");
        }
        finally {
            System.out.println("Done");
        }
    }
}

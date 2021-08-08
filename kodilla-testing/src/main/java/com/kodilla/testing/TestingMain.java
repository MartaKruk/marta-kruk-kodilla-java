package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("TheForumUser");

        String result = simpleUser.getUsername();
        
        if (result.equals("TheForumUser")) {
            System.out.println("test OK");
        }
        else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int addingResult = calculator.add(1,2);

        if(addingResult == 1+2) {
            System.out.println("Adding function: test OK!");
        }
        else {
            System.out.println("Adding function: error");
        }

        int substractingResult = calculator.substract(2,1);

        if(substractingResult == 2-1) {
            System.out.println("Substracting function: test OK!");
        }
        else {
            System.out.println("Substracting function: error");
        }
    }
}

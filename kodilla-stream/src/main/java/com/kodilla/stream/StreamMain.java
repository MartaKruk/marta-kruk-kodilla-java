package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("There are more things in heaven and earth, Horatio, than are dreamt of in your philosophy.", (poem) -> "ABC" + poem + "ABC");
        poemBeautifier.beautify("There are more things in heaven and earth, Horatio, than are dreamt of in your philosophy.", (poem) -> poem.toUpperCase());
        poemBeautifier.beautify("There are more things in heaven and earth, Horatio, than are dreamt of in your philosophy.", (poem) -> "*~* " + poem.toLowerCase() + " *~*");
        poemBeautifier.beautify("There are more things in heaven and earth, Horatio, than are dreamt of in your philosophy.", (poem) -> "\n" + poem + "\n");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}

package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String poem, PoemDecorator poemDecorator) {
        String changedPoem = poemDecorator.decorate(poem);
        System.out.println(changedPoem);
    }
}

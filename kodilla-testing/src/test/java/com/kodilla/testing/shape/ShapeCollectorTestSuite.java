package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test Suite \u2B1C\u25B3\u20DD")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Executing test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests of adding and removing figures")
    class TestAddRemove {

        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(2);
            //When
            shapeCollector.addFigure(circle);
            //Then
            Assertions.assertEquals(circle, shapeCollector.getFigure(0));
            Assertions.assertEquals(1, shapeCollector.getFigureCount());
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(2);
            shapeCollector.addFigure(circle);
            //When
            boolean result = shapeCollector.removeFigure(circle);
            //Then
            Assertions.assertTrue(result);
        }

        @Test
        void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(2);
            //When
            boolean result = shapeCollector.removeFigure(circle);
            //Then
            Assertions.assertFalse(result);
        }
    }

    @Nested
    @DisplayName("Tests of retrieving figures")
    class TestRetrieve {

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(2);
            shapeCollector.addFigure(circle);
            Shape triangle = new Triangle(8, 5);
            shapeCollector.addFigure(triangle);
            Shape square = new Square(6);
            shapeCollector.addFigure(square);
            //When
            Shape retrievedShape = shapeCollector.getFigure(1);
            //Then
            Assertions.assertEquals(triangle, retrievedShape);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(2);
            shapeCollector.addFigure(circle);
            Shape triangle = new Triangle(8, 5);
            shapeCollector.addFigure(triangle);
            Shape square = new Square(6);
            shapeCollector.addFigure(square);
            //When
            String result = shapeCollector.showFigures();
            String expectedResult = "Circle{r=2}Triangle{a=8, h=5}Square{a=6}";
            //Then
            Assertions.assertEquals(expectedResult, result);
        }
    }
}

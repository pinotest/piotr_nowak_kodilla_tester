package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int subtract = calculator.subtract(a,b);
        boolean correctSub = ResultChecker.assertEquals(-3, subtract);
        if (correctSub) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }
        double square = calculator.square(a);
        boolean correctSquare = ResultChecker.assertEquals(25, square);
        if (correctSub) {
            System.out.println("Metoda squere działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda squere nie działa poprawnie dla liczb " + a );
        }

    }
}

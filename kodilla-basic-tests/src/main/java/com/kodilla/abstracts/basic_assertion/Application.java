package com.kodilla.abstracts.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 4;
        int squareResults = calculator.square(a);
        boolean correct = ResultChecker.assertEquals(16,squareResults);
        if (correct) {
            System.out.println("Metoda square działa poprawnie dla liczb " + ( a * a ) );
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczb " + ( a * a ) );
        }
    }
}

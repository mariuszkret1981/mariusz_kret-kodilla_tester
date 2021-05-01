package com.kodilla.abstracts.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 4;
        int subtractResults = calculator.subtract(a,b);
        boolean correct = ResultChecker.assertEquals(4,subtractResults);
        if (correct) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + ( a - b) );
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + ( a - b ) );
        }
    }
}

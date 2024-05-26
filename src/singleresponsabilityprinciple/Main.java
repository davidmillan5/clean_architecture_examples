package singleresponsabilityprinciple;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        // Single Responsibility Principle

        System.out.println("Addition results: " + calculator.addition(1.0,2.0));
        System.out.println("Subtraction results: " + calculator.subtraction(1.0,2.0));
        System.out.println("Multiplication results: " + calculator.multiplication(1.0,2.0));
        System.out.println("Division results: " + calculator.division(1.0,2.0));

    }
}

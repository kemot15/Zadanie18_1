package pl.javastart;

import pl.javastart.service.Calculator;

public class Fibonacci {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.getSum(calculator.getNumbersList());
        System.out.println(sum);
    }
}

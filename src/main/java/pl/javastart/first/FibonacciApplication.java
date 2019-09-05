package pl.javastart.first;

import pl.javastart.first.service.FibonacciCalculatorService;

public class FibonacciApplication {
    public static void main(String[] args) {
        FibonacciCalculatorService fibonacciCalculatorService = new FibonacciCalculatorService();
        int sum = fibonacciCalculatorService.getSum(fibonacciCalculatorService.getNumbersList(10));
        System.out.println(sum);
    }
}

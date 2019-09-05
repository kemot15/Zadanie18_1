package pl.javastart.first.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class FibonacciApplicationCalculatorServiceTest {
    FibonacciCalculatorService fibonacciCalculatorService;
    List<Integer> numberList;

    @BeforeEach
    void setUp() {
        fibonacciCalculatorService = new FibonacciCalculatorService();
        numberList = fibonacciCalculatorService.getNumbersList(10);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void areNumbersEven() {
        for (Integer integer : numberList){
            assertThat(0).isEqualTo(integer%2);
        }
    }

    @Test
    void isValueBelowFourMilion() {
        int expected = 100;

        int result = numberList.get(numberList.size()-1);

        assertThat(result).isLessThanOrEqualTo(expected);

    }

    @Test
    void isCorrectValue() {
        int expexted = 44;

        int result = fibonacciCalculatorService.getSum(numberList);

        assertThat(result).isEqualTo(expexted);
    }
}
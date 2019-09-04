package pl.javastart.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;
    List<Integer> numberList;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        numberList = calculator.getNumbersList();
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
        int expected = calculator.MAX;

        int result = numberList.get(numberList.size()-1);

        assertThat(result).isLessThanOrEqualTo(expected);

    }

    @Test
    void isCorrectValue() {
        int expexted = 4613732;

        int result = calculator.getSum(numberList);

        assertThat(result).isEqualTo(expexted);
    }
}
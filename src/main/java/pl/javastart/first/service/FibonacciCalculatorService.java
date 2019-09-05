package pl.javastart.first.service;

import java.util.ArrayList;
import java.util.List;

public class FibonacciCalculatorService {
    public List<Integer> getNumbersList (int maxValue){
        int nextValue;
        int prevValue = 1;
        int sum = 0;
        List<Integer> evenNum = new ArrayList<>();
        for (nextValue = 1; sum <= maxValue;){
            if (nextValue%2==0){
                sum += nextValue;
                evenNum.add(nextValue);
            }

            nextValue+=prevValue;
            prevValue = nextValue - prevValue;
        }
        return evenNum;
    }

    public int getSum (List<Integer> numberList){
        int sum = 0;
        for (Integer num : numberList){
            sum +=num;
        }
        return sum;
    }
}

package pl.javastart.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
  public static final int MAX = 4_000_000;
    public List<Integer> getNumbersList (){
        int nextValue;
        int prevValue = 1;
        int sum = 0;
        List<Integer> evenNum = new ArrayList<>();
        for (nextValue = 1; sum <= MAX;){
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
           // System.out.println(num);
        }
        return sum;
    }
}

package com.sampson.imersaospringdio.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int sum(int firstNumber, int secondNumber){
        return firstNumber+secondNumber;
    }
}

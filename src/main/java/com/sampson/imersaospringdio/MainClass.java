package com.sampson.imersaospringdio;

import com.sampson.imersaospringdio.calculator.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MainClass implements CommandLineRunner {

    @Autowired
    private Calculator calculator;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("The result is: " + calculator.sum(2,7));


    }
}

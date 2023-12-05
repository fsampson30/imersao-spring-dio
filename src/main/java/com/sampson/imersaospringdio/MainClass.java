package com.sampson.imersaospringdio;

import com.sampson.imersaospringdio.calculator.Calculator;
import com.sampson.imersaospringdio.cep.ConverterJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MainClass implements CommandLineRunner {

    private Calculator calculator;
    private ConverterJson converterJson;

    public MainClass(Calculator calculator, ConverterJson converterJson) {
        this.calculator = calculator;
        this.converterJson = converterJson;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("The result is: " + calculator.sum(2,7));

        System.out.println(converterJson.converter("{\"cep\": \"01001-000\",\"address\": \"A Street\", \"locale\" : \"Brazil\"}"));


    }
}

package com.sampson.imersaospringdio.cep;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactory {

    @Bean
    public Gson gson(){
        return new Gson();
    }
}

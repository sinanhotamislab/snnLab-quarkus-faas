package com.snnlab.faas;

import io.quarkus.funqy.Funq;

public class SnnLabFunction {

    @Funq
    public GreetOutput greet(GreetInput greetInput) {
         return new GreetOutput("Hello " + greetInput.getName());
    }
}

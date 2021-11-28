package com.snnlab.faas;

public class GreetOutput {

    private String message;

    public GreetOutput(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

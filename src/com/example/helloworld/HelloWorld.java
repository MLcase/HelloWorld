package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        String option1 = "Oh, hello World!";
        String option2 = "Hello World!";
        String message;

        if (Math.random() > 0.5) {
            message = option1;
        } else {
            message = option2;
        }

        System.out.println(message);
        System.out.println("This string has " + message.length() + " characters.");

    }
}

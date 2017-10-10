package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        String option1 = "Oh, hello World!";
        String option2 = "Hello World!";
        String message;

        // randomizer selects one of the two messages
        if (Math.random() > 0.5) {
            message = option1;
        } else {
            message = option2;
        }

        // output of selected message and its length
        System.out.println("Start");
        System.out.println(message);
        System.out.println("This string has " + message.length() + " characters.");

        // generates and outputs the first 10 numbers of the fibonacci sequence
        int fibo = 1;
        int prev = 0;
        int help;

        for (int i = 0; i < 10; i++) {
            System.out.print(fibo + " ");

            help = fibo;
            fibo = fibo+prev;
            prev = help;
        }

        System.out.println("\nEnd?!abc");
    }
}

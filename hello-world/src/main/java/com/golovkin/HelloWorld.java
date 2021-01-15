package com.golovkin;

public class HelloWorld {
    public static void main(String[] args) {
        int number = 10;
        boolean isOdd = ModChecker.isOdd(number);
        System.out.println("Hello World!");
        System.out.printf("Is %d odd: %s\n", number, isOdd);
    }
}

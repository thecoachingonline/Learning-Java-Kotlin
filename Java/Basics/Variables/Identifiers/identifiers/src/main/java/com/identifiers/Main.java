package com.identifiers;

public class Main {
    public static void main(String[] args) {
        // Good
        int minutesPerHour = 60;
        
        // OK, but not so easy to understand what m actually is
        int m = 60;

        System.out.println(minutesPerHour);

        // Invalid identifiers:
        int andNumber = 5;  // Cannot start with a digit
        //int my var = 10;    // Cannot contain spaces
        //int int = 20;       // Cannot use reserved keywords

        System.out.println(andNumber);
        System.out.println(m);
    }
}
package com.constants;

public class Main {
    public static void main(String[] args) {
        final int myNum = 15;
        //myNum = 20;  // Error: cannot assign a value to final variable 'myNum'
        // System.out.println(myNum);
        final int MINUTES_PER_HOUR = 60;
        final int BIRTHYEAR = 1980;
        
        System.out.println(MINUTES_PER_HOUR);
        System.out.println(BIRTHYEAR);
    }
}
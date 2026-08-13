package com.arithmetic;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        
        System.out.println(x + y); // 13
        System.out.println(x - y); // 7
        System.out.println(x * y); // 30
        System.out.println(x / y); // 3
        System.out.println(x % y); // 1
        
        int z = 5;
        ++z;
        System.out.println(z); // 6
        --z;
        System.out.println(z); // 5

        int a = 10;
        int b = 3;
        System.out.println(a / b);   // Integer division, result is 3 
        
        double c = 10.0d;
        double d = 3.0d;
        System.out.println(c / d);   // Decimal division, result is 3.333...

        int peopleInRoom = 0;
        
        // 3 people enter
        peopleInRoom++;
        peopleInRoom++;
        peopleInRoom++;
        
        System.out.println(peopleInRoom); // 3
        
        // 1 person leaves
        peopleInRoom--;
        
        System.out.println(peopleInRoom); // 2
    }
}
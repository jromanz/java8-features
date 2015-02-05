package com.mycompany.cap02;

public class RandomLocalWithInnerClass {

    public RandomInteger getRandomInteger() {
        return new RandomInteger() {
            public int getValue() {
            // Get two random integers and return
            // the average ignoring the fraction part
                long n1 = rand.nextInt();
                long n2 = rand.nextInt();
                int value = (int) ((n1 + n2) / 2);
                return value;
            }
        };
    }

}

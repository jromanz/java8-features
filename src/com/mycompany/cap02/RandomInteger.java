package com.mycompany.cap02;

import java.util.Random;

public class RandomInteger {

    protected Random rand = new Random();

    public int getValue() {
        return rand.nextInt();
    }
}

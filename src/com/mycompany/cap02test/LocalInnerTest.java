package com.mycompany.cap02test;

import com.mycompany.cap02.RandomInteger;
import com.mycompany.cap02.RandomLocal;

public class LocalInnerTest {

    public static void main(String[] args) {
        RandomInteger rTop = new RandomInteger();
        System.out.println("Random integers using Top-level class:");
        System.out.println(rTop.getValue());
        System.out.println(rTop.getValue());
        System.out.println(rTop.getValue());

        RandomLocal local = new RandomLocal();
        RandomInteger rLocal = local.getRandomInteger();
        System.out.println("\nRandom integers using local inner class:");
        System.out.println(rLocal.getValue());
        System.out.println(rLocal.getValue());
        System.out.println(rLocal.getValue());
    }
}

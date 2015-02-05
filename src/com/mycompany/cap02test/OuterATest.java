package com.mycompany.cap02test;

import com.mycompany.cap02.OuterA;

public class OuterATest {
    public static void main(String[] args) {
        OuterA outerA = new OuterA();
        OuterA.InnerA innerA = outerA.new InnerA();
        OuterA.InnerA.InnerAA innerAa = innerA.new InnerAA();
    }
}

package com.mycompany.cap02test;

import com.mycompany.cap02.Outer;
import com.mycompany.cap02.Outer.Inner;

public class OuterTest {

    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
// Print the value
        out.printValue();
        in.printValue();
// Set a new value
        out.setValue(828);
// Print the value
        out.printValue();
        in.printValue();
    }
}

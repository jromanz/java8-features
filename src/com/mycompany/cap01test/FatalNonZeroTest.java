package com.mycompany.cap01test;

import com.mycompany.cap01a.Fatal;
import com.mycompany.cap01a.NonZero;

public class FatalNonZeroTest {
//if you do not annotate an annotation type with the Target annotation type, 
//the annotation type can be used as a modifier for any declaration, 
//except a type parameter declaration.    
    
    public void processData() throws @Fatal Exception{
        double value = getValue();
        int roundedValue = (@NonZero int) value;
        FatalNonZeroTest fnt = new @Fatal FatalNonZeroTest();
    }

    private double getValue() {
        double value = 13.99;
        return value; 
    }
    
}

package com.mycompany.cap02;

public class Outer {

    private int value = 1116;
    static class Nested {
    }
// Inner class starts here
    public class Inner {
        public void printValue() {
            System.out.println("Inner: Value = " + value);
        }
    } // Inner class ends here
// Instance method for the Outer class

    public void printValue() {
        System.out.println("Outer: Value = " + value);
    }
// Another instance method for the Outer class
    public void setValue(int newValue) {
        this.value = newValue;
    }
}

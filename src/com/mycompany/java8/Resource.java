package com.mycompany.java8;

public class Resource implements AutoCloseable{

    public Resource() {
        System.out.println("Creating...");
    }

    public void op1() {
        System.out.println("some operation 1...");
    }

    public void op2() {
        System.out.println("some operation 2...");
    }
    
    @Override
    public void close() throws Exception {
        System.out.println("external resource cleanup...");
    }

}

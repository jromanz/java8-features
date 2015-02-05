package com.mycompany.cap01test;

@FunctionalInterface
public interface FunctionalInterfaceRunner {

    void run();
}
//An interface with only one abstract method is always a functional interface 
//whether it is annotated with a @FunctionalInterface annotation or not. 
//Use of the annotation instructs the compiler to verify the fact that the
//interface is really a functional interface.

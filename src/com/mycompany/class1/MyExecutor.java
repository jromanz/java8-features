package com.mycompany.class1;

@FunctionalInterface
public interface MyExecutor<T> {
    public void aMethod();
    default void bMethod(){
        System.out.println("default void bMethod");
    }
}

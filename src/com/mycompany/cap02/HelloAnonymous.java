package com.mycompany.cap02;

public class HelloAnonymous {
    public static void main(String[] args) {
        new Object(){
            {
                System.out.println("Hello from an anonymous class.");
            }  
        };
    }
}

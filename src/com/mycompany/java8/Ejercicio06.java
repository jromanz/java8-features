package com.mycompany.java8;

public class Ejercicio06 {

    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            resource.op1();
            resource.op2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

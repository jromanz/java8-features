package com.mycompany.cap01a;

public @interface A {
    String value();
    int id() default 10;
}

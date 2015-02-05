package com.mycompany.cap01a;

public @interface Enabled {
    boolean status() default true;
}

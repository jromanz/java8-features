package com.mycompany.cap01test;

public @interface DefaultTest {

    double d() default 13.84;

    int num() default 12;

    int[] x() default {1, 2};

    String s() default "Hello";

    String[] s2() default {"abc", "xyz"};

    Class c() default Exception.class;

    Class[] c2() default {Exception.class, java.io.IOException.class};
}

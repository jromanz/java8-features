package com.mycompany.cap01a;

public @interface Description {
    Version version();
    Name name();
    String comments() default "";
}

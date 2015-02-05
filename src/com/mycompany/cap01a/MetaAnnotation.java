package com.mycompany.cap01a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.METHOD})
public @interface MetaAnnotation {
    int minor();
    int major();
}

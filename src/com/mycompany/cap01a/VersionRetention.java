package com.mycompany.cap01a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.CONSTRUCTOR,ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface VersionRetention {
//If you do not use the Retention meta-annotation on an annotation type, 
//its retention policy defaults to class file only.    
//you will not be able to read those annotations at runtime.    
    int major();
    int minor();
}

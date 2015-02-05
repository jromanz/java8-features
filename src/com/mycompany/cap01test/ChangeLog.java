package com.mycompany.cap01test;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(ChangeLogs.class)
public @interface ChangeLog {
    String date();
    String comments();
}

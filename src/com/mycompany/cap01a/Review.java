package com.mycompany.cap01a;

public @interface Review {
    ReviewStatus status() default ReviewStatus.PENDING;
    String comments() default "";

}

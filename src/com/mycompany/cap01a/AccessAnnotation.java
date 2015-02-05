package com.mycompany.cap01a;

@Version(major = 1, minor = 0)
public class AccessAnnotation {
    
    @Version(major = 2,minor = 0)
    public void testMethod1(){
    }
    @Version(major = 1,minor = 2)
    @Deprecated
    public void testMethod2(){
    }
}

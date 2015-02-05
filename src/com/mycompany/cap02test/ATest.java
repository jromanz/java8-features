package com.mycompany.cap02test;

import com.mycompany.cap02.A;
import com.mycompany.cap02.A.C;

public class ATest {
    public static void main(String[] args) {
//Accessing inner static class A      
        A.B bRef = new A.B();
//Accesing inner class C        
        A a = new A();
        C cRef = a.new C();
    }
}

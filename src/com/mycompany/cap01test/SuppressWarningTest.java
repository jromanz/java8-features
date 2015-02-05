package com.mycompany.cap01test;

import java.util.ArrayList;

public class SuppressWarningTest {

    @SuppressWarnings({"unchecked", "deprecation"})
    public void test() {
        ArrayList list = new ArrayList();
        list.add("Hello"); // The compiler issues an unchecked warning
    }
}

//Compile the SuppressWarningsTest class with an option to generate 
//an unchecked warning using the command javac -Xlint:unchecked SuppressWarningsTest.java

package com.mycompany.cap01a;

@Deprecated
public class DeprecateExample {

    private DeprecateExample() {
    }

    public static DeprecateExample getInstance() {
// Using the deprecated class inside its own body
        DeprecateExample dt = new DeprecateExample();
        return dt;
    }
}

package com.mycompany.cap01test;

import com.mycompany.cap01a.Ann2;
import com.mycompany.cap01a.Ann3;

@Ann2(id = 299)
@Ann3(id = 299)
public class InheritedTest {
}

// Class inherits Ann3(id=707) annotation from the class InheritedTest
class MyClass extends InheritedTest{
    
}

package com.mycompany.cap01test;

import com.mycompany.cap01a.Name;

@Name(first = "Julio", last = "Román")
public class NameTest {

    @Name(first = "Wally", last = "Inman")
    public void aMethod() {
    }

    @Name(first = "Daniella", last = "Ango" + "baldo")
    public void bMethod() {
    }
}

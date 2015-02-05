package com.mycompany.cap01test;

import com.mycompany.cap01a.ToDo;

@ToDo(items = {"A", "B", "C", "Add readFile method", "Add error handling"})
public class ToDoTest {

    @ToDo(items = "My First Method")
    public void aMethod() {
    }
    
    //@ToDo(items = null)   //Error compiler must be a constant expression
    public void bMethod(){
    }
}

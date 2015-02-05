package com.mycompany.cap01test;

import com.mycompany.cap01a.MetaAnnotation;

@MetaAnnotation(major = 10, minor = 1)
public class MetaAnnotationTest {

    private String nombre;

    @MetaAnnotation(major = 1, minor = 0)
    public MetaAnnotationTest() {
    }

    @MetaAnnotation(major = 11, minor = 10)
    public void aMethod() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

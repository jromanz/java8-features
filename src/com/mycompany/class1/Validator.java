package com.mycompany.class1;

@FunctionalInterface
public interface Validator<T> {
    public boolean validar(T t);
}

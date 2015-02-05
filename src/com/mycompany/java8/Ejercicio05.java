package com.mycompany.java8;

import com.mycompany.class1.Usuario;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ejercicio05 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Sara",12),new Person("Mark",43),new Person("Bob",12),new Person("Jill",64));
        
        Stream<Person> stream1 = people.stream().sorted(Comparator.comparing((Person p)->p.getAge()));
        stream1.forEach(p->System.out.println(p));
        
    }
}

package com.mycompany.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Ejercicio02 {

    public static IntPredicate esPrimo = n -> n > 1 && !IntStream.range(2, n)
            .filter(x -> n % x == 0)
            .findAny()
            .isPresent();

    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<>();
        IntStream.iterate(1, n -> n + 1).limit(541).filter(n -> esPrimo.test(n)).forEach(n -> doubles.add(Math.sqrt(n)));
        System.out.println(String.format("Computer %d values, first is %g last is %g",
                doubles.size(),
                doubles.get(0),
                doubles.get(doubles.size() - 1)));

    }
}

package com.mycompany.class1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.IntBinaryOperator;

public class Streams3 {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Hugo", 150);
        Usuario usuario2 = new Usuario("Paco", 350);
        Usuario usuario3 = new Usuario("Luis", 50);
        Usuario usuario4 = new Usuario("Alberto", 1000);
        Usuario usuario5 = new Usuario("Luis", 500);
        Usuario usuario6 = new Usuario("", 10);
        Usuario usuario7 = new Usuario("Luis", 1);
        ArrayList<Usuario> usuarios2 = new ArrayList<>();
        usuarios2.add(usuario1);
        usuarios2.add(usuario2);
        usuarios2.add(usuario3);
        usuarios2.add(usuario4);
        usuarios2.add(usuario5);
        usuarios2.add(usuario6);
        usuarios2.add(usuario7);

        //LAZY
        Optional<Usuario> optionalFindAny = usuarios2.stream().filter(u -> u.getPuntos() > 300).findAny();

        usuarios2.stream()
                .filter(u -> u.getPuntos() > 100)
                .peek((Usuario u) -> {
                    u.cambiarAModerador();
                    System.out.println("Uso Lazy: " + u);
                })
                .findAny();

        //no imprime nada
        usuarios2.stream()
                .sorted(Comparator.comparing(Usuario::getNombre))
                .peek(System.out::println);

        usuarios2.stream()
                .sorted(Comparator.comparing(Usuario::getNombre))
                .peek(u -> System.out.println("findAny(): " + u))
                .findAny();

        //reduccion
        double media = usuarios2.stream()
                .mapToInt(Usuario::getPuntos)
                .average()
                .getAsDouble();

        System.out.println(media);

        //Usuario maxima puntuación
        Optional<Usuario> max = usuarios2.stream().max(Comparator.comparing(Usuario::getPuntos));
        Usuario userMaxPuntos = max.get();
        System.out.println("Usuario maxima puntuación: " + userMaxPuntos);

        //otra forma maxima puntuación
        int total = usuarios2.stream().mapToInt((Usuario u) -> u.getPuntos()).sum();
        System.out.println(total);

        int valorInicial = 0;
        IntBinaryOperator operacion = (a, b) -> a + b;
        total = usuarios2.stream().mapToInt(Usuario::getPuntos).reduce(valorInicial, operacion);
        System.out.println(total);

        total = usuarios2.stream().mapToInt(u -> u.getPuntos()).reduce(0, (a, b) -> a + b);
        System.out.println(total);

        total = usuarios2.stream().mapToInt(Usuario::getPuntos).reduce(0, Integer::sum);
        System.out.println(total);

        int multiplicacion = usuarios2.stream().mapToInt(Usuario::getPuntos).reduce(1, (a, b) -> a * b);
        System.out.println(multiplicacion);

        //iterator
        usuarios2.stream().iterator().forEachRemaining((Usuario u) -> System.out.println(u));

//        total = usuarios2.stream().reduce(0, (a, u) -> (a + u.getPuntos()), Integer::sum);
//        System.out.println(total);
//        
        boolean hasModerador = usuarios2.stream().anyMatch(Usuario::isModerador);

    }
}

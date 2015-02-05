package com.mycompany.class1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams1 {

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

        //Filtrar 1 usuarios con mas puntos y convertirlos a moderadores
        Comparator<Usuario> comparator1 = Comparator.comparing(u -> u.getPuntos());
        usuarios2.sort(comparator1.reversed());
        usuarios2.subList(1, 4).forEach((Usuario u) -> {
            u.cambiarAModerador();
            System.out.println(u);
        });

        //Uso Streams
        Stream<Usuario> stream1 = usuarios2.stream().filter(u -> {
            return u.getPuntos() > 300;
        });
        stream1.forEach(new Consumer<Usuario>() {
            @Override
            public void accept(Usuario t) {
                System.out.println("Primer Stream: " + t);
            }
        });

        //mejorado
        Stream<Usuario> stream2 = usuarios2.stream();
        stream2.filter(u -> u.getPuntos() > 100).forEach(u -> System.out.println(u));

        //otro mejorado
        Stream<Usuario> stream3 = usuarios2.stream().filter(u -> u.getPuntos() < 500);
        stream3.forEach(u -> System.out.println("Uso Stream: " + u));

        //Obtener nuevamente una lista
        List<Usuario> masQue100 = new ArrayList();
        ArrayList<Usuario> usuarios3 = usuarios2;
        usuarios3.stream().filter(u -> u.getPuntos() > 0).forEach(u -> masQue100.add(u));
        usuarios3.stream().filter(u -> u.getPuntos() > 130).forEach(masQue100::add);

        //Uso Collectors
        //Usar el metodo collect para recuperar elementos de Stream<Usuario>
        ArrayList<Usuario> usuarios4 = usuarios2;
        List<Usuario> masQue100Collect = usuarios4.stream().filter(u -> u.getPuntos() > 150).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        masQue100Collect = usuarios4.stream().filter(u -> u.getPuntos() > 500).collect(Collectors.toList());
        Set<Usuario> masQue100CollectSet = usuarios4.stream().filter(u -> u.getPuntos() > 40).collect(Collectors.toCollection(HashSet::new));

        Usuario[] arrayUsuarios = usuarios4.stream().toArray(Usuario[]::new);

        //Usando otro
        Usuario usuario11 = new Usuario("Hugo", 150);
        Usuario usuario21 = new Usuario("Paco", 350);
        Usuario usuario31 = new Usuario("Luis", 50);
        Usuario usuario41 = new Usuario("Alberto", 1000);
        Usuario usuario51 = new Usuario("Luis", 500);
        Usuario usuario61 = new Usuario("", 10);
        Usuario usuario71 = new Usuario("Luis", 1);
        ArrayList<Usuario> usuarios5 = new ArrayList<>();
        usuarios5.add(usuario11);
        usuarios5.add(usuario21);
        usuarios5.add(usuario31);
        usuarios5.add(usuario41);
        usuarios5.add(usuario51);
        usuarios5.add(usuario61);
        usuarios5.add(usuario71);

        List<Integer> puntos = new ArrayList<Integer>();
        usuarios5.forEach(u -> puntos.add(u.getPuntos()));
        puntos.forEach(u -> System.out.println(u));

        List<Integer> puntosConMap = usuarios5.stream().map((Usuario u) -> u.getPuntos()).collect(Collectors.toList());

        IntStream stream = usuarios5.stream().mapToInt((Usuario u) -> u.getPuntos());

        double media = usuarios5.stream().mapToInt(Usuario::getPuntos).average().getAsDouble();

        //java.util.Optional, OptionalDouble, OptionalInt
        OptionalDouble mediaDouble = usuarios5.stream().mapToInt(Usuario::getPuntos).average();
        media = mediaDouble.orElse(0.0);
        media = usuarios5.stream().mapToInt((Usuario u) -> u.getPuntos()).average().orElse(0.0);
        media = usuarios5.stream().mapToInt((Usuario u) -> u.getPuntos()).average().orElseThrow(IllegalStateException::new);

        //usuario con la mayor cantidad de puntos
        Optional<Usuario> max = usuarios5.stream().max(Comparator.comparing((Usuario u) -> u.getPuntos()));

        Optional<String> maxNombres = usuarios5.stream().max(Comparator.comparing(Usuario::getPuntos)).map(Usuario::getNombre);
    }

}

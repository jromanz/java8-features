package com.mycompany.class1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams2 {

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

        usuarios2.forEach(new Consumer<Usuario>() {
            @Override
            public void accept(Usuario u) {
                System.out.println(u);
            }
        });

        //Filtrar usuarios  con mas de 100 puntos
        Stream<Usuario> stream1 = usuarios2.stream().filter(u -> u.getPuntos() > 100).sorted(Comparator.comparing(Usuario::getNombre));
        stream1.forEach(u -> System.out.println("Mas de 100 puntos: " + u));

        //METODO FILTER Y SORTED TE DEVUELVEN SOLO STRING
        List<Usuario> lista1 = usuarios2.stream()
                .filter(u -> u.getPuntos() > 200)
                .sorted(Comparator.comparing(Usuario::getNombre))
                .collect(Collectors.toList());

        lista1.forEach(System.out::println);

        Usuario nuevo1 = usuarios2.stream()
                .filter(u -> u.getPuntos() > 800)
                .collect(Collectors.toList())
                .get(0);
        System.out.println("get(0): " + nuevo1);


    }
}

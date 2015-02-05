package com.mycompany.class1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class OrdenamientoTest {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Hugo", 150);
        Usuario usuario2 = new Usuario("Paco", 350);
        Usuario usuario3 = new Usuario("Luis", 50);
        Usuario usuario4 = new Usuario("Alberto", 1000);
        ArrayList<Usuario> usuarios2 = new ArrayList<Usuario>();
        usuarios2.add(usuario1);
        usuarios2.add(usuario2);
        usuarios2.add(usuario3);
        usuarios2.add(usuario4);

        //Another using predicate
        usuarios2.removeIf(u -> u.getPuntos() < 200);

        Comparator<Usuario> comparator = new Comparator<Usuario>() {
            @Override
            public int compare(Usuario o1, Usuario o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        };
        Collections.sort(usuarios2, comparator);

        //Using comparator
        Comparator<Usuario> comparator2 = (u1, u2) -> u1.getNombre().compareTo(u2.getNombre());
        Collections.sort(usuarios2, comparator2);

        usuarios2.sort((u1, u2) -> u1.getNombre().compareTo(u2.getNombre()));
        usuarios2.forEach(u -> System.out.println(u.getNombre()));

        //Using comparing
        ArrayList<Usuario> usuarios3 = new ArrayList<Usuario>();
        usuarios3.add(usuario1);
        usuarios3.add(usuario2);
        usuarios3.add(usuario3);
        usuarios3.add(usuario4);

        Comparator<Usuario> comparing1 = Comparator.comparing(u -> u.getNombre());

        usuarios3.sort(comparing1);
        usuarios3.sort(Comparator.comparing(u -> u.getNombre()));
        System.out.println(usuarios3);

        //Using Strings and comparator
        List<String> palabras = Arrays.asList("Julio", "Cesar", "Román", "Zapata");
        palabras.sort(Comparator.naturalOrder());
        System.out.println(palabras);
        palabras.sort(Comparator.reverseOrder());
        System.out.println(palabras);

        usuarios3.sort(Comparator.comparing(u -> u.getPuntos()));

        usuarios3.forEach((Usuario u) -> u.getPuntos());
        System.out.println(usuarios3);

        Function<Usuario, Integer> functionPoints = u -> u.getPuntos();
        Comparator<Usuario> comparator4 = Comparator.comparing(functionPoints);
        usuarios3.sort(comparator4);
        System.out.println(usuarios3);
    }
}

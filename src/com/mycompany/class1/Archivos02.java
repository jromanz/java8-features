package com.mycompany.class1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Archivos02 {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Hugo", 150);
        Usuario usuario2 = new Usuario("Paco", 150);
        Usuario usuario3 = new Usuario("David", 50);
        Usuario usuario4 = new Usuario("Alberto", 1000);
        Usuario usuario5 = new Usuario("Carlos", 500);
        Usuario usuario6 = new Usuario("Mariane", 10);
        Usuario usuario7 = new Usuario("Julio", 1);
        usuario6.cambiarAModerador();
        usuario7.cambiarAModerador();

        ArrayList<Usuario> usuarios2 = new ArrayList<>();
        usuarios2.add(usuario1);
        usuarios2.add(usuario2);
        usuarios2.add(usuario3);
        usuarios2.add(usuario4);
        usuarios2.add(usuario5);
        usuarios2.add(usuario6);
        usuarios2.add(usuario7);

        Map<Integer, List<Usuario>> puntuaciones = new HashMap();
        for (Usuario usuarios : usuarios2) {
            if (!puntuaciones.containsKey(usuarios.getPuntos())) {
                puntuaciones.put(usuarios.getPuntos(), new ArrayList<>());
            }
            puntuaciones.get(usuarios.getPuntos()).add(usuarios);
        }
        System.out.println(puntuaciones);

        //primera forma
        for (Usuario usuarios : usuarios2) {
            puntuaciones.computeIfAbsent(usuarios.getPuntos(), user -> new ArrayList())
                    .add(usuarios);
        }

        //segunda forma
        Map<Integer, List<Usuario>> puntuaciones2 = usuarios2.stream()
                .collect(Collectors.groupingBy(u -> u.getPuntos()));
        System.out.println(puntuaciones2);

        Map<Boolean, List<Usuario>> puntuaciones3 = usuarios2.stream()
                .collect(Collectors.partitioningBy(u -> u.isModerador()));
        System.out.println(puntuaciones3);

        //Agrupar por moderadores y nombres usuarios
        Map<Boolean, List<String>> puntuaciones4 = usuarios2.stream()
                .collect(Collectors
                        .partitioningBy(
                                (Usuario u) -> u.isModerador(),
                                Collectors.mapping(Usuario::getNombre, Collectors.toList())));
        System.out.println(puntuaciones4);

        Map<Boolean, Integer> puntuaciones5 = usuarios2.stream()
                .collect(Collectors
                        .partitioningBy(
                                (Usuario u) -> u.isModerador(),
                                Collectors.summingInt(Usuario::getPuntos)
                        ));
        System.out.println(puntuaciones5);
    }
}

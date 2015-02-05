package com.mycompany.class1;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Archivos01 {

    public static void main(String[] args) {
        try {
            Usuario usuario1 = new Usuario("Hugo", 150);
            Usuario usuario2 = new Usuario("Paco", 350);
            Usuario usuario3 = new Usuario("David", 50);
            Usuario usuario4 = new Usuario("Alberto", 1000);
            Usuario usuario5 = new Usuario("Carlos", 500);
            Usuario usuario6 = new Usuario("Mariane", 10);
            Usuario usuario7 = new Usuario("Julio", 1);
            ArrayList<Usuario> usuarios2 = new ArrayList<>();
            usuarios2.add(usuario1);
            usuarios2.add(usuario2);
            usuarios2.add(usuario3);
            usuarios2.add(usuario4);
            usuarios2.add(usuario5);
            usuarios2.add(usuario6);
            usuarios2.add(usuario7);

            Files.list(Paths.get("."))
                    .forEach(System.out::println);
            Files.list(Paths.get("./src/com/mycompany/class1"))
                    .filter(p -> p.toString().endsWith("java"))
                    .map(p -> lines(p))
                    .forEach(System.out::println);
            IntStream chars = Files.list(Paths.get("./src/com/mycompany/class1"))
                    .filter(p -> p.toString().endsWith("java"))
                    .flatMap(p -> lines(p))
                    .flatMapToInt((String s) -> s.chars());

            chars.forEach(System.out::print);

            LongStream lineas = Files.list(Paths.get("./src/com/mycompany/class1"))
                    .filter(p -> p.toString().endsWith("java"))
                    .mapToLong(p -> lines(p).count());

            List<Long> lineas2 = Files.list(Paths.get("./src/com/mycompany/class1"))
                    .filter(p -> p.toString().endsWith("java"))
                    .map(p -> lines(p).count())
                    .collect(Collectors.toList());

            Map<Path, Long> linesPerFile = new HashMap<>();
            Files.list(Paths.get("./src/com/mycompany/class1"))
                    .filter(p -> p.toString().endsWith("java"))
                    .forEach(p -> linesPerFile.put(p, lines(p).count()));
            System.out.println(linesPerFile);

            Map<Path, Long> lineasMap = Files.list(Paths.get("./src/com/mycompany/class1"))
                    .filter(p -> p.toString().endsWith("java"))
                    .collect(Collectors.toMap(p -> p, p -> lines(p).count()));
            System.out.println(lineasMap);

            //Mapear todos los usuarios usando nombre como llave
            Map<String, Usuario> nombreAUsuario = usuarios2.stream()
                    .collect(Collectors.toMap(Usuario::getNombre, Function.identity()));
            
            System.out.println(nombreAUsuario);
                   
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static Stream<String> lines(Path p) {
        try {
            return Files.lines(p);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }
}

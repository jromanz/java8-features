package com.mycompany.java8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio04 {

    public static void main(String[] args) {
        try {
            Stream<Path> aDirectory = Files.list(Paths.get("."));
            List<Path> filesInDir = new ArrayList();
            aDirectory.forEach((Path p) -> filesInDir.add(p));
            String fileNames = filesInDir.stream()
                    .map(p -> p.getFileName().toString())
                    .collect(Collectors.joining(", "));
            System.out.println(fileNames);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

package com.mycompany.class1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MetodoDeReferenciaTest {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Hugo", 150);
        Usuario usuario2 = new Usuario("Paco", 350);
        Usuario usuario3 = new Usuario("Luis", 50);
        Usuario usuario4 = new Usuario("Alberto", 1000);
        Usuario usuario5 = new Usuario("Luis", 500);
        Usuario usuario6 = new Usuario("", 10);
        Usuario usuario7 = new Usuario("Luis", 1);
        ArrayList<Usuario> usuarios2 = new ArrayList<Usuario>();
        usuarios2.add(usuario1);
        usuarios2.add(usuario2);
        usuarios2.add(usuario3);
        usuarios2.add(usuario4);
        usuarios2.add(usuario5);
        usuarios2.add(usuario6);
        usuarios2.add(usuario7);

        Consumer<Usuario> consumer1 = (Usuario u) -> u.cambiarAModerador();
        Consumer<Usuario> consumer2 = Usuario::cambiarAModerador;

        //Aqui van los consumers
        usuarios2.forEach((Usuario u) -> u.cambiarAModerador());
        System.out.println(usuarios2);

        //Referencia a metodos como consumer
        usuarios2.forEach(Usuario::cambiarAModerador);
        System.out.println(usuarios2);

        usuarios2.sort(Comparator.comparing(Usuario::getNombre));
        System.out.println(usuarios2);

        //Comparator.comparing with more fields
        Comparator<Usuario> comparator4 = Comparator.nullsLast(Comparator.comparing(Usuario::getNombre).thenComparing(Usuario::getPuntos));
        usuarios2.sort(comparator4);
        System.out.println(usuarios2);

        //Ordenar puntos de forma decreciente
        Comparator<Usuario> comparator5 = Comparator.comparing(Usuario::getPuntos).reversed();
        usuarios2.sort(comparator5);
        System.out.println(usuarios2);

        //Referenciando metodos de instancia
        Usuario alex = new Usuario("Alex Padilla", 280);
        Runnable r = alex::cambiarAModerador;
        r.run();
        System.out.println(alex);

        //Runnable bloque
        Usuario raul = new Usuario("Raul Padilla", 9500);
        Runnable s = raul::cambiarAModerador;
        s.run();
        System.out.println(raul);
        
        //consumer.accept invoca metodo Usuario::cambiarAModerador        
        Usuario david = new Usuario("David Padilla", 54);
        Consumer<Usuario> consumer = Usuario::cambiarAModerador;
        consumer.accept(david);
        System.out.println(david);
        
        //Referencia a metodos que reciben argumentos (en lugar de lambda)
        usuarios2.forEach(System.out::println);
        
        //Factoria de usuarios
        Supplier<Usuario> creacionUsuarios = Usuario::new;
        
        Usuario nuevo1 = creacionUsuarios.get();
        Usuario nuevo2 = creacionUsuarios.get();
        System.out.println(nuevo1);
        System.out.println(nuevo2);
        
        
        //Function a referencia new
        Function<String,Usuario> creacionUsuarios2 = Usuario::new;
        Usuario miguel = creacionUsuarios2.apply("Miguel Mendoza");
        Consumer<Usuario> c1 = Usuario::getNombre;
        c1.accept(miguel);
        
        //Uso de BiFunction
        BiFunction<String,Integer,Usuario> creacionUsuarios3 = Usuario::new;
        Usuario adriana = creacionUsuarios3.apply("Adriana Gonzalez", 87);
        Usuario diego = creacionUsuarios3.apply("Diego Gonzalez", 29);
        
        //
        
    }
}

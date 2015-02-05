package com.mycompany.class1;

import java.awt.Button;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UsuarioTest {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Hugo", 150);
        Usuario usuario2 = new Usuario("Paco", 350);
        Usuario usuario3 = new Usuario("Luis", 50);
        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

        Mostrador mostrador = new Mostrador();
        //1
        usuarios.forEach(mostrador);

        //2
        Consumer<Usuario> mostrador2 = new Consumer<Usuario>() {

            @Override
            public void accept(Usuario u) {
                System.out.println(u.getNombre());
            }

        };

        usuarios.forEach(mostrador2);

        //3
        usuarios.forEach(new Consumer<Usuario>() {
            public void accept(Usuario u) {
                System.out.println(u.getPuntos());
            }
        });

        //4
        usuarios.forEach((Usuario u) -> (System.out.println("lambda: " + u.getNombre())));

        //5
        usuarios.forEach(u -> System.out.println("lambda mejorado: " + u.getNombre()));

        //6
        Consumer<Usuario> mostrador3 = u -> System.out.println("lambda otra forma: " + u.getNombre());

        //7
        usuarios.forEach(u -> ((Usuario) u).cambiarAModerador());
        Consumer<Usuario> mostrador4 = u -> System.out.println("cambiando a true: " + u.isModerador());
        usuarios.forEach(mostrador4);

        //1ra
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };
        new Thread(r).start();

        //2da
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("lambda " + i);
            }
        }).start();

        //Using lambda in events
        Button b = new Button();
        b.addActionListener((event) -> System.out.println("action performed."));

        //1
        Validator<String> validator = new Validator<String>() {
            @Override
            public boolean validar(String t) {
                return t.matches("[0-9]{5}-[0][9]{3}");
            }

        };
        //2
        Validator<String> validator2 = valor -> {
            return valor.matches("[0-9]{5}-[0][9]{3}");
        };

        Runnable s = () -> System.out.println("Hola soy...");
        final int numero = 3;
        new Thread(() -> {System.out.println("Hola" + numero);}).start();
    }
}

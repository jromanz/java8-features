package com.mycompany.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ejercicio03 {
    
    public static void main(String[] args) {
        List<TimeSlot> timeSlots = Arrays.asList(new TimeSlot(), new TimeSlot(), new TimeSlot(), new TimeSlot(), new TimeSlot(), new TimeSlot());
        
        timeSlots.stream().filter(t -> t.isAvailable()).peek((TimeSlot t) -> {
            t.schelude();
        }).forEach(t -> Optional.ofNullable(t).ifPresent(System.out::println));
    }
}

package com.mycompany.java8;

import java.util.Random;

public class TimeSlot {
    static Random random = new Random();
    public void schelude(){
        System.out.println("schelude...");
    }
    public boolean isAvailable(){
        return random.nextBoolean();
    }

    public TimeSlot() {
    }
    
    
    public TimeSlot(String time) {
        System.out.println(time);
    }
    
    
    @Override
    public String toString() {
        return "TimeSlot{" + isAvailable() +'}';
    }
    
}

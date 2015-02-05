package com.mycompany.cap02;

public class ComputerAccessory {

    public static class Monitor {

        private int size;

        public Monitor(int size) {
            this.size = size;
        }

        public String toString() {
            return "Monitor - Size:" + this.size + " inch";
        }
    }

    public static class Keyboard {
        private int keys;
        public Keyboard(int keys) {
            this.keys = keys;
        }
        public String toString() {
            return "Keyboard - Keys:" + this.keys;
        }
    }
}

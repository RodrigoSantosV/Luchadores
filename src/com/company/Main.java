package com.company;

public class Main {

    public static void main(String[] args) {
        Cuadrilatero c = new Cuadrilatero();
        for (int i = 0; i < 10; i++) {
            Luchadores t = new Luchadores(c);
            t.setName("numero: " + i);
            t.start();
        }
    }

}

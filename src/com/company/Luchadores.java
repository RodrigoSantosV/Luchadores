package com.company;

import java.util.Random;

public class Luchadores extends Thread {

    Cuadrilatero cuadrilatero;

    public Luchadores(Cuadrilatero cuadrilatero) {
        this.cuadrilatero = cuadrilatero;
    }

    @Override
    public void run() {
        try {
            cuadrilatero.comenzarLucha(this);
            int tiempo = new Random().nextInt(6000) + 1000;
            System.out.println("¡¡Luchador " + getName() + " entre al cuadrilatero de combate!! ");
            sleep(tiempo);
            System.out.println("¡¡TRAS UNA GRAN BATALLA EL LUCHADOR " + getName() + " HA SIDO DERROTADOOOOOOOO!!");
            cuadrilatero.descalificadoLucha(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.company;

import java.util.concurrent.Semaphore;

public class Cuadrilatero {
    private static final int MAX_AVAILABLE = 2;
    private final Semaphore available = new Semaphore(MAX_AVAILABLE, true);

    public void comenzarLucha(Luchadores lucha) throws InterruptedException {
        available.acquire();
    }

    public void descalificadoLucha(Luchadores luchador) {
        available.release();
    }

}

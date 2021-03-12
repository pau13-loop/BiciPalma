package edu.pingpong.biciPalma.domain.estacion;

import java.util.concurrent.ThreadLocalRandom;

import edu.pingpong.biciPalma.domain.bicicleta.Movil;

class Anclajes {

    private final Anclaje[] anclajes;

    Anclajes(int numAnclajes) {
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes() {
        for (int i = 0; i < this.anclajes.length; i++) {
            this.anclajes[i] = new Anclaje();
        }
    }

    int numAnclajes() {
        return this.anclajes.length;
    }

    void ocuparAnclaje(int posicion, Movil bici) {
        this.anclajes[posicion].anclarBici(bici);
    }

    boolean isAnclajeOcupado(int posicion) {
        return this.anclajes[posicion].isOcupado();
    }

    void librerarAnclaje(int posicion) {
        this.anclajes[posicion].liberarBici();
    }

    Movil getBiciAt(int posicion) {
        return this.anclajes[posicion].getBici();
    }

    int seleccionarAnclaje() {
        Integer idAnclaje = ThreadLocalRandom.current().nextInt(0, numAnclajes());
        return idAnclaje;
    }

    @Override
    public String toString() {
        return "Número de anclajes: " + Integer.toString(numAnclajes());
    }
}

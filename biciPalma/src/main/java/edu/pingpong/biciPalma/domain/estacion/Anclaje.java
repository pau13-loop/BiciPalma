package edu.pingpong.biciPalma.domain.estacion;

import edu.pingpong.biciPalma.domain.bicicleta.Movil;

public class Anclaje {
    
    private boolean ocupado = false;
    private Movil bici;

    Anclaje() {}

    boolean isOcupado() {
        return this.ocupado;
    }

    Movil getBici() {
        return this.bici;
    }

    void anclarBici(Movil bici) {
        this.ocupado = true;
        this.bici = bici;
    }

    void liberarBici() {
        this.ocupado = false;
        this.bici = null;
    }

    @Override
    public String toString() {
        return "Ocupado: " + Boolean.toString(isOcupado());
    }
}

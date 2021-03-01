package edu.pingpong.biciPalma.domain.estacion;

public class Anclaje {
    
    private boolean ocupado = false;
    private Movil bici;

    Anclaje() {}

    boolean isOcupado() {
        return this.ocupado;
    }

    int getBici() {
        return this.bici;
    }

    void anclarBici(Movil bici) {
    }

    void liberarBici() {
        this.ocupado = false;
    }

    @Override
    public String toString() {
        return "Ocupado: " + Boolean.toString(isOcupado());
    }

}

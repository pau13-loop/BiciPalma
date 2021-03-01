package edu.pingpong.biciPalma.domain.tarjetaUsuario;

public class TarjetaUsuario implements Autenticacion{
    
    private final String id;
    private boolean activada = false;

    public TarjetaUsuario(String id, boolean activada) {
        this.id = id;
        this.activada = activada;
    }

    public boolean isActivada() {
        return this.activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }

    public String toString() {
        return this.id;
    }
}

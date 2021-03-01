package edu.pingpong.biciPalma.domain.estacion;

public class Estacion {
    
    private final int id;
    private final String direccion;
    private int numAnclajes;

    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion  = direccion;
        this.numAnclajes = numAnclajes;
        
    }

    private int getId() {
        return this.id;
    }

    private String getDireccion() {
        return this.direccion;
    }

    @Override
    public String toString() {
        return "Id: " + getId() + "\nDirección: " + getDireccion() + "\nNúmero de Anclajes: " + numAnclajes();
    }

    private int numAnclajes() {
        return this.numAnclajes;
    }

    public void consultarEstacion() {
        System.out.println(toString());
    }
}

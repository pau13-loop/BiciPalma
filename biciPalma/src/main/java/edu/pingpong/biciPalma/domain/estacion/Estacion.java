package edu.pingpong.biciPalma.domain.estacion;

import java.lang.StackWalker.Option;
import java.util.Arrays;
import java.util.Optional;

import edu.pingpong.biciPalma.domain.bicicleta.Movil;
import edu.pingpong.biciPalma.domain.tarjetaUsuario.Autenticacion;

public class Estacion {
    
    private final int id;
    private final String direccion;
    private Anclajes anclajes;

    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion  = direccion;
        this.anclajes = new Anclajes(numAnclajes);
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

    private Anclaje[] anclajes() {
        return this.anclajes.anclajes();
    }

    private int numAnclajes() {
        return this.anclajes.numAnclajes();
    }

    public void consultarEstacion() {
        System.out.println(this);
    }

    public long anclajesLibres() {
        return Arrays.stream(anclajes()).filter(a -> !a.isOcupado()).count();
    }

    public void consultarAnclajes() {
        int numAnclaje = 0;

        for(Anclaje anclaje : anclajes()) {
            numAnclaje++;
            if(anclaje.isOcupado()) {
                System.out.println("Bicicleta: " + anclaje.getBici() + "anclada en el anclaje " + numAnclaje);
        } else {
            System.out.println("Anclaje " + numAnclaje + " libre");
        }
        }
    }
}

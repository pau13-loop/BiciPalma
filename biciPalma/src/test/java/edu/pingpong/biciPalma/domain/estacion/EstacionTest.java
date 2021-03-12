package edu.pingpong.biciPalma.domain.estacion;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.biciPalma.domain.bicicleta.Bicicleta;
import edu.pingpong.biciPalma.domain.bicicleta.Movil;

public class EstacionTest {

    private Estacion estacion;

    @Before
    public void setupEstacion() {
        estacion = new Estacion(666, "Intermodal", 5);
    }

    @Test
    public void toStringTest() {

        String expected = "Id: 666\nDirección: Intermodal\nNúmero de Anclajes: 5";

        assertEquals(expected, estacion.toString());
    }

    @Test
    public void anclajesLibresTest() {
        assertEquals(5, estacion.anclajesLibres());
    }

    @Test
    public void anclarBicicletaTest() {

        Movil bici1 = new Bicicleta(756);
        Movil bici2 = new Bicicleta(657);

        estacion.anclarBicicleta(bici1);
        estacion.anclarBicicleta(bici2);

        assertEquals(3, estacion.anclajesLibres());
    }
}

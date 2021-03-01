package edu.pingpong.biciPalma.domain.estacion;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

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
}

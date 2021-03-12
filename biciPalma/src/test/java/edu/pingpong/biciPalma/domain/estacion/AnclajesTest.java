package edu.pingpong.biciPalma.domain.estacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.beans.BeanProperty;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.biciPalma.domain.bicicleta.Bicicleta;
import edu.pingpong.biciPalma.domain.bicicleta.Movil;

public class AnclajesTest {

    Anclajes anclajes;
    Movil bici;

    @Before
    public void setupAnclajes() {
        anclajes = new Anclajes(13);
        bici = new Bicicleta(666);
    }

    @Test
    public void lengthTest() {
        assertEquals(13, anclajes.numAnclajes());
    }

    @Test
    public void ocuparLiberarAnclajeTest() {
        anclajes.ocuparAnclaje(5, bici);

        // Check anclaje ocupado
        assertTrue(anclajes.isAnclajeOcupado(5));
        assertFalse(anclajes.isAnclajeOcupado(4));

        // Check liberar anclaje
        anclajes.librerarAnclaje(5);
        assertFalse(anclajes.isAnclajeOcupado(5));
    }

    @Test
    public void toStringTest() {
        assertEquals("Número de anclajes: 13", anclajes.toString());
    }
}

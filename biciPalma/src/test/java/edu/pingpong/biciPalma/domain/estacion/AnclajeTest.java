package edu.pingpong.biciPalma.domain.estacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.biciPalma.domain.bicicleta.Bicicleta;
import edu.pingpong.biciPalma.domain.bicicleta.Movil;

public class AnclajeTest {

    private Movil bici;
    private Anclaje anclaje;

    @Before
    public void setupAnclaje() {
        bici = new Bicicleta(999);
        anclaje = new Anclaje();
    }

    @Test
    public void ocupadoTest() {
        assertFalse(anclaje.isOcupado());

        anclaje.anclarBici(bici);
        assertTrue(anclaje.isOcupado());

        anclaje.liberarBici();
        assertFalse(anclaje.isOcupado());
    }

    @Test
    public void toStringTest() {
        assertEquals("Ocupado: false", anclaje.toString());
    }
}

package edu.pingpong.biciPalma.domain.bicicleta;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BicicletaTest {
    
    private Bicicleta bici;

    @Before
    public void setupBici() {
        bici = new Bicicleta(999);
    }

    @Test
    public void getIdTest() {
        assertEquals(999, bici.getId());
    }

    @Test
    public void toStringTest() {
        assertEquals("999", bici.toString());
    }
}

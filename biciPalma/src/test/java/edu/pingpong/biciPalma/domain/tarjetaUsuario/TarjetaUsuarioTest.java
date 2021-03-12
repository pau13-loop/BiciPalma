package edu.pingpong.biciPalma.domain.tarjetaUsuario;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TarjetaUsuarioTest {

    private TarjetaUsuario tarjeta;

    @Before
    public void setupTarjetaUsuario() {
        tarjeta = new TarjetaUsuario("Nueva Tarjeta", false);
    }

    @Test
    public void activaccionTest() {

        assertFalse(tarjeta.isActivada());

        tarjeta.setActivada(true);

        assertTrue(tarjeta.isActivada());
    }

    @Test
    public void toStringTest() {
        assertEquals("Nueva Tarjeta", tarjeta.toString());
    }
}

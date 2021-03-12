package edu.pingpong.biciPalma.domain.estacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.biciPalma.domain.bicicleta.Bicicleta;
import edu.pingpong.biciPalma.domain.bicicleta.Movil;
import edu.pingpong.biciPalma.domain.tarjetaUsuario.TarjetaUsuario;

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

    @Test
    public void leerTarjetaUsuarioTest() {

        TarjetaUsuario tarjeta = new TarjetaUsuario("Tomeu", false);

        assertFalse(estacion.leerTarjetaUsuario(tarjeta));

        tarjeta.setActivada(true);

        assertTrue(estacion.leerTarjetaUsuario(tarjeta));
    }

    @Test
    public void retirarBicicletaTest() {

        // In case the user card is not active
        TarjetaUsuario tarjeta1 = new TarjetaUsuario("Basil", false);

        estacion.retirarBicicleta(tarjeta1);

        assertEquals(5, estacion.anclajesLibres());

        // We want to work with an activate user card from here

        TarjetaUsuario tarjeta = new TarjetaUsuario("Tomeu", true);

        // In case there are no bikes at the station

        estacion.retirarBicicleta(tarjeta);

        assertEquals(5, estacion.anclajesLibres());

        // We add some bikes at the station to be able to take any of them

        Movil bici1 = new Bicicleta(756);
        Movil bici2 = new Bicicleta(657);

        estacion.anclarBicicleta(bici1);
        estacion.anclarBicicleta(bici2);

        assertEquals(3, estacion.anclajesLibres());

        estacion.retirarBicicleta(tarjeta);

        assertEquals(4, estacion.anclajesLibres());
    }
}

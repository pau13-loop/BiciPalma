package edu.pingpong.biciPalma.appPalma;

import edu.pingpong.biciPalma.domain.estacion.Estacion;

public class BiciPalmaApp 
{
    public static void main( String[] args )
    {
        Estacion estacion = new Estacion(1, "Manacor", 6);

		/**
		 * caso TEST visualizar estado de la estacion:
		 * muestra id, direccion, anclaje 
		 */

		System.out.println("\n **** caso TEST visualizar estado de la estacion **** \n");

		estacion.consultarEstacion();

        /**
		 * caso TEST visualizar anclajes libres
		 */

		System.out.println("\n **** caso TEST visualizar anclajes libres **** \n");

		System.out.println("anclajesLibres: " + estacion.anclajesLibres());

		estacion.consultarAnclajes();
    }
}

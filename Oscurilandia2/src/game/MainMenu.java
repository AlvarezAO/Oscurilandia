package game;


import javax.swing.*;

/**
 * Juego Oscurilandia La Secuela
 * @author Alvaro Alvarez Olivares, Mirko Bravo Hidalgo, Yesenia Llanos Perez, Natalia Ponce Avila.
 * @see https://github.com/AlvarezAO/Oscurilandia
 * @version 20/02/2020
 * 
 */

public class MainMenu {

	/**
	 * Metodo main Menu
	 * @param args
	 */
	public static void main(String[] args) {
		Tablero tablaUno = new Tablero();


		int opcion;

		/**
		 * inicio ciclo para pedir opcion del menu
		 */
		do { 			
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú Estrategia FirstLine \n1 - Agregar Carros \n2 - Mostrar Carros \n3 - Jugar \n4 - Salir"));	

			switch (opcion) {

			case 1: tablaUno.crearCarro(); 

			break;

			case 2: tablaUno.muestraCarro();

			break;

			case 3: 
				int reply;
				do {

					tablaUno.mostrarMatriz();
					System.out.println("");
					tablaUno.agregaHuevo();
					System.out.println("");
					tablaUno.mostrarHuevo();
					System.out.println("");
					System.out.println("el puntaje es: "+tablaUno.getSumaPuntaje());

					reply = JOptionPane.showConfirmDialog(null, "¿Desea Seguir Jugando?", "digame", JOptionPane.YES_NO_OPTION);

					if (reply == JOptionPane.YES_OPTION) {
						System.out.println("");

					}
					else {
						tablaUno.mostrarMatriz();
						System.exit(0);
					}

				} while (reply == JOptionPane.YES_OPTION);	



				break;

			case 4: System.exit(0);	

			break;

			default: System.out.println("Ingresa una opción válida");	
			}

		} while(opcion != 4);

	}

}

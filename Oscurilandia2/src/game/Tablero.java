package game;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * Juego Oscurilandia La Secuela
 * @author Alvaro Alvarez Olivares, Mirko Bravo Hidalgo, Yesenia Llanos Perez, Natalia Ponce Avila.
 * @see https://github.com/AlvarezAO/Oscurilandia
 * @version 20/02/2020
 * 
 */
public class Tablero {

	//Atributos de la clase
	private ArrayList<Huevo> listaHuevo = new ArrayList<Huevo>();	
	private Carro listaCarros[] = new Carro[18];	
	private char matriz[][] = new char[15][15];
	int sumaPuntaje = 0;
	int contk = 1;
	int contc=1;
	int contt=1;

	/**
	 * metodo que imprime matriz por pantalla
	 */
	public void mostrarMatriz() {

		for(int i = 0; i<15; i++) {
			System.out.print("|");
			for(int j = 0; j<15; j++) {
				System.out.print(matriz[i][j]+"|");
			}
			System.out.println("");
		}
	} // fin metodo 

	/**
	 * metodo que almacena instanciaciones dentro de la lista 
	 */
	public void crearCarro() {
		listaCarros[0] = crearKromi();
		listaCarros[1] = crearKromi();
		listaCarros[2] = crearKromi();
		listaCarros[3] = crearCaguano();
		listaCarros[4] = crearCaguano();
		listaCarros[5] = crearCaguano();
		listaCarros[6] = crearCaguano();
		listaCarros[7] = crearCaguano();
		listaCarros[8] = crearTrupalla();
		listaCarros[9] = crearTrupalla();
		listaCarros[10] = crearTrupalla();
		listaCarros[11] = crearTrupalla();
		listaCarros[12] = crearTrupalla();
		listaCarros[13] = crearTrupalla();
		listaCarros[14] = crearTrupalla();
		listaCarros[15] = crearTrupalla();
		listaCarros[16] = crearTrupalla();
		listaCarros[17] = crearTrupalla();		
	} // fin metodo

	public int getSumaPuntaje() {
		return sumaPuntaje;
	}

	public void setSumaPuntaje(int sumaPuntaje) {
		this.sumaPuntaje = sumaPuntaje;
	}

	/**
	 * metodo que crea el objeto Kromi con sus parametros correspondientes
	 * @return objeto Kromi
	 */
	public Kromi crearKromi() {
		int cantOcupantes;
		String fechaIngreso, yearFabricacion, marca;
		int x;
		int y;
		int x2;
		int x3;
		boolean flag = false;

		/**
		 * ciclo que crea las coordenadas donde estara cada Kromi
		 */
		do {

			x = (int)(Math.random()*13);
			y = (int)(Math.random()*15);

			if(matriz[x][y] != 'K' && matriz[x][y] != 'C' && matriz[x][y] != 'T') {				
				if (matriz[x+1][y] != 'K' && matriz[x+1][y] != 'C' && matriz[x+1][y] != 'T') {
					if (matriz[x+2][y] != 'K' && matriz[x+2][y] != 'C' && matriz[x+2][y] != 'T') {
						flag = true;
						matriz[x][y] = 'K';
						matriz[x+1][y] = 'K';
						matriz[x+2][y] = 'K';
					}
				}			
			}


			x2 = x+1;
			x3 = x+2;

		} while (!flag);

		cantOcupantes = Integer.parseInt(JOptionPane.showInputDialog("Kromi N°"+contk+"\nCantidad Ocupantes"));
		fechaIngreso = JOptionPane.showInputDialog("Kromi N°"+contk+"\nIngresa la fecha de ingreso");
		yearFabricacion = JOptionPane.showInputDialog("Kromi N°"+contk+"\nIngresa el año de fabricacion");
		marca = JOptionPane.showInputDialog("Kromi N°"+contk+"\nIngresa la marca del vehiculo");
		contk++;

		return new Kromi(cantOcupantes, fechaIngreso, x, y, yearFabricacion, marca, x2, y, x3, y);

	}	

	/**
	 * metodo que crea el objeto Caguano con sus parametros correspondientes
	 * @return objeto Caguano
	 */
	public Caguano crearCaguano() {
		int cantOcupantes, alcanceTiro;
		String fechaIngreso, colorConfeti;
		int x;
		int y;
		int y2;
		boolean flag = false;

		/**
		 * ciclo que crea las coordenadas donde estara cada Caguano
		 */
		do {

			x = (int)(Math.random()*15);
			y = (int)(Math.random()*14);

			if(matriz[x][y] != 'K' && matriz[x][y] != 'C' && matriz[x][y] != 'T') {

				if (matriz[x][y+1] != 'K' && matriz[x][y+1] != 'C' && matriz[x][y+1] != 'T') {

					flag = true;
					matriz[x][y] = 'C';
					matriz[x][y+1] = 'C';

				}			
			}
		} while (!flag);
		cantOcupantes = Integer.parseInt(JOptionPane.showInputDialog("Caguano N°"+contc+"\nCantidad Ocupantes"));
		fechaIngreso = JOptionPane.showInputDialog("Caguano N°"+contc+"\nIngresa la fecha de ingreso");
		alcanceTiro = Integer.parseInt(JOptionPane.showInputDialog("Caguano N°"+contc+"\nAlcance de Tiro en Mts"));
		colorConfeti = JOptionPane.showInputDialog("Caguano N°"+contc+"\nColor Confeti");
		y2 = y+1;
		contc ++;


		return new Caguano(cantOcupantes, fechaIngreso, x, y, alcanceTiro, colorConfeti, x, y2);

	}

	/**
	 * metodo que crea el objeto Trupalla con sus parametros correspondientes
	 * @return objeto Trupalla
	 */
	public Trupalla crearTrupalla() {
		int cantOcupantes, nivelArmadura;
		String fechaIngreso, nombreChofer;
		int x;
		int y;
		boolean flag = false;

		/**
		 * ciclo que crea las coordenadas donde estara cada Trupalla
		 */

		do {

			x = (int)(Math.random()*15);
			y = (int)(Math.random()*14);

			if(matriz[x][y] != 'K' && matriz[x][y] != 'C' && matriz[x][y] != 'T') {

				flag = true;
				matriz[x][y] = 'T';
			}
		} while (!flag); 
		cantOcupantes = Integer.parseInt(JOptionPane.showInputDialog("Trupalla N°"+contt+"\nCantidad Ocupantes"));
		fechaIngreso = JOptionPane.showInputDialog("Trupalla N°"+contt+"\nIngresa la fecha de ingreso");
		nivelArmadura = Integer.parseInt(JOptionPane.showInputDialog("Trupalla N°"+contt+"\nNivel Armadura (1 - 5)"));
		nombreChofer = JOptionPane.showInputDialog("Trupalla N°"+contt+"\nNombre de Chofer");
		contt++;


		return new Trupalla(cantOcupantes, fechaIngreso, x, y, nivelArmadura, nombreChofer);

	}

	/**
	 * metodo que muestra la matriz con los carro creados
	 */
	public void muestraCarro() {
		for(int i= 0; i<listaCarros.length;i++) {
			System.out.println(listaCarros[i]);
		}
	} // Fin metodo

	/**
	 * Metodo que lanza el huevo a una coordenada dada por el usuario
	 * @return Objeto huevo con sus parametros correspondientes
	 */
	public Huevo lanzarHuevo() {

		int x;
		int y; 
		int puntaje_huevo=0;
		boolean cordenadas_validas=false;

		do { 
			x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa Coordenada X"));
			y = Integer.parseInt(JOptionPane.showInputDialog("Ingresa Coordenada Y"));

			if (x < 15 && x >= 0 && y < 15 && y >= 0) { // condicion para validar coordenadas validas
				cordenadas_validas=true;
			}else {
				JOptionPane.showMessageDialog(null, "Cordenadas incorrectas(0-14)");
			}

		}while(!cordenadas_validas); // cambia caracter de la coordenada 		
		
		if(matriz[x][y] == 'K' ){ 
			matriz[x][y] = 'H';

			puntaje_huevo= encontrarKromi(x,y);				

		} 
		else if (matriz[x][y] == 'C') {

			matriz[x][y] = 'H';
			puntaje_huevo = encontrarCaguano(x,y);

		} 		else if (matriz[x][y] == 'T') {
			matriz[x][y] = 'H';
			puntaje_huevo=1;
			System.out.println("Trupalla destruida");

			

		} 		else {
			matriz[x][y] = 'H';
		}


		sumaPuntaje+=puntaje_huevo;			
		return new Huevo(x, y, puntaje_huevo);
	}	

	/**
	 * metodo que agrega un huevo a la lista de Huevos
	 */
	public void agregaHuevo() {
		listaHuevo.add(lanzarHuevo());		
	}// fin metodo

	/**
	 * metodo que muestra la informacion del huevo
	 */
	public void mostrarHuevo() {
		for(Huevo egg: listaHuevo) {
			System.out.println(egg);
		}
	} // fin metodo


	/**
	 * metodo que identifica una Kromi cuando se lanza el huevo
	 * @param huevoX
	 * @param huevoY
	 * @return puntaje obtenido si destrulle las coordenadas de Kromi
	 */
	public int encontrarKromi(int huevoX, int huevoY) {

		int puntaje = 0;
		Kromi buscador_kromi = new Kromi();
		for (int i = 0; i < 3; i++) {

			buscador_kromi= (Kromi)listaCarros[i];
			if (buscador_kromi.getPosicionX()==huevoX && buscador_kromi.getPosicionY()==huevoY 
					|| buscador_kromi.getX2()==huevoX && buscador_kromi.getY2()==huevoY 
					|| buscador_kromi.getX3()==huevoX && buscador_kromi.getY3()==huevoY) {

				if (matriz[buscador_kromi.getPosicionX()][buscador_kromi.getPosicionY()]=='H'
						&& matriz[buscador_kromi.getX2()][buscador_kromi.getY2()]=='H'
						&& matriz[buscador_kromi.getX3()][buscador_kromi.getY3()]=='H') {
					puntaje = 13;
					System.out.println("Kromi "+(i+1)+ " destruida ( Ocupantes: "+buscador_kromi.getCantOcupantes()+")");
				}
				else {
					System.out.println("Kromi "+(i+1)+ " golpeada");
					puntaje = 3;
				}
			}
		}
		return puntaje;		
	}

	/**
	 * metodo que identifica una Caguano cuando se lanza el huevo
	 * @param huevoX
	 * @param huevoY
	 * @return puntaje obtenido si destrulle las coordenadas de Caguano
	 */
	public int encontrarCaguano(int huevoX, int huevoY) {

		int puntaje=0;		
		Caguano buscador_caguano = new Caguano();

		for (int i = 3; i < 8; i++) {

			buscador_caguano= (Caguano)listaCarros[i];
			if (buscador_caguano.getPosicionX()==huevoX && buscador_caguano.getPosicionY()==huevoY 
					|| buscador_caguano.getX2()==huevoX && buscador_caguano.getY2()==huevoY) {

				if (matriz[buscador_caguano.getPosicionX()][buscador_caguano.getPosicionY()]=='H'
						&& matriz[buscador_caguano.getX2()][buscador_caguano.getY2()]=='H') {

					puntaje = 9;
					System.out.println("Caguano "+(i+1)+ " destruido ( Confeti: "+buscador_caguano.getColorConfeti()+")");
				}
				else {
					puntaje = 2;
					System.out.println("Caguano "+(i+1)+ " golpeado");
				}
			}
		}
		return puntaje;


	}

}
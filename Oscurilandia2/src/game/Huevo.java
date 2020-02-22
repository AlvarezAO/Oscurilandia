package game;
/**
 * Juego Oscurilandia La Secuela
 * @author Álvaro Álvarez Olivares, Mirko Bravo Hidalgo, Yesenia Llanos Pérez, Natalia Ponce Ávila.
 * @see https://github.com/AlvarezAO/Oscurilandia
 * @version 20/02/2020
 * 
 */
public class Huevo {
	
	private int posicionX;
	private int posicionY;
	private int puntaje;
	
	public Huevo(int posicionX, int posicionY, int puntaje) {
		
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.puntaje = puntaje;
	}

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	@Override
	public String toString() {
		return "Huevo [Posicion X: " + posicionX + " | Posicion Y: " + posicionY + " | Puntaje: " + puntaje + "]";
	}
	
	
	
}

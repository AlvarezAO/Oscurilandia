package game;
/**
 * Juego Oscurilandia La Secuela
 * @author Álvaro Álvarez Olivares, Mirko Bravo Hidalgo, Yesenia Llanos Pérez, Natalia Ponce Ávila.
 * @see https://github.com/AlvarezAO/Oscurilandia
 * @version 20/02/2020
 * 
 */
public class Carro {
	
	private int cantOcupantes;
	private String fechaIngreso;
	private int posicionX;
	private int posicionY;
	
	public Carro(int cantOcupantes, String fechaIngreso, int posicionX, int posicionY) {
		
		this.cantOcupantes = cantOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		
	}

	public Carro() {
		// TODO Auto-generated constructor stub
	}

	public int getCantOcupantes() {
		return cantOcupantes;
	}

	public void setCantOcupantes(int cantOcupantes) {
		this.cantOcupantes = cantOcupantes;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
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

	@Override
	public String toString() {
		return "\nCantidad Ocupantes: " + cantOcupantes + "\nFecha Ingreso: " + fechaIngreso + "\nPosicion X: " + posicionX
				+ "\nPosicion Y: " + posicionY;
	}
	
	

}

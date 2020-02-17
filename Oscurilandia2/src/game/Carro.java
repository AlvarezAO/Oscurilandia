package game;

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

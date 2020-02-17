package game;

public class Caguano extends Carro {

	private int alcanceTiro;
	private String colorConfeti;
	
	public Caguano(int cantidadOcupantes, String fechaIngreso, int posicionX,
					int posicionY, int alcanceTiro, String colorConfeti) {
		super (cantidadOcupantes, fechaIngreso, posicionX, posicionY);
		
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}

	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public String getColorConfeti() {
		return colorConfeti;
	}

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}

	@Override
	public String toString() {
		return "\nDatos Caguano" + super.toString()+ "\nAlcance de Tiro: " + alcanceTiro + "Mts.\nColor Confeti: " + colorConfeti;
	}
	
	
	
}

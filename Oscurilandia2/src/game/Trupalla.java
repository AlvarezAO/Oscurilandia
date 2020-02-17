package game;

public class Trupalla extends Carro{
	
	private int nivelArmadura;
	private String nombreChofer;
	
	public Trupalla(int cantOcupantes, String fechaIngreso, int posicionX,
					int posicionY, int nivelArmadura, String nombreChofer) {
		super(cantOcupantes, fechaIngreso, posicionX, posicionY);
		
		this.nivelArmadura = nivelArmadura;
		this.nombreChofer = nombreChofer;
		
	}

	public int getNivelArmadura() {
		return nivelArmadura;
	}

	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	public String getNombreChofer() {
		return nombreChofer;
	}

	public void setNombreChofer(String nombreChofer) {
		this.nombreChofer = nombreChofer;
	}

	@Override
	public String toString() {
		return "\nDatos Trupalla"+super.toString()+"\nNivel Armadura: " + nivelArmadura + "\nNombreChofer: " + nombreChofer;
	}
	
	

}

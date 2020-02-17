package game;

public class Kromi extends Carro{
	
	private String yearFabricacion;
	private String marca;
	
	public Kromi(int cantOcupantes, String fechaIngreso, int posicionX, int posicionY,
					String yearFabricacion, String marca) {
		
		super(cantOcupantes, fechaIngreso, posicionX, posicionY);
		
		this.yearFabricacion = yearFabricacion;
		this.marca = marca;
		
	}

	public String getYearFabricacion() {
		return yearFabricacion;
	}

	public void setYearFabricacion(String yearFabricacion) {
		this.yearFabricacion = yearFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "\nDatos Kromi"+ super.toString()+"\nAño Fabricacion: " + yearFabricacion + "\nMarca: " + marca;
	}
	
	

}

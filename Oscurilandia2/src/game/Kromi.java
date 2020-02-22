package game;
/**
 * Juego Oscurilandia La Secuela
 * @author Alvaro Alvarez Olivares, Mirko Bravo Hidalgo, Yesenia Llanos Perez, Natalia Ponce Avila.
 * @see https://github.com/AlvarezAO/Oscurilandia
 * @version 20/02/2020
 * 
 */
public class Kromi extends Carro{
	
	//Atributos de la clase
	private String yearFabricacion;
	private String marca;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
	
    /**
     * Metodo constructor por defecto
 	*/
	public Kromi() {
		super();
	}
    
	/**
	 * Metodo Constructor con parametros de la clase padre y los parametros propios de cada Kromi
	 * @param cantOcupantes
	 * @param fechaIngreso
	 * @param posicionX
	 * @param posicionY
	 * @param yearFabricacion
	 * @param marca
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 */
	public Kromi(int cantOcupantes, String fechaIngreso, int posicionX, int posicionY,
					String yearFabricacion, String marca, int x2, int y2, int x3, int y3) {
		
		super(32, "2020", posicionX, posicionY);
		
		this.yearFabricacion = yearFabricacion;
		this.marca = marca;
		this.x2 = posicionX +1;
		this.y2 = posicionY;
		this.x3 = posicionX +2;
		this.y3 = posicionY;
		
	} // cierre metodo constructor

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

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	public int getY3() {
		return y3;
	}

	public void setY3(int y3) {
		this.y3 = y3;
	}
	
    /**
     *  Metodo que imprime por consola los datos basicos de los Caguanos
     */
	@Override
	public String toString() {
		return "\nDatos Kromi"+ super.toString()+"\nAño Fabricacion: " + yearFabricacion + "\nMarca: " + marca;
	} // cierre del metodo

}

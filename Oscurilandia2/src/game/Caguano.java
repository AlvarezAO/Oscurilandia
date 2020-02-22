package game;
/**
 * Juego Oscurilandia La Secuela
 * @author Álvaro Álvarez Olivares, Mirko Bravo Hidalgo, Yesenia Llanos Pérez, Natalia Ponce Ávila.
 * @see https://github.com/AlvarezAO/Oscurilandia
 * @version 20/02/2020
 * Esta clase representa a los caguanos, que se almacenrá en la lista de Carro. 
 * Contiene atributos y métodos relacionados con esta clase.
 * 
 */


public class Caguano extends Carro {
	
	//Atributos de la clase
	private int alcanceTiro;
	private String colorConfeti;
	private int x2;
    private int y2;
   
    /**
    * Método constructor por defecto
	*/
	public Caguano() { 
		super();
	} // cierre método contructor
	
	/**
	 * Método Constructor con parámetros de la clase padre y los parametros propios de cada Caguano
	 * @param cantidadOcupantes
	 * @param fechaIngreso
	 * @param posicionX
	 * @param posicionY
	 * @param alcanceTiro
	 * @param colorConfeti
	 * @param x2
	 * @param y2
	 */
	public Caguano(int cantidadOcupantes, String fechaIngreso, int posicionX,
					int posicionY, int alcanceTiro, String colorConfeti, int x2, int y2) {
		super (32, "fechaIngreso", posicionX, posicionY);
		
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
		this.x2 = posicionX;
		this.y2 = posicionY+1;
	} // cierre método constructor
    
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
    
	/**
    *  Método que imprime por consola los datos basicos de los Caguanos
    */
	@Override
	public String toString() {
		return "\nDatos Caguano" + super.toString()+ "\nAlcance de Tiro: " + alcanceTiro + "Mts.\nColor Confeti: " + colorConfeti;
	} // cierre del metodo
}

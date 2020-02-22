package game;
/**
 * Juego Oscurilandia La Secuela
 * @author Alvaro Alvarez Olivares, Mirko Bravo Hidalgo, Yesenia Llanos Perez, Natalia Ponce Avila.
 * @see https://github.com/AlvarezAO/Oscurilandia
 * @version 20/02/2020
 * 
 */

public class Trupalla extends Carro{
	
	//Atributos de la clase
	private int nivelArmadura;
	private String nombreChofer;
	
	
    /**
     * Metodo constructor por defecto
 	*/
	public Trupalla() {
		super();
	} // cierre del método
	
	/**
	 * Metodo Constructor con parametros de la clase padre y los parametros propios de cada Trupalla
	 * @param cantOcupantes
	 * @param fechaIngreso
	 * @param posicionX
	 * @param posicionY
	 * @param nivelArmadura
	 * @param nombreChofer
	 */
	public Trupalla(int cantOcupantes, String fechaIngreso, int posicionX,
					int posicionY, int nivelArmadura, String nombreChofer) {
		super(cantOcupantes, fechaIngreso, posicionX, posicionY);
		
		this.nivelArmadura = nivelArmadura;
		this.nombreChofer = nombreChofer;
	} // cierre método constructor

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

    /**
     *  Metodo que imprime por consola los datos basicos de los Caguanos
     */
	@Override
	public String toString() {
		return "\nDatos Trupalla"+super.toString()+"\nNivel Armadura: " + nivelArmadura + "\nNombreChofer: " + nombreChofer;
	} // cierre del método

}

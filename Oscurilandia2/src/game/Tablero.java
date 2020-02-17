package game;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Tablero {
	
	private ArrayList<Huevo> listaHuevo = new ArrayList<Huevo>();	
	private Carro listaCarros[] = new Carro[18];	
	private char matriz[][] = new char[15][15];

	public void mostrarMatriz() {
		
		for(int i = 0; i<15; i++) {
			System.out.print("|");
			for(int j = 0; j<15; j++) {
				System.out.print(matriz[i][j]+"|");
			}
			System.out.println("");
		}
	}
	
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
	}
	
	public Kromi crearKromi() {
		int cantOcupantes;
		String fechaIngreso, yearFabricacion, marca;
		int x;
		int y;
		boolean flag = false;
		
		int cont = 0;
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
			
			cantOcupantes = Integer.parseInt(JOptionPane.showInputDialog("Kromi N°"+cont+"\nCantidad Ocupantes"));
			fechaIngreso = JOptionPane.showInputDialog("Kromi N°"+cont+"\nIngresa la fecha de ingreso");
			yearFabricacion = JOptionPane.showInputDialog("Kromi N°"+cont+"\nIngresa el año de fabricacion");
			marca = JOptionPane.showInputDialog("Kromi N°"+cont+"\nIngresa la marca del vehiculo");
			cont++;
		} while (!flag);		
		
		 return new Kromi(cantOcupantes, fechaIngreso, x, y, yearFabricacion, marca);
		 
	}	
	
	public Caguano crearCaguano() {
		int cantOcupantes, alcanceTiro;
		String fechaIngreso, colorConfeti;
		int x;
		int y;
		boolean flag = false;
		
		
		do {
			int cont = 1;
			x = (int)(Math.random()*15);
			y = (int)(Math.random()*14);
			
			if(matriz[x][y] != 'K' && matriz[x][y] != 'C' && matriz[x][y] != 'T') {
				
				if (matriz[x][y+1] != 'K' && matriz[x][y+1] != 'C' && matriz[x][y+1] != 'T') {
					
					flag = true;
					matriz[x][y] = 'C';
					matriz[x][y+1] = 'C';
				
				}			
			}
			
			cantOcupantes = Integer.parseInt(JOptionPane.showInputDialog("Caguano N°"+cont+"\nCantidad Ocupantes"));
			fechaIngreso = JOptionPane.showInputDialog("Caguano N°"+cont+"\nIngresa la fecha de ingreso");
			alcanceTiro = Integer.parseInt(JOptionPane.showInputDialog("Caguano N°"+cont+"\nAlcance de Tiro en Mts"));
			colorConfeti = JOptionPane.showInputDialog("Caguano N°"+cont+"\nColor Confeti");
			
		} while (!flag);		
		
		 return new Caguano(cantOcupantes, fechaIngreso, x, y, alcanceTiro, colorConfeti);
		 
	}
	
	public Trupalla crearTrupalla() {
		int cantOcupantes, nivelArmadura;
		String fechaIngreso, nombreChofer;
		int x;
		int y;
		boolean flag = false;
				
		do {
			int cont = 1;
			x = (int)(Math.random()*15);
			y = (int)(Math.random()*14);
			
			if(matriz[x][y] != 'K' && matriz[x][y] != 'C' && matriz[x][y] != 'T') {
				
				flag = true;
				matriz[x][y] = 'T';
			}
			
			cantOcupantes = Integer.parseInt(JOptionPane.showInputDialog("Trupalla N°"+cont+"\nCantidad Ocupantes"));
			fechaIngreso = JOptionPane.showInputDialog("Trupalla N°"+cont+"\nIngresa la fecha de ingreso");
			nivelArmadura = Integer.parseInt(JOptionPane.showInputDialog("Trupalla N°"+cont+"\nNivel Armadura (1 - 5)"));
			//nivelArmadura = JOptionPane.showConfirmDialog(null, "Nivel Armadura", "Hola", 5);
			nombreChofer = JOptionPane.showInputDialog("Trupalla N°"+cont+"\nNombre de Chofer");
			
		} while (!flag);		
		
		 return new Trupalla(cantOcupantes, fechaIngreso, x, y, nivelArmadura, nombreChofer);
		 
	}
	
	public void muestraCarro() {
		for(int i= 0; i<listaCarros.length;i++) {
			System.out.println(listaCarros[i]);
		}
	}
	
	public Huevo lanzarHuevo() {
		int sumaPuntaje = 0;
		int x;
		int y; 		
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa Coordenada X"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Ingresa Coordenada Y"));
				
			if(matriz[x][y] == 'K' ){
				sumaPuntaje = sumaPuntaje +3;
				matriz[x][y] = 'H';
			} 
				else if (matriz[x][y] == 'T') {
					sumaPuntaje = sumaPuntaje +1;
					matriz[x][y] = 'H';
					
				} 		else if (matriz[x][y] == 'C') {
							sumaPuntaje = sumaPuntaje +2;
							matriz[x][y] = 'H';
							
						} 		else {
									matriz[x][y] = 'H';
								}
					
		return new Huevo(x, y, sumaPuntaje);
	}	
		
	public void agregaHuevo() {
		listaHuevo.add(lanzarHuevo());		
	}
	
	public void mostrarHuevo() {
		for(Huevo egg: listaHuevo) {
			System.out.println(egg);
		}
	}
	
	public void mostrarPuntaje() {
		
		int total = 0;
			
		for (Huevo ptj: listaHuevo) {
			total = total + ptj.getPuntaje();			
		}
		System.out.println(total);
	}
}


package game;
import javax.swing.JOptionPane;

public class MainMenu {

	public static void main(String[] args) {
		Tablero tablaUno = new Tablero();
		
		int opcion;
		
		do {			
		opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú Estrategia FirstLine \n1 - Agregar Carros \n2 - Mostrar Carros \n3 - Jugar \n4 - Salir"));	
			
		switch (opcion) {
		
		case 1: tablaUno.crearCarro();
		
			break;
			
		case 2: tablaUno.muestraCarro();
		
			break;
			
		case 3: 
			int reply;
			do {
				
				tablaUno.mostrarMatriz();
				System.out.println("");
				tablaUno.agregaHuevo();
				System.out.println("");
				tablaUno.mostrarHuevo();
				System.out.println("");
				
				reply = JOptionPane.showConfirmDialog(null, "¿Desea Seguir Jugando?", "digame", JOptionPane.YES_NO_OPTION);
				  
				  if (reply == JOptionPane.YES_OPTION) {
					  System.out.println("");
					  
				  }
				  else {
					  tablaUno.mostrarMatriz();
					  System.exit(0);
				  }
				
			} while (reply == JOptionPane.YES_OPTION);				
				
			break;
			
		case 4: System.exit(0);	
		
			break;
			
		default: System.out.println("Ingresa una opción válida");	
		}
				
		} while(opcion != 4);
		
	}

}

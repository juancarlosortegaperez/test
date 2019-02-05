package examenJAVA2311;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
			int numero=0, i=0, j=0;
			String ventana=" ";
				
		//Inicio
			while (numero<10 || numero%2==0) {
				System.out.println("Introduzca el tamaño de su ventana:");
				numero=Entrada.entero();
			}
			System.out.println("Elija cuadrante a romper:");
			ventana=Entrada.cadena().toUpperCase();
			while (i<numero) {
				while (j<numero) {
					if (i==0 || i==numero-1 || i==numero/2 || j==0 || j==numero-1 || j==numero/2) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
					j++;
				}
				System.out.println(" ");
				j=0;
				i++;
			}
			i=0;
			if (ventana.compareTo("ARRIBA IZQUIERDA")==0) {
				while (i<numero/2) {
					while (j<numero/2) {
						System.out.print("* ");
						j++;
					}
					System.out.println(" ");
					j=0;
					i++;
				}
			}
			i=0;
			if (ventana.compareTo("ARRIBA DERECHA")==0) {
				while (i>numero/2) {
					while (j<numero/2) {
						System.out.print("* ");
						j++;
					}
					System.out.println(" ");
					j=0;
					
				}
			}
			i=0;
			if (ventana.compareTo("ABAJO IZQUIERDA")==0) {
				while (i<numero/2) {
					while (j>numero/2) {
						System.out.print("* ");
						j++;
					}
					System.out.println(" ");
					j=0;
					i++;
				}
			}
			i=0;
			if (ventana.compareTo("ABAJO DERECHA")==0) {
				while (i>numero/2) {
					while (j>numero/2) {
						System.out.print("* ");
						j++;
					}
					System.out.println(" ");
					j=0;
					i++;
				}
			}
	}

}

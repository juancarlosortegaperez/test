package practica3_JAVA;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		int numero=0, i=0, j=0;
		
		//Inicio
		while (numero<5 || numero%2==0) {
			System.out.println("Introduzca un número impar mayor o igual a 5");
			numero=Entrada.entero();
		}
		while (i<numero) {
			while (j<numero) {
				if (i==0 || i==numero-1 || i==numero/2 || (i+j+1==numero)) {
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
	}
}
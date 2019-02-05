package ejerciciosPSEUDOCODIGO3;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CONSTANTES
			final int SUMA_HASTA=20;
		
		//variables
			int acumulador=0, contador=1;
	
		//Inicio
			while (contador<=SUMA_HASTA) {
				acumulador=acumulador+contador;
				contador++;
			}
			System.out.println("La suma de los números desde el 1 hasta el "+SUMA_HASTA+" es: "+acumulador);
		}
	}
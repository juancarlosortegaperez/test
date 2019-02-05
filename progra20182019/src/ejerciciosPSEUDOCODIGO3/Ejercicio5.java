package ejerciciosPSEUDOCODIGO3;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CONSTANTES
			final int MULTIPLICACION_HASTA=20;
	
		//variables
			long acumulador=1, contador=1;

		//Inicio
			while (contador<=MULTIPLICACION_HASTA) {
				acumulador=acumulador*contador;
				contador++;
			}
			System.out.println("La multiplicación de los números desde el 1 hasta el "+MULTIPLICACION_HASTA+" es: "+acumulador);
		}
	}
package ejerciciosPSEUDOCODIGO3;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CONSTANTES
			final int NUM_TOPE=20;
		//variables
			int sumaPares=0,i=2,multiplicaImpares=1;
		//Inicio
			while (i<=NUM_TOPE) {
				sumaPares=sumaPares+i;
				i=i+2;
			}
		System.out.println("La suma de los números PARES desde el 1 hasta el "+NUM_TOPE+" es: "+sumaPares);
	    i=1;

		while(i<=NUM_TOPE) {
			multiplicaImpares=multiplicaImpares*i;
			i=i+2;
		}

		System.out.println("Las multiplicaciones de los impares desde el 1 al "+NUM_TOPE+" es "+multiplicaImpares);

	}

}

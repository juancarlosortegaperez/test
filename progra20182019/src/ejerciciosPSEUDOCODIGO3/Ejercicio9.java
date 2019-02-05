package ejerciciosPSEUDOCODIGO3;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
			int numA=0, suma=0, i=0, media=0;
		//INICIO
			System.out.println("Introduzca un número");
			numA=Entrada.entero();
        	
			while (numA>=0) {
        		suma=suma+numA;
        		i++;
        		System.out.println("Introduzca un número: ");
        		numA=Entrada.entero();
			}
        	media=suma/i;
        	System.out.println("La media de tus números es: "+media);
	}

}

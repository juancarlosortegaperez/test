package ejerciciosPSEUDOCODIGO1;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//variables
		int dividendo=0, divisor=0, cociente=0, resto=0;
			
	//Inicio
		System.out.println("Introduzca el dividendo");
		dividendo=Entrada.entero();
		System.out.println("Introduzca el divisor");
		divisor=Entrada.entero();
		cociente=dividendo/divisor;
		System.out.println("EL COCIENTE DE LA DIVISIÓN ES: "+cociente);
		resto=dividendo%divisor;
		System.out.println("EL RESTO DE LA DIVISIÓN ES: "+resto);
	}

}

package ejerciciosPSEUDOCODIGO2;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
			int numeroA=0, numeroB=0;
	
		//Inicio
			System.out.println("Introduzca un número");
			numeroA=Entrada.entero();
			System.out.println("Introduzca un número");
			numeroB=Entrada.entero();
		
			if(numeroA%numeroB==0) {
				System.out.println("El número "+numeroA+" es múltiplo de "+numeroB);
			}
			else {
				System.out.println("El número "+numeroA+" no es múltiplo de "+numeroB);
			}
		}
	}
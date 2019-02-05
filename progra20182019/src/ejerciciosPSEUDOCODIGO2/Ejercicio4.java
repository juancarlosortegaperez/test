package ejerciciosPSEUDOCODIGO2;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
			int numeroA=0, numeroB=0, resto=0;

		//Inicio
			System.out.println("Introduzca un número");
			numeroA=Entrada.entero();
			System.out.println("Introduzca un número");
			numeroB=Entrada.entero();
	
			if(numeroA==numeroB) {
				System.out.println("Ambos números son iguales, por lo que son múltiplos mutuos");
			}
			else {
				resto=numeroA%numeroB;
				if (resto==0) {
				System.out.println("El número "+numeroA+" es múltiplo del número "+numeroB);
				}
				else {
					System.out.println("El número "+numeroA+" no es múltiplo del número "+numeroB);
				}
				resto=numeroB%numeroA;
				if (resto==0) {
				System.out.println("El número "+numeroB+" es múltiplo del número "+numeroA);
				}
				else {
					System.out.println("El número "+numeroB+" no es múltiplo del número "+numeroA);
				}
			}
		}
	}
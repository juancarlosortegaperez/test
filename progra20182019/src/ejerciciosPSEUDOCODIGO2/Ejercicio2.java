package ejerciciosPSEUDOCODIGO2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
			int numero1=0, numero2=0;
		
		//Inicio
			System.out.println("Introduzca un número entero");
			numero1=Entrada.entero();
			System.out.println("Introduzca un número entero");
			numero2=Entrada.entero();
			
			if(numero1>numero2) {
				System.out.println("El número: "+numero1+" es mayor que el número: "+numero2);
			}
			else {
				if(numero1<numero2) {
					System.out.println("El número: "+numero2+" es mayor que el número: "+numero1);
				}
				else {
					System.out.println("Ambos números son iguales");
				}
			}
		}
	}

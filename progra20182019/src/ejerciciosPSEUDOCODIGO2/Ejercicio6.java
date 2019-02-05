package ejerciciosPSEUDOCODIGO2;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
			int numero=0;

		//Inicio
			System.out.println("Introduzca un número entre el 0 y el 9999");
			numero=Entrada.entero();

			if(numero>=0 && numero<=9999) {
				if (numero>=1000) {
					System.out.println("Tiene 4 cifras");
					if (numero>=100) {
						System.out.println("Tiene 3 cifras");
					}
					else {
						if(numero>=10) {
							System.out.println("Tiene 2 cifras");
						}
						else {
							System.out.println("Tiene 1 cifra");
						}
					}
				}
			}
			else {
					System.out.println("El número no está entre 0 y 9999");
			}
		}
	}
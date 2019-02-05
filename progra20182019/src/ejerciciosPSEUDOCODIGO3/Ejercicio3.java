package ejerciciosPSEUDOCODIGO3;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		int numero=0, cuentaPares=0;
	
		//Inicio
			while (cuentaPares<=20) {
				if (numero%2==0) {
					System.out.println("Número par: "+numero);
					cuentaPares++;
				}
				numero++;
			}
		}
	}
package ejerciciosPSEUDOCODIGO3;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
			int num=0, contpositivo=0;
		//INICIO
			System.out.println("Introduzca un n�mero");
			num=Entrada.entero();
        
			while (num>0) {
        		contpositivo++;
        		System.out.println("Introduzca otro n�mero: ");
        		num=Entrada.entero();
			}
        	System.out.println("Ha escrito un n�mero negativo o un 0");
        	System.out.println("Ha escrito "+contpositivo+ " n�meros positivos");
	}

}

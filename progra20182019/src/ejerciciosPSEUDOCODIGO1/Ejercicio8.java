package ejerciciosPSEUDOCODIGO1;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*numero_elevado*/
		
		int numA=0;
		
		System.out.println("introduzca un numero entero");
		numA=Entrada.entero();
		System.out.println("numero " +numA+"\nnumero elevado a 2 " +Math.pow(numA, 2)+ "\nnumero elevado a 3 "+Math.pow(numA, 3));
	}

}

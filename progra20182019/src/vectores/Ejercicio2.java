package vectores;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] vectorInicial=new int [10];
		int [] vectorPares=new int [10];
		int [] vectorImpares=new int [10];
		int pares=0, impares=0;
		
		for(int i=0;i<vectorInicial.length;i++) {
			System.out.println("Dame un valor entre 1 y 20 para la posición "+i);
			vectorInicial[i]=Entrada.entero();
		}
		
		for(int i=0;i<vectorInicial.length;i++) {
			if (vectorInicial[i]%2==0) {
				pares++;
				
			}
			else {
				impares++;
				   
			}
		}
		
		vectorPares=new int [pares];
		vectorImpares=new int [impares];
		
		for(int i=0;i<vectorInicial.length;i++) {
			
		}
		
		System.out.println("Hay "+vectorPares+" números pares.");
		System.out.println("Hay "+vectorImpares+" números impares.");
	}

}

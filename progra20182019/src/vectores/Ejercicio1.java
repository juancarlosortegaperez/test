package vectores;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pares=0, impares=0;
		int [] vectorAleatorio=new int [10];
		
		for(int i=0;i<vectorAleatorio.length;i++) {
			vectorAleatorio[i]=(int) (Math.random()*(20-1+1)+1);
		}
		for(int i=0;i<vectorAleatorio.length;i++) {
			if (vectorAleatorio[i]%2==0) {
				pares++;
			}
			else {
				impares++;
			}
		}
		System.out.println("Hay "+pares+" n�meros pares.");
		System.out.println("Hay "+impares+" n�meros impares.");
		for(int i=0;i<vectorAleatorio.length;i++) {
			System.out.println("En la posici�n "+i+" est� el valor "+vectorAleatorio[i]);
		}
	}

}

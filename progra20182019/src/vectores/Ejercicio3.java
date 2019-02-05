package vectores;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] vectorNumeros=new int [10];
		int numeroMayor=0, posicion=0;
		
		for(int i=0;i<vectorNumeros.length;i++) {
			vectorNumeros[i]=(int) (Math.random()*(100-1+1)+1);
		}
		
		for(int i=0;i<vectorNumeros.length;i++) {
			if (vectorNumeros[i]>=numeroMayor) {
				numeroMayor=vectorNumeros[i];
				posicion=i;
			}
		}
		
		for(int i=0;i<vectorNumeros.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vectorNumeros[i]);
		}
		
		System.out.println("El número aleatorio es "+numeroMayor+" y ha salido en la posición "+posicion);
	}

}

package vectores;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero=0;
		int [] numerosSinRepetir=new int [10];
		
		numero=(int) (Math.random()*(50-1+1)+1);
		for(int i=0;i<numerosSinRepetir.length;i++) {
			if (numero!=numerosSinRepetir[i]) {
			numerosSinRepetir[i]=(int) (Math.random()*(10-1+1)+1);
			}
		}
		
		for(int i=0;i<numerosSinRepetir.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+numerosSinRepetir[i]);
		}
	}

}

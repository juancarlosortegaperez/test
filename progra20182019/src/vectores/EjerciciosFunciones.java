package vectores;

public class EjerciciosFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] vectorEj1=new int [5];
		int [] vectorEj2=new int [5];
		
		int num=0, posicion;
		
		for (int i=0; i<vectorEj1.length; i++) {
			System.out.println("Dame un valor para la posición "+i);
			vectorEj1[i]=Entrada.entero();
		}
		muestraValoresVector(vectorEj1);
		posicion=devuelvePosicion(vectorEj2, num);
		System.out.println(posicion);
		
	}
	
	public static void muestraValoresVector (int [] vector) {
		for (int i=0; i<vector.length; i++) {
			System.out.println("En la posición "+i+" está el valor "+vector[i]);
		}
	}
	
	public static int devuelvePosicion (int [] vector, int num) {
		int pos=-1;
		for (int i=0; i<vector.length; i++) {
			if (num==vector[i]) {
				return pos=i;
			}
		}
		return pos;
	}
	
	public static void multiplicaPropioVector (int [] vector, int num) {
		
	}
	

}

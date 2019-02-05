package ordenacion;

public class OrdenacionMIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] vector= {5,1,7,3,9};
		
		ordenaVector(vector);
	}
	
	public static void ordenaVector (int []vector) {
		for (int j=0;j<vector.length;j++) {
			for(int i=4;i>=vector.length;i--) {
				if (vector[j]>vector[i]) {
					vector[j]=vector[i];
				}
			}
		}
		for(int j=0;j<vector.length;j++) {
			System.out.println(vector[j]);
		}
	}

}

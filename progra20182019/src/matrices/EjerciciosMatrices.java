package matrices;

public class EjerciciosMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matriz1= new int [5][5];
		int [][] matriz2= new int [5][5];
		
		//Función 1
		/*for(int i=0;i<matriz1.length;i++) {
			for(int j=0;j<matriz1[i].length;j++)
			{
				matriz1[i][j]=(int) (Math.random()*(9-1+1)+1);
			}
		}
		int suma=sumaMatriz(matriz1);
		System.out.println("La suma de todos los elementos es: "+suma);
		*/
		//Función 2
		for(int i=0;i<matriz2.length;i++) {
			for(int j=0;j<matriz2[i].length;j++)
			{
				matriz2[i][j]=(int) (Math.random()*(9-1+1)+1);
			}
		}
		int num=8;
		buscaElemento(matriz2, num);
	}
	
	public static int sumaMatriz (int[][] matriz1) {
		int suma=0;
		for(int i=0;i<matriz1.length;i++) {
			for(int j=0;j<matriz1[i].length;j++)
			{
				suma+=matriz1[i][j];
			}
		}
		return suma;
	}
	
	public static void buscaElemento (int[][]matriz2, int num) {
		int apariciones=0;
		for(int i=0;i<matriz2.length;i++) {
			for(int j=0;j<matriz2[i].length;j++)
			{
				if (num==matriz2[i][j]) {
					apariciones++;
				}
				System.out.println("Fila "+i
						+" columna "+j+", valor: "+matriz2[i][j]);
			}
			System.out.println("\n");
		}
		System.out.println("El número "+num+" ha aparecido "+apariciones+ " veces.");
	}
	
	public static boolean esMatrizCuadrada (int [][]matriz3) {
		return true;
	}
	
	public static boolean esMatrizEscalar (int [][]matriz4) {
		return true;
	}
	
	public static boolean esMatrizIdentidad (int [][]matriz5) {
		return true;
	}
	
	public static String esMatrizTriangular (int [][]matriz6) {
		return null;	
	}
	
	public static int sumaMatrices (double [][]matriz7,double [][]matriz) {
		return 0;
	}
	
	public static int multiplicaMatrices (double [][]matriz8,double [][]matriz) {
		return 0;
	}
}
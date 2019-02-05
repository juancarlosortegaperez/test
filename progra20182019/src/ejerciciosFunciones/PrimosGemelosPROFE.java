package ejerciciosFunciones;

public class PrimosGemelosPROFE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce un numero: ");
		int n=Entrada.entero();
		numerosprimosgemelos(n);
	}
	
	public static void numerosprimosgemelos(int n){
		int i=0, primo1=1, primo2=2;
		
		while (n>i){
			if ((primo2-primo1)==2){
				i++;
				System.out.println("("+primo1+","+primo2+")");
			}
				primo1=primo2;
				primo2=siguientePrimo(primo2);
		}
	}
	public static int siguientePrimo(int p){

		int posibleSiguientePrimo=p+1;
		while (!esPrimo(posibleSiguientePrimo)){
			posibleSiguientePrimo++;			
		}
		
		return posibleSiguientePrimo;
	}
	
	public static boolean esPrimo(int num)
	{
		int i=2;
		while(i<=num/2 && num%i!=0)
			i++;
		
		if(i>num/2)
			return true;
		else
			return false;
	}
}

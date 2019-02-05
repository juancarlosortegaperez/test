package ejerciciosFunciones;

public class Ejercicio8PROFE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		System.out.println("Introduce un número: ");
		numero=Entrada.entero();
		
		if(!esPrimo(numero))
			System.out.println("El número "+numero+" NO es primo");
		else
			System.out.println("El número "+numero+" es primo");
		
		
		
		//System.out.println("El número "+numero+" tiene "+numeroDivisoresPrimos(numero)+" divisores primos");		
	}
	
	public static int numeroDivisoresPrimos(int n)
	{
		int div=0;
		
		for(int i=1;i<n/2;i++)
			if(n%i==0 && esPrimo(i)){
				div++;
				System.out.println(i);
			}
		
		return div;
				
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
	
	public static boolean esPrimo1(int num)
	{
		int i=2;
		while(i<num/2) {
			if(num%i==0)
				return false;
			i++;
		}		
		
		return true;
	}
}



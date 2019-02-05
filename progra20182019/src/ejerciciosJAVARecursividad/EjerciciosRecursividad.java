package ejerciciosJAVARecursividad;

public class EjerciciosRecursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0, base=0, exponente=0;
		
		System.out.println("De qué número quieres hacer la tabla: ");
		numero=Entrada.entero();
		tablaDeMultiplicar(numero,6);
		
		System.out.println("Introduzca una base");
		base=Entrada.entero();
		System.out.println("Introduzca el exponente");
		exponente=Entrada. entero();
		potencia(base, exponente);
		
		System.out.println("Introduzca un número");
		numero=Entrada.entero();
		imprimeCifrasNumero(numero);
	}

	//EJERCICIO 1
	public static void tablaDeMultiplicar(int num,int j)
	{
		//caso base
		if(j==1) {
			System.out.println(num+"x"+j+"="+num*j);	 
		}//caso recursivo
		else {
			tablaDeMultiplicar(num,j-1);
			System.out.println(num+"x"+j+"="+num*j);	
						
		}
	}
	
	//EJERCICIO 2
	public static int potencia(int base, int exponente)
	{
		int pot;
		//caso base
		if(exponente==0) {
			return 1;
		}//caso recursivo
		else {
			pot=base*potencia(base, exponente-1);
			return pot;
		}
	}
	
	//EJERCICIO 3
	public static void imprimeCifrasNumero(int num) {
		int cifra=0;
		int restNumero=0;
		//caso base
		if (num<10) {
			System.out.print(num);
		}//caso recursivo
		else {
			cifra=num%10;
			restNumero=num/10;
			
			imprimeCifrasNumero(restNumero);
			System.out.print(" "+cifra);
		}
	}
	
	//EJERCICIO 4
	public static void imprimeImparesNoPrimos(int n) {
		
	}
	
	//EJERCICIO 5
	public static void invertirNumero(int num) {
		
	}
	
	//EJERCICIO 6
	
	
	//EJERCICIO 7
	public static void f(int num, int div) {
		if (num>1) {
			if ((num%div)==0) {
				System.out.println(div);
				f(num/div,div);
			}
		}
	}
	
	//EJERCICIO 8
	public static int f(int x) {
		if (x>100)
			return (x-10);
		else
			return (f(f(x+11)));
	}
}

package ejerciciosFunciones;

public class EjerciciosIniciales {

	public static void main(String[] args) {
		int num=0,num1=0,num2=0,num3=0,max=0;
		/*
		 
		//Ejercicio1 
		System.out.println("Introduzca un número: ");
		num=Entrada.entero();
		
		nVeces(num);
		
		//Ejercicio2
		System.out.println("Introduzca un número: ");
		num1=Entrada.entero();
		
		System.out.println("Introduzca un número: ");
		num2=Entrada.entero();
		
		max=maximoDosNumeros(num1,num2);
		
		
		System.out.println("El máximo entre "+num1+" y "+num2+" es "+max);
		
		//Ejercicio3
		System.out.println("Introduzca un número: ");
		num1=Entrada.entero();
		
		System.out.println("Introduzca un número: ");
		num2=Entrada.entero();
		
		System.out.println("Introduzca un número: ");
		num3=Entrada.entero();
		
		max=maximoTresN(num1,num2,num3);
		
		System.out.println("El máximo entre "+num1+", "+num2+" y "+num3+" es "+max);
		
		
		//Ejercicio 4
		System.out.println("Introduzca un número: ");
		num1=Entrada.entero();
		
		System.out.println("Introduzca un número: ");
		num2=Entrada.entero();
		
		muestreDeUnoAOtro(num1,num2);
		
		
		//Ejercicio 5
		double numero=0, doble=0;
		System.out.println("Introduzca un número:");
		numero=Entrada.real();
		doble=dobleDelNumero(numero);
		System.out.println("El doble del número "+numero+" es igual a "+doble);
		*/
		
		//Ejercicio 6
		double radio=0, altura=0, area=0, volumen=0;
		char areaVolumen=' ';
		System.out.println("Introduzca el radio");
		radio=Entrada.real();
		System.out.println("Introduzca la altura");
		altura=Entrada.real();
		System.out.println("Escribe 'a' para calcular el área y 'v' para calcular el volumen");
		areaVolumen=Entrada.caracter();
	}
	
	public static void nVeces(int numeroN) {
		
		while(numeroN>=1) {
			System.out.println("Modulo ejecutandose..");
			numeroN--;
		}
		
	}
	
	public static int maximoDosNumeros(int a, int b) {
		if (a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static int minimoDosNumeros(int a,int b)
	{
		if (a>b) {
			return b;
		}
		else {
			return a;
		}
	}

	public static int maximoTresNumeros(int a, int b, int c)
	{
		if (a>b && a>c)
			return a;
		else
		{
			if (b>a && b>c)
				return b;
			else
				return c;
		}
	}
	
	public static int maximoTresN(int a,int b, int c)
	{
		return maximoDosNumeros(maximoDosNumeros(a,b),c);
	}

	public static void muestreDeUnoAOtro (int n1, int n2) {
		int min=0,max=0;
		
		min=minimoDosNumeros(n1,n2);
		max=maximoDosNumeros(n1,n2);
			
		while (min<max) {
			System.out.print(min+", ");
			min++;
		}		
		
		System.out.print(min);
	}

	public static double pedirNumero () {
		double num=0;
		System.out.println("Introduzca un número:");
		num=Entrada.real();
		return num;
	}
	public static double dobleDelNumero(double num) {
		double dob=num*2;
		
		return dob;
	}
	
public static double areaOVolumenCilindro (double radio, double altura, char areaVolumen) {
		
		double area=0, volumen=0;
		
		if(areaVolumen=='a') {
			area=2*Math.PI*radio*altura+2*Math.PI*Math.pow(radio,2);
			return area;
		}else {
			if(areaVolumen=='v') {
				volumen=Math.PI*Math.pow(radio, 2)*altura;
				return volumen;
			}else {
				return 0;
			}
		}
	}


}

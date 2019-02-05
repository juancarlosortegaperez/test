package ejerciciosJAVA;

import java.util.Scanner;

public class Ejercicio3 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		//variables
		int numero=0,copiaNumero=0,numUnidad=0,numDecena=0,numCentena=0,i=1,acumulador=0,
				acumuladorU=1,acumuladorD=1,acumuladorC=1;
		System.out.println("Introduzca un numero de 3 cifras:");
		numero=entrada.nextInt();
		copiaNumero=numero;
		numUnidad=copiaNumero%10;
		copiaNumero=copiaNumero/10;
		numDecena=copiaNumero%10;
		copiaNumero=copiaNumero/10;
		numCentena=copiaNumero%10;
		copiaNumero=copiaNumero/10;
		while(i<=3) {
			acumuladorU=acumuladorU*numUnidad;
			acumuladorD=acumuladorD*numDecena;
			acumuladorC=acumuladorC*numCentena;
			i++;
		}
		acumulador=acumuladorU+acumuladorD+acumuladorC;
		if (acumulador==numero) {
			System.out.println("El numero es un numero Armstrong y este es el resultado: "+acumulador);
		}else {
			System.out.println("El numero no es Armstrong y este es el resultado: "+acumulador);
		}
		
	}

}

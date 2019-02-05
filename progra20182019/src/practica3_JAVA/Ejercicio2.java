package practica3_JAVA;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
			int numeroTablas=0, numeroPrimos=0, i=1, j=1;
		//Inicio
			System.out.println("Introduzca hasta qué número quiere hacer las tablas de multiplicar");
			numeroTablas=Entrada.entero();
			System.out.println("Introduzca hasta qué número quiere llegar a multiplicar los números");
			numeroPrimos=Entrada.entero();
			while (i<=numeroTablas) {
				while (j<=numeroPrimos) {
						if (i*j>=1000 && i*j<10000) {
							System.out.print(j+"x"+i+"="+i*j+"\t");
						}
						if (i*j>=100 && i*j<1000) {
							System.out.print(j+"x"+i+"="+i*j+" \t");
						}
						if (i*j>=10 && i*j<100) {
							System.out.print(j+"x"+i+"="+i*j+"  \t");
						}
						if (i*j>=0 && i*j<10) {
							System.out.print(j+"x"+i+"="+i*j+"   \t");
						}
					}
					j++;
				}
				System.out.println(" ");
				j=1;
				i++;
			}
	}
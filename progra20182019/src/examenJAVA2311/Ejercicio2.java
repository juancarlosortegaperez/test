package examenJAVA2311;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CONSTANTES
			final int DIA_SECRETO=25, MES_SECRETO=3, ANIO_SECRETO=2000;
		//variables
			int dia=0, mes=0, anio=0, intentos=0, i=1;
			boolean fecha=false;
			
		//Inicio		
		System.out.println("¡BIENVENIDO A ADIVINA LA FECHA SECRETA!");
		System.out.println("¿En cuantos intentos quieres adivinar la fecha?");
		intentos=Entrada.entero();
		
		while (i<=intentos && fecha==false) {
			System.out.println("Introduzca el día");
			dia=Entrada.entero();
			System.out.println("Introduzca el mes");
			mes=Entrada.entero();
			System.out.println("Introduzca el año");
			anio=Entrada.entero();
				
			if (mes<=12) {
				if (((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && dia<=31) 
						|| ((mes==4 || mes==6 || mes==9 || mes==11) && dia<=30) 
						|| (mes==2 && (anio%4==0 && (anio%100!=0 || anio%400==0)) && dia<=29)
						|| (mes==2 && !(anio%4==0 && (anio%100!=0 || anio%400==0)) && dia<=28)) {
					if (anio==ANIO_SECRETO) {
						System.out.println("AÑO ACERTADO!");
						if (mes==MES_SECRETO) {
							System.out.println("MES ACERTADO!");
							if (dia==DIA_SECRETO) {
								System.out.println("¡¡ACERTASTE LA FECHA EN "+i+" INTENTOS!!");
								fecha=true;
							}
							else {
								if (dia>DIA_SECRETO) {
									System.out.println("Pero el día secreto es menor que el día que has escrito");
								}
								if (dia<DIA_SECRETO) {
									System.out.println("Pero el día secreto es mayor que el día que has escrito");
								}
							}
						}
						else {
							if (mes>MES_SECRETO) {
								System.out.println("Pero el mes secreto es menor que el mes que has escrito");
							}
							if (mes<MES_SECRETO) {
								System.out.println("Pero el mes secreto es mayor que el mes que has escrito");
							}
						}
					}
					else {
						if (anio>ANIO_SECRETO) {
							System.out.println("El año secreto es menor que el año que has escrito");
						}
						if (anio<ANIO_SECRETO) {
							System.out.println("El año secreto es mayor que el año que has escrito");
						}
					}
					i++;
				}
				else {
					System.out.println("Fecha incorrecta, este intento no cuenta...");
				}
			}
			else {
				System.out.println("Fecha incorrecta, este intento no cuenta...");
			}
		}
		if (i>intentos+1) {
			System.out.println("¡¡OOH!! AGOTASTE TUS INTENTOS, LA FECHA ERA "+DIA_SECRETO+"/"+MES_SECRETO+"/"+ANIO_SECRETO);
		}
	}

}

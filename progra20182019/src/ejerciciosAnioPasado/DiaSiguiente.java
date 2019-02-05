package ejerciciosAnioPasado;

public class DiaSiguiente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//VARIABLES
		
		int dia_hoy=0, mes_hoy=0, anyo_hoy=0;
		
		//INICIO
		
		System.out.println("Introduce el día de hoy");
		dia_hoy=Entrada.entero();
		System.out.println("Introduce el mes en el que estamos");
		mes_hoy=Entrada.entero();
		System.out.println("Introduce el año en el que estamos");
		anyo_hoy=Entrada.entero();

		if (dia_hoy==31 && (mes_hoy == 1 || mes_hoy == 3 || mes_hoy == 5 || mes_hoy == 7 || mes_hoy == 8 || mes_hoy == 10)) {
			dia_hoy=1;
			mes_hoy++;
		}
		else {
			if (dia_hoy==30 && (mes_hoy == 4 || mes_hoy == 6 || mes_hoy == 9 || mes_hoy == 11)) {
				dia_hoy=1;
				mes_hoy++;
			}else {
				if(dia_hoy==29 && mes_hoy==2 && (anyo_hoy%4==0 && (anyo_hoy%100!=0 || anyo_hoy%400==0))) {
					dia_hoy=1;
					mes_hoy++;
				}
				else {
					if(dia_hoy==28 && mes_hoy==2 && !(anyo_hoy%4==0 && (anyo_hoy%100!=0 || anyo_hoy%400==0))) {
						dia_hoy=1;
						mes_hoy++;
					}
					else {
						if (dia_hoy==31 && mes_hoy==12) {
							dia_hoy=1;
							mes_hoy=1;
							anyo_hoy++;
						}
						else {
							dia_hoy++;
						}
					}
				}
			}
		}
		System.out.println("El día siguiente al introducido es "+dia_hoy+"/"+mes_hoy+"/"+anyo_hoy);
	}
}


	




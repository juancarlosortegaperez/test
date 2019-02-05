package practica3_JAVA;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CONSTANTES
			final int DIA_REFERENCIA=14, MES_REFERENCIA=11, ANIO_REFERENCIA=2018;
		//variables
			int dia=0, mes=0, anio=0, contador_dias=0;
			String dia_nacimiento=" ";
		
		//Inicio
			System.out.println("Introduzca el día de su nacimiento");
			dia=Entrada.entero();
			System.out.println("Introduzca el mes de su nacimiento");
			mes=Entrada.entero();
			System.out.println("Introduzca el año de su nacimiento");
			anio=Entrada.entero();
			
			System.out.println("Sabiendo que el día "+DIA_REFERENCIA+" de "+MES_REFERENCIA+" de "+ANIO_REFERENCIA+"...");
			
			while (mes<=12) {
				if (mes==2) {
					if ((anio%4==0) && ((anio%100!=0) || (anio%400==0))) {
						contador_dias=contador_dias+(29-dia);
					}
					else {
						contador_dias=contador_dias+(28-dia);
					}
				}
				if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
					contador_dias=contador_dias+(31-dia);
				}
				if (mes==4 || mes==6 || mes==9 || mes==11) {
					contador_dias=contador_dias+(30-dia);
				}
			mes++;
			}
			
			anio=anio+1;
			while (anio<ANIO_REFERENCIA) {
				if ((anio%4==0) && ((anio%100!=0) || (anio%400==0))) {
					contador_dias=contador_dias+366;
				}
				else {
					contador_dias=contador_dias+365;
				}
				anio++;
			}
			mes=1;
			while (anio==ANIO_REFERENCIA && mes<=MES_REFERENCIA) {
				if (mes==MES_REFERENCIA) {
					contador_dias=contador_dias+DIA_REFERENCIA;
				}
				else {
					if (mes==2) {
						if ((anio%4==0) && ((anio%100!=0) || (anio%400==0))) {
							contador_dias=contador_dias+(29-dia);
						}
						else {
							contador_dias=contador_dias+(28-dia);
						}
					}
					if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
						contador_dias=contador_dias+(31-dia);
					}
					if (mes==4 || mes==6 || mes==9 || mes==11) {
						contador_dias=contador_dias+(30-dia);
					}
			}
			mes++;
			}
			System.out.println(contador_dias);
			contador_dias=contador_dias%7;
			switch(contador_dias){
			case 4:
				dia_nacimiento="MIERCOLES";
				break;
			case 5:
				dia_nacimiento="JUEVES";
				break;
			case 6:
				dia_nacimiento="VIERNES";
				break;
			case 0:
				dia_nacimiento="SABADO";
				break;
			case 1:
				dia_nacimiento="DOMINGO";
				break;
			case 2:
				dia_nacimiento="LUNES";
				break;
			case 3:
				dia_nacimiento="MARTES";
				break;
		}
		System.out.println("Usted nació un "+dia_nacimiento);
	}

}

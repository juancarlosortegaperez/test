package ejerciciosAnioPasado;

public class NumeroContenido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//VARIABLES
		
		int numero1=0, numero2=0, i=0, j=0, 
				cifrasNumero1=0, cifrasNumero2=0;
		boolean cifraContenida=false;
		
		//INICIO
		
		System.out.println("Introduce un número:");
		numero1=Entrada.entero();
		System.out.println("Introduce otro número:");
		numero2=Entrada.entero();
		
		if(numero1>numero2) {
			
			//Voy a averiguar cuantas cifras tiene el numero2
			
			i=numero2;
			while (i>0) {
				i=i/10;
				cifrasNumero2++;
			}
			
			j=numero1;
			while (j>0) {
				j=j/(int)Math.pow(10, cifrasNumero2);
				if (j==numero2) {
					cifraContenida=true;
				}
			}
			if(cifraContenida) {
				System.out.println("Verdadero");
			}
			else {
				System.out.println("Falso");
			}
		}
		else {
		
			if (numero1<numero2) {
			
				//Voy a averiguar cuentas cifras tiene el numero1
				j=numero1;
				while (j>0) {
					j=j/10;
					cifrasNumero1++;
				}
				
				i=numero2;
				while (i>0) {
					i=i/(int)Math.pow(10, cifrasNumero1);
					if (i==numero1) {
						cifraContenida=true;
					}
				}
			}
			else {
				if(cifraContenida) {
					System.out.println("Verdadero");
				}
				else {
					System.out.println("Falso");
				}
			}
		}
		if (cifraContenida) {
			System.out.println("Verdadero");
		}
		else {
			System.out.println("Falso");
		}
	}

}

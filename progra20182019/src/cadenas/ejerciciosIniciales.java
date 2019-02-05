package cadenas;

public class ejerciciosIniciales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(correoElectronico()); 
	}
	
	public static String correoElectronico () {
		String nombre, dominio, tld;
		String correo;
		System.out.print("Introduzca un nombre: ");
		nombre=Entrada.cadena();
		System.out.print("Introduzca un dominio: ");
		dominio=Entrada.cadena();
		System.out.print("Introduzca un TLD: ");
		tld=Entrada.cadena();
		
		System.out.println("Su cuenta de correo es "+nombre+"@"+dominio+"."+tld);
		
		correo=nombre+"@"+dominio+"."+tld;
		return correo;
	}

}

package ejercicios2�bachA�oPasado;

/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO37
{
    public static void main (String args[])
    {
      
     int aleatorio, numero;
     Scanner leer=new Scanner(System.in);
    
     
     aleatorio=(int) Math.floor(Math.random()*100);
     
     
     
     System.out.println("Introduzca un número ");
     numero=leer.nextInt();
     while (numero!=-1&&numero !=aleatorio)
     {
         if (numero<aleatorio) {System.out.println("Es menor que el número secreto");}
         if (numero>aleatorio) {System.out.println("Es mayor que el número secreto");}
         System.out.println("Introduzca un número");
         numero=leer.nextInt();
        }
         if (numero==aleatorio) {System.out.println("Has acertado");}
         else {System.out.println("Te rendiste");}
     
  
    }
}

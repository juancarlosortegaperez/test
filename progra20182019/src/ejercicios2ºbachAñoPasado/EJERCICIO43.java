package ejercicios2∫bachAÒoPasado;

/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO43
{
    public static void main (String args[])
    {
      
     int altura, alturamax=0;
     Scanner leer=new Scanner(System.in);
     System.out.println("Introduzca una altura");
     altura=leer.nextInt();
     
     while (altura>=0)
     {
         if (altura> alturamax) {alturamax=altura;}
         System.out.println("Introduzca una altura");
         altura=leer.nextInt();  
     }
     System.out.println("La altura m√°xima introducida es:"+alturamax);
    }
}

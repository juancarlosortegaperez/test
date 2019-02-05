package ejercicios2ºbachAñoPasado;

/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO46{
    public static void main (String args[])
    {
      int n,suspensos=0;
      Scanner leer=new Scanner(System.in);
      
      for (int i=1; i<=5; i++)
      {
      System.out.println("Introduzca una nota");
      n=leer.nextInt();
      if(n<5)
      {suspensos=suspensos+1;}
      }
      System.out.println("Hoy "+suspensos+"suspenso");
    
    
    }
}

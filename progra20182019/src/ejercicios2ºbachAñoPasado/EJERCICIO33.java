package ejercicios2�bachA�oPasado;

/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO33{
    public static void main (String args[])
    {
      double a;
      Scanner leer=new Scanner(System.in);
      System.out.println("Introduzca un número");
      a=leer.nextDouble();
     
      if(a<0)
      {
          System.out.println("Error");
        }
        else
        {
          
            System.out.println("La raiz es :" + Math.sqrt(a));
        
    }
}}
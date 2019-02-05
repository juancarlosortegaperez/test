package ejercicios2∫bachAÒoPasado;

/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO34{
    public static void main (String args[])
    {
      int a,b ;
      Scanner leer=new Scanner(System.in);
      System.out.println("Introduzca un n√∫mero");
      a=leer.nextInt();
      b=leer.nextInt();
      if(a==b*b)
      {
          System.out.println("a es cuadrado de b");
        }
        else
        {
          
            System.out.println("a no es cuadrado de b");
        
    }
}}
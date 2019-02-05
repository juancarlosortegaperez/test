package ejercicios2∫bachAÒoPasado;

/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO42{
    public static void main (String args[])
    {
      int n,factorial=1;
      Scanner leer=new Scanner(System.in);
      System.out.println("Introduzca un n√∫mero");
      n=leer.nextInt();
      for (int i=1; i<=n; i++)
      {
          factorial=factorial*i;
      
      
      
        }
        System.out.println("El factorial de "+n+"es: "+factorial);
}}

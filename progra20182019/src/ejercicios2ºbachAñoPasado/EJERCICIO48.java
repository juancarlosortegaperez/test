package ejercicios2ºbachAñoPasado;
/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO48{
    public static void main(String args[])
    {
    int n;
    Scanner leer= new Scanner(System.in);
    System.out.println("Introduzca un numero");
    n=leer.nextInt();
      for (int i=n; i>=1; i--)
      {
          for (int j=1; j<=i; j++)
      
          {
              System.out.print("*");
            }
            System.out.println(" ");
        }
       
    
        
    }
}

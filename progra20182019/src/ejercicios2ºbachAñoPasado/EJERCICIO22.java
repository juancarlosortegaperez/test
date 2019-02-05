package ejercicios2ºbachAñoPasado;

/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO22
{
    public static void main (String args[])
    {
      int a,b;
      Scanner leer=new Scanner(System.in);
      System.out.println("Introduzca el valor de un nÃºmero");
      a=leer.nextInt();
      System.out.println("Introduzca el valor de otro nÃºmero");
      b=leer.nextInt();
      if(a+b==0)
      {
          System.out.println("la suma es cero");
        }
        else
        {
            if(a+b>0)
            {
                System.out.println("La suma es positiva");
            }
            else
            {System.out.println("La suma es negativa");
            }
    }
}
}

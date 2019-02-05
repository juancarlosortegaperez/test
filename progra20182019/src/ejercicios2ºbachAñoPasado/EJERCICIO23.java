package ejercicios2ºbachAñoPasado;

/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO23
{
    public static void main (String args[])
    {
      int a,b,c;
      
      Scanner leer=new Scanner(System.in);
      System.out.println("Introduzca el valor de a");
      a=leer.nextInt();
      System.out.println("Introduzca el valor de b");
      b=leer.nextInt();      
      System.out.println("Introduzca el valor de c");
      c=leer.nextInt();         
      
        
      
      if(a>b && a>c)
      {
          System.out.println(a);
          if(b>c)
      { 
      System.out.println(b);
      System.out.println(c);
    
    }
    else
     {System.out.println(b);
      System.out.println(c);
      
    }
    
      
      
    }
}
}

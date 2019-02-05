package ejercicios2ºbachAñoPasado;


/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO53
{
    public static void main (String args[])
    {
      
     int n, divisores;
     Scanner leer=new Scanner(System.in);
     System.out.println("Introduzca un numero");
     n=leer.nextInt();
     
     
     for (int i=1; i<=n ; i++)
     {
         divisores= calcula_divisores(i);
         
             if (divisores<=2) {System.out.println(i+" es primo");}
     else {System.out.println(i+"- No es primo");}
    
    }
    
       
    
}

    static int calcula_divisores(int numero)
    {int divisores=0;
        for(int j=1;j<=numero;j++)
        {
                if (numero%j==0){divisores++;}
        }
    return divisores;
}

}



package ejercicios2ºbachAñoPasado;


/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO35 
{
    public static void main (String args[])
    {
      
     int num;
     Scanner leer=new Scanner(System.in);
     System.out.println("Introduzca un numero");
     num=leer.nextInt();
     
     while (num!=0)
     {
         if (num>0) {System.out.println("Es positivo");} else {System.out.println("Es negativo");}
         
         if (num%2==0) {System.out.println("Es par");} else System.out.println("Es impar");
         System.out.println("El cuadrado es:" +num*num);
         
         System.out.println("Introduzca otro numero");
         num=leer.nextInt();
        
     }
    
    }
}

    
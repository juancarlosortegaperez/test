package ejercicios2ºbachAñoPasado;


/**
 * Write a description of class EJERCICIO50 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO50{
    public static void main (String args[])
    { int pos=0, neg=0,ceros=0;
      int [] numeros;
      Scanner leer=new Scanner(System.in);
      numeros= new int [10];
      for (int i=0; i<10; i++)
      {
      System.out.println("Introduzca un numero");
      numeros[i]=leer.nextInt();
    }
    for (int i=0; i<10; i++)
      {
          if(numeros[i]==0)
          {ceros++;}
          else{
              if(numeros[i]>0){pos++;} 
              else{neg++;}
            }
        
    }
    System.out.println("Numero de ceros:"+ceros);
    System.out.println("Numero de positivos:"+pos);
    System.out.println("Numero de negativo:"+neg);



}
}

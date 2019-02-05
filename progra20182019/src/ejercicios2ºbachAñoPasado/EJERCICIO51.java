package ejercicios2ºbachAñoPasado;

/**
 * Write a description of class EJERCICIO50 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO51{
    public static void main (String args[])
    { double pos=0, neg=0, sumapos=0, sumaneg=0, mediapos=0, medianeg=0;
      int [] numeros;
      Scanner leer=new Scanner(System.in);
      numeros= new int [10];
      for (int i=0; i<=9; i++)
      {
      System.out.println("Introduzca un numero");
      numeros[i]=leer.nextInt();
    }
    for (int i=0; i<9; i++)
      {
          if(numeros[i]>0) {pos++; sumapos=sumapos+numeros[i];}
          else{
              if(numeros[i]<0){neg++; sumaneg=sumaneg+numeros[i];} 
            }
        
    }
    if (pos>0)
        {mediapos=sumapos/pos;}
    if (neg>0)
        {medianeg=sumaneg/neg;}
    
    System.out.println("Media positivos:"+mediapos);
    System.out.println("Media negativos:"+medianeg);
    



}
}

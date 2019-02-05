package ejercicios2ºbachAñoPasado;
/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO47{
    public static void main(String args[])
    {
    int nota,numapro=0,numsusp=0, numcond=0;
    Scanner leer= new Scanner(System.in);
      
      for (int i=1; i<=6; i++)
      {
        System.out.println("Introduzca una nota");
        nota=leer.nextInt();
    
        if (nota>=5)
        {
            numapro=numapro+1;}
        else{
            if (nota <4) {numsusp++;}
            else{numcond++;}
        }
    }

        System.out.println("Hay "+numapro+"aprobados,"+numsusp+"suspensos,"+numcond+"condicionados");
        
    }
}

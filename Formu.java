package formulageneral;
import java.util.*;
 
public class Formu {
private  String nom="ECUACIONES"; 
private String fn="GRACIAS"; 
private String Nombre = "Katheryn";
public static void main(String[] args) {
Formu myObj = new Formu ();
System.out.println("Nombre:" + myObj.Nombre);
System.out.println("TEMA:" + myObj.nom);
   double a,b,c = 0;
   double x1,x2 =0;
   double d = 0;
    Scanner teclado;    
        teclado = new Scanner (System.in);
        System.out.println("DAME EL COEFICIENTE DE  A: ");
        a=teclado.nextInt  ();
        System.out.println("DAME EL COEFICIENTE DE B: ");
        b=teclado.nextInt  ();
        System.out.println("DAME EL COEFICIENTE DE C: ");
        c=teclado.nextInt  ();
        d = Math.pow(b,2)- 4*a*c;
        if (d<0){
            System.out.println("La solucion no es real.");           
        }else{
            x1 = (-b + Math.sqrt(d)) / 2*a;
            x2 = (-b - Math.sqrt(d)) / 2*a;
            System.out.println( );
            System.out.println("La solucion es: \nx1:  " +x1+"\nx2:  " +x2);
        }
     System.out.println("Muchas " + myObj.fn);  
    } 
}

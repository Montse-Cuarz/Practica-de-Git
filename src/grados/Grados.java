
/**
 *
 * @author Montse Garcia
 */
import java.util.Scanner;

public class Grados {

    double grados,resultado;
    int conversion;
    final int A=32;
    Scanner teclado= new Scanner (System.in);
    
    public void solicitar(){
System.out.println("CONVERSION DE GRADOS");
System.out.println(" ");
System.out.println("Escoja que tipo de conversion quiere realizar");
System.out.println("#1: C° A F°, #2: F° A C°");
conversion=teclado.nextInt();

if(conversion==1)
{
    System.out.print("INGRESE NUMERO DE GRADOS C°");
    grados=teclado.nextDouble();
    resultado=((grados-A)*5)/9;
    System.out.println("\n"+grados+"F° equivalen a "+resultado+" C°");}
System.out.println("****FIN DE PROCESO****");
}
    }
    


import java.util.Scanner;
/**
 * @author 16550549
 */
public class Principal {
    public static void main(String[] args) {
       Scanner sCaptu  = new Scanner(System.in);
        System.out.println("Introduce el numero a analizar: ");
        int iSeraPrimo = sCaptu.nextInt();
        int iResi; 
        for (int i = 2; i < iSeraPrimo; i++) { 
           iResi= iSeraPrimo % i;
            if (iResi == 0){ 
                System.out.println("El numero no es primo");
                break;}
        }
        int iRaiz =(int) Math.sqrt(iSeraPrimo);
         for (int i = 2; i < iRaiz; i++) {
           iResi= iSeraPrimo % i;
            if (iResi == 0) {
                System.out.println("El numero es primo");
                break;
            }
        }
    }
    
}

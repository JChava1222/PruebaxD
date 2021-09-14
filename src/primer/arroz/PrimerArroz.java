
package primer.arroz;

import java.util.Scanner;




public class PrimerArroz {

   
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int op = 0;
        System.out.println("Bienvenido a nuestro sistema");
        System.out.println("Por favor ingrese su codigo");
        int cod = lectura.nextInt();
        while(op!=4){
            System.out.println("1-Retirar");
            System.out.println("2-Deposito");
            System.out.println("3-Cambio de contraseña");
            System.out.println("4-Salir");
            System.out.println("Digite la opción que desea realizar");
            op = lectura.nextInt();
        }
        System.out.println("Gracias por preferir nuestro banco");
    } 
    
}

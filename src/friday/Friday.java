/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package friday;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Friday {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
          Scanner dato = new Scanner (System.in);
         System.out.println("Ingrese el primer valor");
         int n1 = dato.nextInt();
         System.out.println("Ingrese el segundo valor");
         int n2 = dato.nextInt();
         for (int i = n1; i <= n2; i++) {
             if(i%2 !=0){
                System.out.println(i);
            }
        }
      }
    
}   
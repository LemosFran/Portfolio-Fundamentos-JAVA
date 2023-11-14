/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asteriscos;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Asteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado");
        int scan = entrada.nextInt();
        
        if(scan >= 0 && scan <= 50)
        {
            //linea arriba
            for(int i=0; i < scan; i++)
            {
                System.out.print("*");
            }
            
            System.out.println();
            
            //linea del centro
            
            for(int i=0; i < scan; i++)
            {
               System.out.print("*");
                for(int j=0; j < scan - 2; j++)
                {
                    System.out.print(" ");
                    
                }
                System.out.println("*");
            }
            
            //linea de abajo
            
            for(int i=0; i< scan; i++)
            {
                System.out.print("*");
            }
            
        }
    }
    
}

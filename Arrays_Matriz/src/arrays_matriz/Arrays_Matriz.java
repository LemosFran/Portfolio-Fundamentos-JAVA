/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays_matriz;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Arrays_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[][] matrizX10 = new int[10][10];

        for (int i = 0; i < matrizX10.length; i++) {
            for (int j = 0; j < matrizX10.length; j++) {
                matrizX10[i][j] = (int) (Math.random() * 100);
            }
        }

        //escribimos la matriz
        for (int i = 0; i < matrizX10.length; i++) {
            for (int j = 0; j < matrizX10.length; j++) {
                System.out.print(matrizX10[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // la matriz 3x3 con datos del usuario
        int[][] matrizX3 = new int[3][3];
        System.out.println("Ingrese los datos para la matriz");
        Scanner entDatos = new Scanner(System.in);

        for (int i = 0; i < matrizX3.length; i++) {
            for (int j = 0; j < matrizX3.length; j++) {
                matrizX3[i][j] = entDatos.nextInt();
            }
        }

        // imprime la matriz 3*3
        for (int i = 0; i < matrizX3.length; i++) {
            for (int j = 0; j < matrizX3.length; j++) {
                System.out.print(matrizX3[i][j] + " ");
            }
            System.out.println();
        }

       
       
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class servicioAhorcado {
    
     Scanner scan = new Scanner(System.in);

    
  public Ahorcado crearJuego(Ahorcado x) {
        System.out.println("Ingrese la palabra para que alguien mas juegue");
        String palabra = scan.nextLine();

        // primero separar las letras y colocarlas en un array a cada una
        char[] letras = palabra.toCharArray();

        // guardar cada letra en cada espacio del array
        x.setPalabraB(new String[letras.length]);
        for (int i = 0; i < letras.length; i++) {
            x.getPalabraB()[i] = Character.toString(letras[i]);
        }

        System.out.println("Ingrese la cantidad maxima de intentos");
        x.setIntMax(scan.nextInt());
        scan.nextLine(); // consumir el salto de línea

 //metodo para comparar la letra ing
        
        
        int encon = 0;
        int noEncon = 0;
       
        x.setLetEnc(encon);
        x.setLetEnc(x.getPalabraB().length);
        
       while (noEncon < x.getIntMax()) {
    System.out.println("Ingrese una letra");
    String letIng = scan.next();
    boolean encontrada = false; 
    
    
    for (int i = 0; i < x.getPalabraB().length; i++) {
        if (letIng.equals(x.getPalabraB()[i]))
        {
            encon++;
            encontrada = true;
        }
    }
    if (!encontrada)
        
    {
        noEncon++;
        
    }if(encon==x.getPalabraB().length)
    {
        System.out.println("Usted no ha sido ahorcado");
        break;
    }

//FALTA OTRO IF POR SI SE COMPLETA LA PALABRA
    
    System.out.println("las palabras encontradas fueron: " + encon);
    System.out.println("las palabras no encontradas fueron: " + noEncon);
}

       if(noEncon==x.getIntMax()-1)
       {
           System.out.println("ESO ES TODO AMIGOS, HAS SIDO AHORCADO");
       }
        
        return x;
    }
  
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegoahorcado;

import Entidad.Ahorcado;
import Servicio.servicioAhorcado;

/**
 *
 * @author franc
 */
public class JuegoAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioAhorcado sa = new servicioAhorcado();
        Ahorcado aho = new Ahorcado(); // crear objeto Ahorcado con tamaño definido para palabraB
        aho = sa.crearJuego(aho); // asignar valores a los atributos restantes de Ahorcado
        System.out.println("A continuacion el toStrin: "+aho.toString());
    }
    
    }
    


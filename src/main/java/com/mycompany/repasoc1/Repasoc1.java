/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repasoc1;

import java.util.*;


/**
 *
 * @author migue
 */
public class Repasoc1 {

    public static void main(String[] args) {

        //Arreglo de 5 calificaciones
        double[] calificaciones = new double[5];
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        
        //Pedimos al usuario ingresar 5 calificaciones
        for(int i = 0; i<calificaciones.length; i++){
            System.out.println("Ingresa la calificación " + (i+1) + ": ");
            calificaciones[i] = sc.nextDouble(); //Guardarcada calificación
            suma+= calificaciones[i]; //Sumamos para calcular el promedio despues     
        }
        
        //Calcular el promedio
        double promedio = suma / calificaciones.length;
        
        //Mostrar el resultado
        System.out.println("El promedio es: " + promedio);
        
        
    }
    
}

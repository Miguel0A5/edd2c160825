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

       /* //Arreglo de 5 calificaciones
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
        System.out.println("El promedio es: " + promedio */
        
        
        //Creamos un ArrayList ára almacenar nombres
        
        /*ArrayList<String> nombres = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String entrada;

        while (true) {
            System.out.print("Ingrese un nombre (o 'Salir' para terminar): ");
            entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("Salir")) {
                break; // corta el ciclo
            }

            nombres.add(entrada); // agregamos el nombre a la lista
        }

        // mostramos los nombres ingresados
        System.out.println("\nNombres ingresados: ");
        for (String nombre : nombres) {
            System.out.println("El nombre ingresado fue: " + nombre); 
        }*/
        
        //Creamos una LinkedLoist para las tareas
        
            LinkedList<String> tareas = new LinkedList<>();
            Scanner recibir = new Scanner(System.in);
            int opcion;
        do {
            //Menu principal
            System.out.println("\n1.- Agregar tarea \n2.- Eliminar primera tarea \n3.- Mostrar tareas \n4.- Salir");
            System.out.println("Elige una opción: ");
            opcion = recibir.nextInt(); //Leer la opcíon
            recibir.nextLine(); //Limpiar buffer

            switch (opcion) {
                case 1:
                    //Agregar una nueva tarea
                    System.out.println("Escribe la tarea: ");
                    String tarea = recibir.nextLine();
                    tareas.add(tarea);
                    break;

                case 2:
                    //Eliminar la primer tarea si existe
                    if (!tareas.isEmpty()) {
                        System.out.println("Tarea eliminada: " + tareas.removeFirst());
                    } else {
                        System.out.println("No hay tareas para eliminar");
                    }
                    
                    break;

                case 3:
                    //Mostrar todas las tareas
                    System.out.println("Lista de tareas: ");
                    for (String t : tareas) {
                        System.out.println("- " + t);
                    }
                    
                    break;
            }
        } while(opcion !=4);  
   }   
}

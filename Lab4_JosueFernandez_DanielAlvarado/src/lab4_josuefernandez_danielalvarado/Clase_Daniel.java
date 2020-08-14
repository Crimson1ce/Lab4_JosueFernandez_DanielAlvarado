/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Clase_Daniel {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Delito> delitos = new ArrayList();
    static ArrayList<Criminal> criminales = new ArrayList();
    static ArrayList<Agente> agentes = new ArrayList();

    public static void eliminarDelito() {
        System.out.println("-> Eliminar un Delito ");
        System.out.println();

        System.out.println("-> Esta es la lista de delitos");
        for (Delito d : delitos) {
            System.out.println(delitos.indexOf(d) + ". " + d);

        }
        System.out.println();

        boolean flag = false;
        int indice = 0;
        while (flag) {
            try {
                System.out.println("-> Ingrese el indice del delito a eliminar: ");
                indice = sc.nextInt();

                while (indice < 0 || indice > delitos.size() - 1) {
                    System.out.println("-> Ingree un numero valido");
                    indice = sc.nextInt();
                    System.out.println();
                }
                flag = true;
                
            } catch (InputMismatchException e) {
                System.out.println("-> El tipo de dato ingresado no es correcto!");
                System.out.println();
            }
        }

        delitos.remove(indice);

        System.out.println("El delito se eliminado correctamente");
        System.out.println();
        
        System.out.println("-> Esta es la lista de delitos");
        for (Delito d : delitos) {
            System.out.println(delitos.indexOf(d) + ". " + d);

        }
        System.out.println();
    }

    public static void eliminarUnCriminal() {
        System.out.println("-> Eliminar un criminal en la lista");
        System.out.println();
        
        System.out.println("-> Esta es la lista de los criminales");
        for (Criminal c : criminales) {
            System.out.println(criminales.indexOf(c) + ". " + c);
        }
        System.out.println();

        boolean flag = false;
        int indice = 0;
        while (flag) {
            try {
                System.out.println("-> Ingrese el indice del criminal a eliminar: ");
                indice = sc.nextInt();

                while (indice < 0 || indice > criminales.size() - 1) {
                    System.out.println("-> Ingrese un numero valido");
                    indice = sc.nextInt();
                    System.out.println();
                }
                flag = true;
                
            } catch (InputMismatchException e) {
                System.out.println("-> El tipo de dato ingresado no es correcto!");
                System.out.println();
            }
        }
        
        criminales.remove(indice);
        
        System.out.println("El criminal se ha eliminado exitosamente de la lista");
        System.out.println();
        
        System.out.println("-> Esta es la lista de los criminales");
        for (Criminal c : criminales) {
            System.out.println(criminales.indexOf(c) + ". " + c);
        }
        System.out.println();
    }
    
    public static void eliminarUnAgente(){
        System.out.println("-> Eliminar un agente");
        System.out.println();
        
        System.out.println("-> Esta es la lista de los agentes");
        for (Agente a : agentes) {
            System.out.println(agentes.indexOf(a)+". "+a);
        }
        System.out.println();
        
        boolean flag = false;
        int indice = 0;
        while (flag) {
            try {
                System.out.println("-> Ingrese el indice del criminal a eliminar: ");
                indice = sc.nextInt();

                while (indice < 0 || indice > agentes.size() - 1) {
                    System.out.println("-> Ingrese un numero valido");
                    indice = sc.nextInt();
                    System.out.println();
                }
                flag = true;
                
            } catch (InputMismatchException e) {
                System.out.println("-> El tipo de dato ingresado no es correcto!");
                System.out.println();
            }
        }
        
        agentes.remove(indice);
        
        System.out.println("El agente se ha eliminado exitosamente de la lista");
        System.out.println();
        
         System.out.println("-> Esta es la lista de los agentes");
        for (Agente a : agentes) {
            System.out.println(agentes.indexOf(a)+". "+a);
        }
        System.out.println();
        
        
    }
}

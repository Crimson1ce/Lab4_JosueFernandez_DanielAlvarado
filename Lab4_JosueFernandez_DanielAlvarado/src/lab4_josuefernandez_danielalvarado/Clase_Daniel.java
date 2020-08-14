/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import static lab4_josuefernandez_danielalvarado.Main.ANSI_RED;
import static lab4_josuefernandez_danielalvarado.Main.ANSI_RESET;

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

        boolean flag = true;
        int indice = 0;
        while (flag) {
            try {
                System.out.print("-> Ingrese el indice del delito a eliminar: ");
                indice = sc.nextInt();

                while (indice < 0 || indice > delitos.size() - 1) {
                    System.out.print("-> Ingree un numero valido: ");
                    indice = sc.nextInt();
                    System.out.println();
                }
                flag = false;
                
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                flag=true;
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

    public static void eliminarCriminal() {
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
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
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
    
    public static void crearCriminal() throws Excepcion{
        System.out.println("-> Crea un criminal");
        System.out.println();
        
        System.out.println("-> Ingrese el nombre del criminal: ");
        String nombre = sc.next();
        System.out.println();
        
        boolean flag = false;
        int edad = 0;
        
        while(flag){
            try{
                System.out.println("-> Ingrese la edad del criminal: ");
                edad = sc.nextInt();
                
                while(edad < 0 || edad > 130){
                    System.out.println("-> La edad ingresada no es valida!");
                    edad = sc.nextInt();
                }
                flag = true;
            }catch(InputMismatchException e){
                System.out.println("-> El tipo de dato ingresado no es correcto!");
                System.out.println();
            }
        }
        
        System.out.println("-> Ingrese el genero del criminal: ");
        String genero = sc.next();
        System.out.println();
        
        System.out.println("-> Ingrese el pais de residencia: ");
        String residencia = sc.next();
        System.out.println();
        
       
        System.out.println("1) Encarcelado");
        System.out.println("2) En libertad");
        
        boolean flag2 = false;
        int index = 0;
        
        while(flag2){
            try{
                System.out.println("-> Ingrese el estado actual del criminal: ");
                index = sc.nextInt();
                
                while(index < 1 || index > 2){
                    System.out.println("-> Ingrese una opcion correcta!");
                    index = sc.nextInt();
                    System.out.println();
                }
                flag2 = true;
            }catch(InputMismatchException e){
                System.out.println("El tipo de dato ingresado no es correcto!");
                System.out.println();
            }
        }
        
        boolean estaPreso = false;
        switch(index){
            
            case 1:
                estaPreso = true;
                break;
                
            case 2:
                estaPreso = false;
                break;
        }
        
        
        System.out.println("1) Corpulento");
        System.out.println("2) Cuerpo promedio");
        System.out.println("3) Delgado");
        
        boolean flag3 = false;
        int c = 0;
        
        while(flag3){
            try{
                System.out.println("-> Elija la descripcion fisica del criminal: ");
                c = sc.nextInt();
                System.out.println();
                
                while(c < 1 || c > 3){
                    System.out.println("La opcion ingresada es incorrecta!");
                    System.out.println();
                }
                flag3 = true;
            }catch(InputMismatchException e){
                System.out.println("El tipo de dato ingresado es incorrecto!");
                System.out.println();
            }
        }
        
        String descripcion = "";
        switch(c){
            
            case 1:
                descripcion = "Corpulento";
                break;
                
            case 2:
                descripcion = "Cuerpo Promedio";
                break;
                
            case 3:
                descripcion = "Delgado";
                break;
                                
        }
        
        criminales.add(new Criminal(nombre, edad, genero, residencia, estaPreso, descripcion));
        
        System.out.println("Se agrego un nuevo criminal a la lista");
        System.out.println();
    }
    
}

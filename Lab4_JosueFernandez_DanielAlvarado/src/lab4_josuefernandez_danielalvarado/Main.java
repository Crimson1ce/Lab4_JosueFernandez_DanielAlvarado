package lab4_josuefernandez_danielalvarado;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Objeto Scanner
    static Scanner sc = new Scanner(System.in);
    
    //Determina el número de la opción de salida
    final static int salida = 0;
    
    //Lista con los objetos
    ////////////////////////////////////////////////////////////////////////////
    //static ArrayList<Abstracta> lista = new ArrayList();
    ////////////////////////////////////////////////////////////////////////////
    
    //contadro de los objetos del ArrayList por conveniencia
    static int contadorObjetos = 0;
    
    ////////////////////////////////////////////////////////////////////////////
    //Usuario y contraseña
    static String username = "";
    static String password = "";
    static boolean loggedIn = false;
    ////////////////////////////////////////////////////////////////////////////
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 1;
        
        while (opcion!=salida) {
            imprimirMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            
            
            
            switch(opcion){
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
                case salida:
                    break;
            }
            
        }
        
    }
    
    //Método de impresión del menú principal
    public static void imprimirMenu(){
        System.out.println("\n***Menu***\n");
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. Opción 3");
        System.out.println(salida + ". Salir");
        System.out.print("\nIngrese una opción: ");
    }
    
    //Método para agregar ...
    public void agregarObjeto(){
        
        System.out.println("OPCIONES\n");
        System.out.println("1. Opcion 1");
        System.out.println("2. Opcion 2");
        System.out.println("3. Opcion 3");
        System.out.println("4. Opcion 4");
        System.out.print("\nIngrese una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        
        //Validar//
        
        switch(opcion){
            case 1:
                
                break;
            case 2:
                
                //lista.add(new Padre());
                
                break;
            case 3:
                
                //lista.add(new Padre());
                
                break;
            case 4:
                
                //lista.add(new Padre());
                
                break;
            case 5:
                
                //lista.add(new Padre());
                
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    //Método para modificar ...
    public void modificarObjeto(){
        
        listarObjetos();
        System.out.print("\nIngrese el _______ que desea mofidicar: ");
        int nObjeto = sc.nextInt();
        
        //Validar//
        
        System.out.println("ATRIBUTOS\n");
        System.out.println("1. Atributo 1");
        System.out.println("2. Atributo 2");
        System.out.println("3. Atributo 3");
        System.out.println("4. Atributo 4");
        System.out.print("\nIngrese una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        
        //Validar//
        
        switch(opcion){
            case 1:
                
                //lista.get(nObjeto);
                
                break;
            case 2:
                
                //lista.get(nObjeto);
                
                break;
            case 3:
                
                //lista.get(nObjeto);
                
                break;
            case 4:
                
                //lista.get(nObjeto);
                
                break;
            case 5:
                
                //lista.get(nObjeto);
                
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
    
    //Método para eliminar ...
    public void eliminarObjeto(){
        
        listarObjetos();
        System.out.print("\nIngrese el _______ que desea eliminar: ");
        int nObjeto = sc.nextInt();
        
        //Validar//
        
        //lista.remove(nObjeto);
    }
    
    public void listarObjetos(){
        int i=0;
/*
        //ArrayList de objetos
        for (Abstracta familiar : lista) {
                                    //Se utiliza el toString(), hay que personalizarlo
            System.out.println((i++) + familiar.toString());
        }
*/
    }
    
    
    public static void validacionExcepcion(){
        //?
    }
    
    public static void ordenarArreglo(){
    }
    
    public static void logMenu(){
        System.out.println("OPCIONES AVANZADAS\n");
        System.out.println("1. Opcion 1");
        System.out.println("2. Opcion 2");
        System.out.println("3. Opcion 3");
        System.out.println("4. Opcion 4");
        System.out.println("5. Opcion 5");
        System.out.println("6. Opcion 6");
        System.out.println("7. Opcion 7");
        System.out.println("8. Opcion 8");
        System.out.print("\nIngrese una opción: ");
        int opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                
                break;
            case 8:
                
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        
    }
    
}

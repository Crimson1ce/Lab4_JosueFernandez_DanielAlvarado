package lab4_josuefernandez_danielalvarado;

import com.sun.java_cup.internal.runtime.virtual_parse_stack;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    //Colores
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    //Objeto Scanner
    static Scanner sc = new Scanner(System.in);
    
    //Determina el número de la opción de salida
    final static int salida = 13;
    
    //Lista con los objetos
    ////////////////////////////////////////////////////////////////////////////
    static ArrayList<Delito> delitos = new ArrayList();
    //static ArrayList<Criminal> criminales = new ArrayList();
    //static ArrayList<Agente> agentes = new ArrayList();
    ////////////////////////////////////////////////////////////////////////////
    
    //contadro de los objetos del ArrayList por conveniencia
    static int contadorDelitos = 0;
    static int contadorCriminales = 0;
    static int contadorAgentes = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 1;
        
        while (opcion!=salida) {
            
            
            imprimirMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            
            int tipoDelito = 0;
            
            switch(opcion){
                case 1:
                    try {
                        System.out.println("OPCIONES\n");
                        System.out.println("1. Delito menor");
                        System.out.println("2. Delito grave");
                        System.out.print("\nIngrese una opción: ");
                        tipoDelito = sc.nextInt();
                    
                        while(tipoDelito!=1 && tipoDelito!=2){
                            System.out.print("Ingrese una opción válida: ");
                            tipoDelito = sc.nextInt();
                        }
                    } catch (InputMismatchException e) {
                        System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                    }
                    sc.nextLine();
                    
                    if (tipoDelito==1) {
                        //Agregar delito menor
                        crearDelito(1);
                    } else if (tipoDelito==2){
                        //Agregar delito mayor
                        crearDelito(2);
                    }
                    
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
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
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
        System.out.println(" 1. Crear Delito");
        System.out.println(" 2. Modificar Delito");
        System.out.println(" 3. Eliminar Delito");
        System.out.println(" 4. Crear Criminal");
        System.out.println(" 5. Modificar Criminal");
        System.out.println(" 6. Eliminar Criminal");
        System.out.println(" 7. Crear Agente");
        System.out.println(" 8. Modificar Agente");
        System.out.println(" 9. Eliminar Agente");
        System.out.println("10. Asignar delito a criminal");
        System.out.println("11. Contratar agente");
        System.out.println("12. Cometer delito");
        System.out.println(salida + ". Salir");
        System.out.print("\nIngrese una opción: ");
    }
    
    //Método para agregar Delito Menor
    public static void crearDelito(int opcion){
        
        System.out.print("Ingrese la descripción del delito: ");
        String descripcion = sc.nextLine();

        System.out.print("Ingrese el nombre de la víctima: ");
        String nombreVictima = sc.next();
        
        int culpa = 0;
        while(culpa!=1 && culpa!=2){
            try {
                System.out.println("\nCulpabilidad");
                System.out.println("1. Culpable");
                System.out.println("2. Inocente");
                System.out.print("\nIngrese la culpabilidad: ");
                culpa = sc.nextInt();
                
                while(culpa!=1 && culpa!=2){
                    System.out.print("\tIngrese una opción válida: ");
                    culpa = sc.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                culpa=0;
            }
        }
        
        boolean culpable = (culpa==1);
        
        int sen = 0;
        while(sen!=1 && sen!=2){
            try {
                System.out.println("\nSentencia");
                System.out.println("1. Años de cárcel");
                System.out.println("2. Pena de muerte");
                System.out.print("\nIngrese la sentencia: ");
                sen = sc.nextInt();
                
                while(sen!=1 && sen!=2){
                    System.out.print("\tIngrese una opción válida: ");
                    sen = sc.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                sen=0;
            }
        }
        
        String sentencia = "";
        if (sen==1) {
            
            int years = -1;
            while (years<0) {                
                try {
                    System.out.print("\nIngrese la cantidad de años de carcel: ");
                    years = sc.nextInt();
                
                    while(years<0){
                        System.out.print("\tIngrese una cantidad válida: ");
                        years = sc.nextInt();
                    }
                    
                } catch (InputMismatchException e) {
                    System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                    years=-1;
                }
            }
            sentencia = years + " año(s) de cárcel.";
        } else if (sen==2){
            sentencia = "Pena de muerte";
        }
        
        sentencia = (culpable) ? sentencia : "Ninguna";
        
        sc.nextLine();
        
        System.out.print("Ingrese la fecha: ");
        String fecha = sc.nextLine();
        
        System.out.print("Ingrese el país: ");
        String pais = sc.nextLine();
        
        boolean flag = true;
        int nDelito = 0;
        while(flag){
            try {
                
                System.out.print("\nIngrese el número del delito: ");
                nDelito = sc.nextInt();
                
                while(nDelito<1){
                    System.out.print("\tIngrese número válido: ");
                    nDelito = sc.nextInt();
                }
                
                for (int i = 0; i < contadorDelitos; i++) {
                
                    Delito d = delitos.get(i);
                    
                    if (nDelito==d.getNumDelito()) {
                        System.out.println(ANSI_RED + "El número de delito ingresado ya existe." + ANSI_RESET);
                    } else if (nDelito<1){
                        System.out.println("Número no válido.");
                        flag = true;
                        nDelito = 0;
                        break;
                    }
                }
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                flag = true;
            }
        }
        sc.nextLine();
        
        switch(opcion){
            case 1:
                crearMenor(descripcion, nombreVictima, culpable, sentencia, fecha, pais, nDelito);
                break;
            case 2:
                
                break;
        }
    }

    public static void crearMenor(String descripcion, String nombreVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito){
        
        System.out.print("Ingrese el nombre del policía que lo detuvo: ");
        String nombrePolicia = sc.nextLine();
        
        boolean flag = true;
        int id = 0;
        while(flag){
            try {
                    
                System.out.print("Ingrese el ID del policia: ");
                id = sc.nextInt();
                
                while(id<1){
                    System.out.print("\tIngrese ID válido: ");
                    id = sc.nextInt();
                }
                
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                flag = true;
            }
        }
        
        flag = true;
        int celda = 0;
        while(flag){
            try {
                    
                System.out.print("Ingrese el número de celda: ");
                celda = sc.nextInt();
                
                while(celda<1){
                    System.out.print("\tIngrese # de celda válido: ");
                    celda = sc.nextInt();
                }
                
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                flag = true;
            }
        }
        
        int tipo = 0;
        while(tipo<1 || tipo>3){
            try {
                System.out.println("\n1. Vandalismo");
                System.out.println("2. Hurto");
                System.out.println("3. Prostitución");
                System.out.print("Ingrese el tipo de delito: ");
                tipo = sc.nextInt();
                
                while(tipo<1 || tipo>3){
                    System.out.print("\tIngrese una opción válida: ");
                    tipo = sc.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                tipo=0;
            }
        }
        sc.nextLine();
        
        switch(tipo){
            case 1:
                System.out.print("Ingrese la edificación: ");
                String edificacion = sc.nextLine();
                
                System.out.print("Ingrese el nombre del dueño: ");
                String nombreDueño = sc.nextLine();
                
                int nPisos = validarTipo("Ingrese el numero de pisos", 1);
                
                delitos.add(new Vanadalismo(edificacion, nPisos, nombreDueño, nombrePolicia, id, celda, descripcion, nombreVictima, culpable, sentencia, fecha, pais, numDelito));
                contadorDelitos++;
                break;
                
            case 2:
                
                System.out.print("Ingrese el objeto hurtado: ");
                String objetoHurtado = sc.next();
                
                float valor = validarTipo("Ingrese el valor del objeto hurtado: ", 0.0f);
                
                delitos.add(new Hurto(objetoHurtado, valor, nombrePolicia, id, celda, descripcion, nombreVictima, culpable, sentencia, fecha, pais, numDelito));
                contadorDelitos++;
                break;
            case 3:
                
                System.out.print("Ingrese el nombre del solicitante: ");
                String nombreSolicitante = sc.nextLine();
                
                delitos.add(new Prostitucion(nombreSolicitante, nombrePolicia, id, celda, descripcion, nombreVictima, culpable, sentencia, fecha, pais, numDelito));
                contadorDelitos++;
                break;
        }
        
    }
    
    public static void crearGrave(String descripcion, String nombreVictima, boolean culpable, String sentencia, String fecha, String pais, int numDelito){
        
        boolean flag = true;
        int gravedad = 0;
        while(flag){
            try {
                    
                System.out.print("Ingrese la puntuación de gravedad: ");
                gravedad = sc.nextInt();
                
                while(gravedad<1){
                    System.out.print("\tIngrese puntuación válida (1-5): ");
                    gravedad = sc.nextInt();
                }
                
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                flag = true;
            }
        }
        
        int tipo = 0;
        while(tipo<1 || tipo>3){
            try {
                System.out.println("\n1. Terrorismo");
                System.out.println("2. Asesinato");
                System.out.println("3. Violación");
                System.out.println("4. Secuestro");
                System.out.println("5. Tráfico de Drogas");
                System.out.print("Ingrese el tipo de delito: ");
                tipo = sc.nextInt();
                
                while(tipo<1 || tipo>5){
                    System.out.print("\tIngrese una opción válida: ");
                    tipo = sc.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                tipo=0;
            }
        }
        sc.nextLine();
        
        switch(tipo){
            case 1:
                System.out.print("Ingrese el nombre del artefacto: ");
                String artefacto = sc.nextLine();
                
                int nVictimas = validarTipo("Ingrese el numero de víctimas", 0);
                
                delitos.add(new Terrorismo(artefacto, nVictimas, gravedad, descripcion, nombreVictima, culpable, sentencia, fecha, pais, numDelito));
                contadorDelitos++;
                break;
                
            case 2:
                
                System.out.print("Ingrese el nombre del arma: ");
                String arma = sc.next();
                
                int nCuerpos = validarTipo("Ingrese el número de cuerpos: ", 1);
                
                delitos.add(new Asesinato(arma, nCuerpos, gravedad, descripcion, nombreVictima, culpable, sentencia, fecha, pais, numDelito));
                contadorDelitos++;
                break;
            case 3:
                
                int edadVictima = validarTipo("Ingrese la edad de la víctima: ", 0);
                
                delitos.add(new Violacion(edadVictima, gravedad, descripcion, nombreVictima, culpable, sentencia, fecha, pais, numDelito));
                contadorDelitos++;
                break;
                
            case 4:
                
                int tiempoRetenido = validarTipo("Ingrese los días de tiempo retenido: ", 0);
                
                int vivo = 0;
                while(vivo!=1 && vivo!=2){
                    try {
                        System.out.println("1. Vivo");
                        System.out.println("2. Muerto");
                        System.out.print("\n¿Cómo fue devuelta la persona? : ");
                        vivo = sc.nextInt();

                        while(vivo!=1 && vivo!=2){
                            System.out.print("\tIngrese una opción válida: ");
                            vivo = sc.nextInt();
                        }
                    } catch (InputMismatchException e) {
                        System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                        vivo=0;
                    }
                }

                boolean devueltoVivo = (vivo==1);
                
                delitos.add(new Secuestro(tiempoRetenido, devueltoVivo, gravedad, descripcion, nombreVictima, culpable, sentencia, fecha, pais, numDelito));
                contadorDelitos++;
                break;
                
            case 5:
                
                System.out.println("Ingrese el nombre de la droga: ");
                String nombreDroga = sc.next();
                
                int cantidad = validarTipo("Ingrese la cantidad de droga (gramos): ", 1);
                
                delitos.add(new TraficoDrogas(nombreDroga, cantidad, gravedad, descripcion, nombreVictima, culpable, sentencia, fecha, pais, numDelito));
                contadorDelitos++;
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
    
    public static int validarTipo(String mensaje, int minimo){
        int x = minimo-1;
        while (x<minimo) {
            try {
                System.out.print(mensaje);
                x = sc.nextInt();
            } catch (Exception e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                x = minimo - 1;
            }   
        }
        return x;
    }
    
    public static float validarTipo(String mensaje, float minimo){
        float x = minimo-1;
        while (x<minimo) {
            try {
                System.out.print(mensaje);
                x = sc.nextFloat();
            } catch (Exception e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                x = minimo - 1;
            }   
        }
        return x;
    }
    
    public static void validacionExcepcion(){
        //?
    }
    
    public static void ordenarArreglo(){
    }
    
}

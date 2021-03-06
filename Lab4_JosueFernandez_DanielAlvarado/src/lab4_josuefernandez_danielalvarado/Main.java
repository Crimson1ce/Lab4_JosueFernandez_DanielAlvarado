package lab4_josuefernandez_danielalvarado;

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
    final static int salida = 16;
    
    //Lista con los objetos
    ////////////////////////////////////////////////////////////////////////////
    static ArrayList<Delito> delitos = new ArrayList();
    static ArrayList<Criminal> criminales = new ArrayList();
    static ArrayList<Agente> agentes = new ArrayList();
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
            try {
                opcion = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                opcion=0;
            }
            
            
            int tipoDelito = 0;
            
            switch(opcion){
                case 1:
                    
                    try {
                        System.out.println("OPCIONES\n");
                        System.out.println("1. Delito menor");
                        System.out.println("2. Delito grave");
                        System.out.print("\nIngrese una opción: ");
                        tipoDelito = sc.nextInt();
                    
                        while(tipoDelito!=1 || tipoDelito!=2){
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
                    if (delitos.size()==0) {
                        System.out.println("No hay delitos que modificar.");
                    } else{
                        try {
                            modificarDelito();
                        } catch (Exception e) {
                            System.out.println("Surgió un problema.");
                        }
                        
                    }
                    break;
                case 3:
                    if (contadorDelitos==0) {
                        System.out.println("No hay delitos que eliminar.");
                    } else {
                        eliminarDelito();
                        contadorDelitos--;
                    }
                    break;
                case 4:
                    if (contadorDelitos==0) {
                        System.out.println("No hay delitos que listar.");
                    } else {
                        listarDelitos();
                    }
                    break;
                case 5:
                    crearCriminal();
                    break;
                case 6:
                    break;
                case 7:
                    if (contadorCriminales==0) {
                        System.out.println("No hay criminales que eliminar.");
                    } else {
                        eliminarCriminal();
                        contadorCriminales--;
                    }
                    break;
                case 8:
                    if (contadorCriminales==0) {
                        System.out.println("No hay criminales que listar.");
                    } else {
                        listarCriminales();
                    }
                    break;
                case 9:
                    crearAgente();
                    break;
                case 10:
                    break;
                case 11:
                    if (contadorAgentes==0) {
                        System.out.println("No hay agentes que eliminar.");
                    } else {
                        eliminarAgente();
                        contadorAgentes--;
                    }
                    break;
                case 12:
                    if (contadorAgentes==0) {
                        System.out.println("No hay agentes que listar.");
                    } else {
                        listarAgentes();
                    }
                    break;
                case 13:
                    if (delitos.size()==0) {
                        System.out.println("No hay delitos que asignar.");
                    } else if(criminales.size()==0) {
                        System.out.println("No hay criminales a los cuales asignar un crimen.");
                    } else {
                        asignarDelito();
                    }
                    
                    break;
                case 14:
                    if (agentes.size()==0) {
                        System.out.println("No hay agentes ue contratar.");
                    } else {
                        contratarAgente();
                    }
                    
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
        System.out.println(" 4. Listar Delitos");
        System.out.println(" 5. Crear Criminal");
        System.out.println(" 6. Modificar Criminal");
        System.out.println(" 7. Eliminar Criminal");
        System.out.println(" 8. Listar Criminales");
        System.out.println(" 9. Crear Agente");
        System.out.println("10. Modificar Agente");
        System.out.println("11. Eliminar Agente");
        System.out.println("12. Listar Agentes");
        System.out.println("13. Asignar delito a criminal");
        System.out.println("14. Contratar agente");
        System.out.println(salida + ". Salir");
        System.out.print("\nIngrese una opción: ");
    }
    
    public static void crearAgente(){
        System.out.println("-> Crea un agente");
        System.out.println();
        
        System.out.print("-> Ingrese el nombre del agente: ");
        String nombre = sc.next();
        System.out.println();
        
        boolean flag = true;
        int edad = 0;
        
        while(flag){
            try{
                System.out.print("-> Ingrese la edad del agente: ");
                edad = sc.nextInt();
                
                while(edad < 0 || edad > 130){
                    System.out.print("-> La edad ingresada no es valida! Igrese de nuevo: ");
                    edad = sc.nextInt();
                }
                
                flag = false;
            }catch(InputMismatchException e){
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                System.out.println();
                flag = true;
            }
        }
        
        int gen = 0;
        while(gen!=1 && gen!=2){
            try {
                System.out.println("\nGénero");
                System.out.println("1. Masculino");
                System.out.println("2. Femenino");
                System.out.print("\nIngrese el género: ");
                gen = sc.nextInt();
                
                while(gen!=1 && gen!=2){
                    System.out.print("\tIngrese una opción válida: ");
                    gen = sc.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                gen=0;
            }
        }
        sc.nextLine();
        
        String genero = (gen==1) ? "Masculino" : "Femenino";
        
        
        System.out.print("-> Ingrese el pais de residencia: ");
        String residencia = sc.nextLine();
        System.out.println();
        
        boolean estaPreso = false;
        
        System.out.println("1) Corpulento");
        System.out.println("2) Cuerpo promedio");
        System.out.println("3) Delgado");
        
        boolean flag3 = false;
        int c = 0;
        
        while(flag3){
            try{
                System.out.print("-> Elija la descripcion fisica del criminal: ");
                c = sc.nextInt();
                System.out.println();
                
                while(c < 1 || c > 3){
                    System.out.print("La opcion ingresada es incorrecta! Ingrese de nuevo: ");
                    System.out.println();
                }
                flag3 = true;
            }catch(InputMismatchException e){
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
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
        
        
        
        int tipo = 0;
        flag =true;
        while (flag) {            
            try {
                System.out.println("OPCIONES\n");
                System.out.println("1. Terrorista");
                System.out.println("2. Asesino");
                System.out.println("3. Secuestrador");
                System.out.print("\nIngrese una opción: ");
                tipo = sc.nextInt();
            
                while(tipo<1 || tipo>3){
                    System.out.print("Ingrese una opción válida: ");
                    tipo = sc.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
            }
            sc.nextLine();
                    
            if (tipo==1) {
                System.out.print("Ingrese el país donde se hará el ataque: ");
                String paisAtacado = sc.nextLine();
                
                System.out.print("Ingrese la ciudad donde se hará el ataque: ");
                String ciudadAtacada = sc.nextLine();
                
                System.out.print("Ingrese el método de ataque: ");
                String metodo = sc.nextLine();
                
                try {
                    agentes.add(new Terrorista(paisAtacado, ciudadAtacada, metodo, false, nombre, edad, genero, residencia, descripcion));
                    System.out.println("Se agrego un nuevo agente a la lista");
                    System.out.println();
                    contadorCriminales++;
                } catch (Excepcion e) {
                    System.out.println(ANSI_RED + "No se ha podido crear el criminal." + ANSI_RESET);
                }
                
            } else if (tipo==2){
                
                System.out.print("Ingrese el nombre de la víctima: ");
                String nombreVictima = sc.nextLine();
                
                System.out.print("Ingrese el nombre del arma: ");
                String arma = sc.nextLine();
                
                try {
                    agentes.add(new Asesino(nombreVictima, arma, false, nombre, edad, genero, residencia, false, descripcion));
                    System.out.println("Se agrego un nuevo agente a la lista");
                    System.out.println();
                    contadorCriminales++;
                } catch (Excepcion e) {
                    System.out.println(ANSI_RED + "No se ha podido crear el criminal." + ANSI_RESET);
                }
                
            } else {
                System.out.print("Ingrese el nombre de la víctima: ");
                String nombreVictima = sc.nextLine();
                
                float rescate =  validarTipo("Ingrese el valor del rescate: ", 0.0f);
                
                try {
                    agentes.add(new Secuestrador(nombreVictima, rescate, false, nombre, edad, genero, residencia, estaPreso, descripcion));
                    System.out.println("Se agrego un nuevo agente a la lista");
                    System.out.println();
                    contadorCriminales++;
                } catch (Excepcion e) {
                    System.out.println(ANSI_RED + "No se ha podido crear el criminal." + ANSI_RESET);
                }
                
            }
        }
        
        
        
        
        /*
        try {
            criminales.add(new Criminal(nombre, edad, genero, residencia, estaPreso, descripcion));
            System.out.println("Se agrego un nuevo criminal a la lista");
            System.out.println();
            contadorCriminales++;
        } catch (Excepcion e) {
            System.out.println(ANSI_RED + "No se ha podido crear el criminal." + ANSI_RESET);
        }
        */
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
                crearGrave(descripcion, nombreVictima, culpable, sentencia, fecha, pais, nDelito);
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
                
                try {
                    delitos.add(new Vanadalismo(edificacion, nPisos, nombreDueño, nombrePolicia, id, celda, descripcion, nombreVictima, culpable, sentencia, fecha, pais, numDelito));
                    contadorDelitos++;
                    System.out.println("Se agrego un nuevo delito a la lista");
                    System.out.println();
                } catch (Excepcion e) {
                    System.out.println(ANSI_RED + "No se ha podido crear el delito." + ANSI_RESET);
                }
                
                break;
                
            case 2:
                
                System.out.print("Ingrese el objeto hurtado: ");
                String objetoHurtado = sc.next();
                
                float valor = validarTipo("Ingrese el valor del objeto hurtado: ", 0.0f);
                
                try {
                    delitos.add(new Hurto(objetoHurtado, valor, nombrePolicia, id, celda, descripcion, nombreVictima, culpable, sentencia, fecha, pais, numDelito));
                    contadorDelitos++;
                    System.out.println("Se agrego un nuevo delito a la lista");
                    System.out.println();
                } catch (Excepcion e) {
                    System.out.println(ANSI_RED + "No se ha podido crear el delito." + ANSI_RESET);
                }
                
                break;
            case 3:
                
                System.out.print("Ingrese el nombre del solicitante: ");
                String nombreSolicitante = sc.nextLine();
                
                try {
                    delitos.add(new Prostitucion(nombreSolicitante, nombrePolicia, id, celda, descripcion, nombreVictima, culpable, sentencia, fecha, pais, numDelito));
                    contadorDelitos++;
                    System.out.println("Se agrego un nuevo delito a la lista");
                    System.out.println();
                } catch (Excepcion e) {
                    System.out.println(ANSI_RED + "No se ha podido crear el delito." + ANSI_RESET);
                }
                
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
                
                while(gravedad<1 || gravedad>5){
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
                
                int nVictimas = validarTipo("Ingrese el numero de víctimas: ", 0);
                
                try {
                    delitos.add(new Terrorismo(artefacto, nVictimas, gravedad, descripcion, nombreVictima, culpable, sentencia, fecha, pais, numDelito));
                    contadorDelitos++;
                    System.out.println("Se agrego un nuevo delito a la lista");
                    System.out.println();
                } catch (Excepcion e) {
                    System.out.println(ANSI_RED + "No se ha podido crear el delito." + ANSI_RESET);
                }
                
                break;
                
            case 2:
                
                System.out.print("Ingrese el nombre del arma: ");
                String arma = sc.next();
                
                int nCuerpos = validarTipo("Ingrese el número de cuerpos: ", 1);
                
                try {
                    delitos.add(new Asesinato(arma, nCuerpos, gravedad, descripcion, nombreVictima, culpable, sentencia, fecha, pais, numDelito));
                    contadorDelitos++;
                    System.out.println("Se agrego un nuevo delito a la lista");
                    System.out.println();
                } catch (Excepcion e) {
                    System.out.println(ANSI_RED + "No se ha podido crear el delito." + ANSI_RESET);
                }
                
                break;
            case 3:
                
                int edadVictima = validarTipo("Ingrese la edad de la víctima: ", 0);
                
                try {
                    delitos.add(new Violacion(edadVictima, gravedad, descripcion, nombreVictima, culpable, sentencia, fecha, pais, numDelito));
                    contadorDelitos++;
                    System.out.println("Se agrego un nuevo delito a la lista");
                    System.out.println();
                } catch (Excepcion e) {
                    System.out.println(ANSI_RED + "No se ha podido crear el delito." + ANSI_RESET);
                }
                
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
                
                try {
                    delitos.add(new Secuestro(tiempoRetenido, devueltoVivo, gravedad, descripcion, nombreVictima, culpable, sentencia, fecha, pais, numDelito));
                    contadorDelitos++;
                    System.out.println("Se agrego un nuevo delito a la lista");
                    System.out.println();
                } catch (Excepcion e) {
                    System.out.println(ANSI_RED + "No se ha podido crear el delito." + ANSI_RESET);
                }
                break;
                
            case 5:
                
                System.out.println("Ingrese el nombre de la droga: ");
                String nombreDroga = sc.next();
                
                int cantidad = validarTipo("Ingrese la cantidad de droga (gramos): ", 1);
                
                try {
                    delitos.add(new TraficoDrogas(nombreDroga, cantidad, gravedad, descripcion, nombreVictima, culpable, sentencia, fecha, pais, numDelito));
                    contadorDelitos++;
                    System.out.println("Se agrego un nuevo delito a la lista");
                    System.out.println();
                } catch (Excepcion e) {
                    System.out.println(ANSI_RED + "No se ha podido crear el delito." + ANSI_RESET);
                }
                
                break;
        }
        
    }
    
    /*
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
    */
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
    
    public static void eliminarDelito() {
        System.out.println("-> Eliminar un Delito ");
        System.out.println();

        listarDelitos();

        boolean flag = true;
        int indice = 0;
        while (flag) {
            try {
                System.out.print("-> Ingrese el indice del delito a eliminar: ");
                indice = sc.nextInt();

                while (indice < 0 || indice > delitos.size() - 1) {
                    System.out.print("-> Ingrese un numero valido: ");
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
        
        listarDelitos();
    }
    
    public static void eliminarCriminal() {
        System.out.println("-> Eliminar un criminal en la lista");
        System.out.println();
        
        listarCriminales();

        boolean flag = true;
        int indice = 0;
        while (flag) {
            try {
                System.out.print("-> Ingrese el indice del criminal a eliminar: ");
                indice = sc.nextInt();

                while (indice < 0 || indice > criminales.size() - 1) {
                    System.out.print("-> Ingrese un numero valido: ");
                    indice = sc.nextInt();
                    System.out.println();
                }
                flag = false;
                
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                flag = true;
                System.out.println();
            }
        }
        
        criminales.remove(indice);
        
        System.out.println("El criminal se ha eliminado exitosamente de la lista");
        System.out.println();
        
        listarCriminales();
    }
    
    public static void eliminarAgente(){
        System.out.println("-> Eliminar un agente");
        System.out.println();
        
        listarAgentes();
        
        boolean flag = true;
        int indice = 0;
        while (flag) {
            try {
                System.out.print("-> Ingrese el indice del agente a eliminar: ");
                indice = sc.nextInt();

                while (indice < 0 || indice > agentes.size() - 1) {
                    System.out.print("-> Ingrese un numero valido: ");
                    indice = sc.nextInt();
                    System.out.println();
                }
                flag = false;
                
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                System.out.println();
                flag = true;
            }
        }
        
        agentes.remove(indice);
        
        System.out.println("El agente se ha eliminado exitosamente de la lista");
        System.out.println();
        
        listarAgentes();
        
    }
    
    public static void listarDelitos(){
        System.out.println("-> Esta es la lista de delitos: ");
        for (Delito d : delitos) {
            System.out.println("\t" + delitos.indexOf(d) + ". " + d);
        }
        System.out.println();
    }
    
    public static void listarCriminales(){
        
        System.out.println("-> Esta es la lista de los criminales: ");
        for (Criminal c : criminales) {
            System.out.println("\t" + criminales.indexOf(c) + ". " + c);
        }
        System.out.println();
        
    }
    
    public static void listarAgentes(){
        
        System.out.println("-> Esta es la lista de los agentes: ");
        for (Agente a : agentes) {
            System.out.println("\t" + agentes.indexOf(a)+". "+a);
        }
        System.out.println();
        
    }

    public static void contratarAgente(){
        listarAgentes();
        
        boolean flag = true;
        int indice = 0;
        while (flag) {
            try {
                System.out.print("-> Ingrese el indice del agente a contratar: ");
                indice = sc.nextInt();

                while (indice < 0 || indice > agentes.size() - 1) {
                    System.out.print("-> Ingrese un numero valido: ");
                    indice = sc.nextInt();
                    System.out.println();
                }
                flag = false;
                
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                System.out.println();
                flag = true;
            }
        }
        
        //Polimorfismo al delinquir
        agentes.get(indice).CometerDelito();
        
    }
    
    public static void crearCriminal(){
        System.out.println("-> Crea un criminal");
        System.out.println();
        
        System.out.print("-> Ingrese el nombre del criminal: ");
        String nombre = sc.next();
        System.out.println();
        
        boolean flag = true;
        int edad = 0;
        
        while(flag){
            try{
                System.out.print("-> Ingrese la edad del criminal: ");
                edad = sc.nextInt();
                
                while(edad < 0 || edad > 130){
                    System.out.print("-> La edad ingresada no es valida! Igrese de nuevo: ");
                    edad = sc.nextInt();
                }
                
                flag = false;
            }catch(InputMismatchException e){
                System.out.println("-> El tipo de dato ingresado no es correcto!");
                System.out.println();
                flag = true;
            }
        }
        
        int gen = 0;
        while(gen!=1 && gen!=2){
            try {
                System.out.println("\nGénero");
                System.out.println("1. Masculino");
                System.out.println("2. Femenino");
                System.out.print("\nIngrese el género: ");
                gen = sc.nextInt();
                
                while(gen!=1 && gen!=2){
                    System.out.print("\tIngrese una opción válida: ");
                    gen = sc.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                gen=0;
            }
        }
        sc.nextLine();
        
        String genero = (gen==1) ? "Masculino" : "Femenino";
        
        
        System.out.println("-> Ingrese el pais de residencia: ");
        String residencia = sc.nextLine();
        System.out.println();
        
       
        System.out.println("1) Encarcelado");
        System.out.println("2) En libertad");
        
        boolean flag2 = false;
        int index = 0;
        
        while(flag2){
            try{
                System.out.print("-> Ingrese el estado actual del criminal: ");
                index = sc.nextInt();
                
                while(index < 1 || index > 2){
                    System.out.print("-> Ingrese una opcion correcta!");
                    index = sc.nextInt();
                    System.out.println();
                }
                flag2 = true;
            }catch(InputMismatchException e){
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                System.out.println();
            }
        }
        sc.nextLine();
        
        
        
        boolean estaPreso = (index==1);
        
        System.out.println("1) Corpulento");
        System.out.println("2) Cuerpo promedio");
        System.out.println("3) Delgado");
        
        boolean flag3 = false;
        int c = 0;
        
        while(flag3){
            try{
                System.out.print("-> Elija la descripcion fisica del criminal: ");
                c = sc.nextInt();
                System.out.println();
                
                while(c < 1 || c > 3){
                    System.out.print("La opcion ingresada es incorrecta! Ingrese de nuevo: ");
                    System.out.println();
                }
                flag3 = true;
            }catch(InputMismatchException e){
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
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
        
        try {
            criminales.add(new Criminal(nombre, edad, genero, residencia, estaPreso, descripcion));
            System.out.println("Se agrego un nuevo criminal a la lista");
            System.out.println();
            contadorCriminales++;
        } catch (Excepcion e) {
            System.out.println(ANSI_RED + "No se ha podido crear el criminal." + ANSI_RESET);
        }
    }
    
    public static void asignarDelito(){
        
        System.out.println("-> Asignar un Delito ");
        System.out.println();

        listarDelitos();

        boolean flag = true;
        int indice = 0;
        while (flag) {
            try {
                System.out.print("-> Ingrese el indice del delito a asignar: ");
                indice = sc.nextInt();

                while (indice < 0 || indice > delitos.size() - 1) {
                    System.out.print("-> Ingrese un numero valido: ");
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
        
        
        
        listarCriminales();
        
        
        flag = true;
        int index = 0;
        while (flag) {
            try {
                System.out.print("-> Ingrese el indice del criminal que cometió el crimen: ");
                index = sc.nextInt();

                while (index < 0 || index > criminales.size() - 1) {
                    System.out.print("-> Ingrese un numero valido: ");
                    index = sc.nextInt();
                    System.out.println();
                }
                flag = false;
                
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Ha ocurrido un error en el ingreso." + ANSI_RESET);
                flag = true;
                System.out.println();
            }
        }
        
        criminales.get(index).getDelitos().add(delitos.get(indice));
    }
    
    public static void modificarDelito() throws Excepcion {
        System.out.println("Modificar un delito");
        System.out.println();

        System.out.println("-> Esta es la lista de delitos: ");
        for (Delito d : delitos) {
            System.out.println(delitos.indexOf(d) + ". " + d);
        }
        System.out.println();

        boolean flag = false;
        int indice = 0;

        while (flag) {
            try {
                System.out.println("-> Ingrese el indice del delito a modificar: ");
                indice = sc.nextInt();

                while (indice < 0 || indice > delitos.size() - 1) {
                    System.out.println("El indice es incorrecto!");
                    indice = sc.nextInt();
                }
                flag = true;

            } catch (InputMismatchException e) {
                System.out.println("El tipo de dato ingresado no es correcto");
                System.out.println();
            }
        }

        System.out.println("1) Descripcion");
        System.out.println("2) Nombre de la victima");
        System.out.println("3) Es culpable");
        System.out.println("4) Sentencia");
        System.out.println("5) Fecha de delito");
        System.out.println("6) Pais del delito");
        System.out.println("7) Numero del delito");

        boolean flag2 = false;
        int index = 0;

        while (flag2) {
            try {
                System.out.println("-> Que elemento desea modificar");
                index = sc.nextInt();
                System.out.println();

                flag2 = true;
            } catch (InputMismatchException e) {
                System.out.println("El tipo de dato ingresado no es correcto!");
            }
        }

        switch (index) {

            case 1:
                System.out.println("Modificar descripcion");
                System.out.println();

                System.out.println("Ingrese una nueva descripcion del delito: ");
                sc.nextLine();
                String descripcion = sc.nextLine();
                System.out.println();

                delitos.get(indice).setDescripcion(descripcion);

                System.out.println("La descripcion del delito se modifico correctamente");
                System.out.println();
                break;

            case 2:
                System.out.println("Modificar nombre de la victima");
                System.out.println();

                System.out.println("Ingrese el nuevo nombre de la victima: ");
                String nombre = sc.next();
                System.out.println();

                delitos.get(indice).setNombreVictima(nombre);

                System.out.println("El nombre de la victima se actualizo correctamente");
                System.out.println();
                break;

            case 3:
                System.out.println("Es culpable?");
                System.out.println();

                System.out.println("1) Culpable");
                System.out.println("2) Inocente");
                System.out.println();

                boolean flag3 = false;
                int c = 0;
                while (flag3) {
                    try {
                        System.out.println("Ingrese su opcion: ");
                        c = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Los datos ingresados no son correctos");
                    }
                }

                switch (c) {

                    case 1:
                        delitos.get(indice).setEsCulpable(true);
                        break;

                    case 2:
                        delitos.get(indice).setEsCulpable(false);
                        delitos.get(indice).setSentencia("Ninguna");
                        break;
                }

                System.out.println("Se modifico la culpabilidad");
                break;

            case 4:
                System.out.println("Sentencia");
                System.out.println();

                if (delitos.get(indice).getEsCulpable() == false) {
                    System.out.println("El delito no tiene culpables!");
                    System.out.println();
                } else {

                    System.out.println("Years");
                    System.out.println("Pena de muerte");

                    boolean flag4 = false;
                    int b = 0;

                    while (flag4) {
                        try {
                            System.out.println("Ingrese su opcion: ");
                            b = sc.nextInt();
                            flag4 = true;

                        } catch (InputMismatchException e) {
                            System.out.println("El tipo de datos es incorrecto");
                            System.out.println();
                        }
                    }

                    switch (b) {

                        case 1:

                            boolean flag5 = false;
                            int years = 0;
                            while (flag5) {
                                try {
                                    System.out.println("Ingrese el numero de years: ");
                                    years = sc.nextInt();
                                    System.out.println();
                                } catch (InputMismatchException e) {
                                    System.out.println("El tipo de datos no es correcto");
                                    System.out.println();
                                }
                            }

                            delitos.get(indice).setSentencia(years + " year(s) en carcel");
                            break;

                        case 2:
                            delitos.get(indice).setSentencia("Pena de muerte");
                            break;

                        default:
                            System.out.println("Opcion incorrecta!");
                            System.out.println();
                    }

                    System.out.println("Se modifico la sentencia correctamente");
                    System.out.println();
                }
                break;

            case 5:
                System.out.println("Fecha de delito");
                System.out.println();

                System.out.println("Ingrese la nueva fecha de delito: ");
                sc.nextLine();
                String fecha = sc.nextLine();
                System.out.println();

                delitos.get(indice).setFechaDelDelito(fecha);

                System.out.println("Se modifico la fecha exitosamente");
                System.out.println();

                break;

            case 6:
                System.out.println("Pais");
                System.out.println();

                System.out.println("Ingrese el pais donde se cometio el delito: ");
                String pais = sc.next();
                System.out.println();

                delitos.get(indice).setPaisDelDelito(pais);

                System.out.println("Se modifico el pais de delito");
                System.out.println();
                break;

            case 7:
                System.out.println("Numero de delito");
                System.out.println();
                
                boolean flag6 = false;
                int num = 0;
                
                while(flag6){
                    try{
                        System.out.println("Ingrese el nuevo numero de delito");
                        num = sc.nextInt();
                        System.out.println();
                        
                        while(num < 1){
                            System.out.println("El numero ingresado no es correcto");
                            System.out.println();
                        }
                        flag6 = true;
                    }catch(InputMismatchException e){
                        System.out.println("El tipo de dato ingresado no es correcto");
                        System.out.println();
                    }
                }
                
                delitos.get(indice).setNumDelito(num);
                
                System.out.println("Se modifico el numero delito correctamente ");
                System.out.println();
                break;

            default:
                System.out.println("La opcion ingresada no es valida!");
                System.out.println();
        }

    }
    
}

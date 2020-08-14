package lab4_josuefernandez_danielalvarado;

/**
 *
 * @author Josué Fernández
 */
public class Excepcion extends Exception{
    
    private String clase;

    public Excepcion() {
        super();
    }

    public Excepcion(String clase, String mensaje) {
        super(mensaje);
        this.clase = clase;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "Excepción\n" + "Clase: " + clase + "\tMensaje: " + super.getMessage();
    }
    
}
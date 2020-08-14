/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

public abstract class Agente extends Criminal{
    
    //Para estilo
    protected static final String ANSI_YELLOW = "\u001B[33m";
    protected static final String ANSI_BLUE = "\u001B[34m";
    protected static final String ANSI_PURPLE = "\u001B[35m";
    protected static final String ANSI_RESET = "\u001B[0m";
    
    private boolean delitoCometido;
    private double dineroRecibido;

    public Agente() {
        super();
    }

    public Agente(boolean delitoCometido, String nombreCriminal, int edadDelCriminal, String genero, String paisResidencia, String descripcion) throws Excepcion {
        super(nombreCriminal, edadDelCriminal, genero, paisResidencia, descripcion);
        this.delitoCometido = delitoCometido;
    }

    public boolean isDelitoCometido() {
        return delitoCometido;
    }

    public void setDelitoCometido(boolean delitoCometido) {
        this.delitoCometido = delitoCometido;
    }

    public double getDineroRecibido() {
        return dineroRecibido;
    }

    public void setDineroRecibido(double dineroRecibido) {
        if(dineroRecibido > 0){
            this.dineroRecibido = dineroRecibido;
        }
    }
        
    @Override
    public String toString() {
        return "Agente: " + "delitoCometido=" + delitoCometido + '}';
    }

    
    public abstract void CometerDelito();
    
}

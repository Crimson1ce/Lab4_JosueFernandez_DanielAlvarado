/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

public abstract class Agente extends Criminal{
    
    private boolean delitoCometido;
    private double dineroRecibido;

    public Agente() {
        super();
    }

    public Agente(boolean delitoCometido, String nombreCriminal, int edadDelCriminal, String genero, String paisResidencia, String descripcion) {
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

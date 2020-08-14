/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

public class Delito {
    
    private String descripcion;
    private String nombreVictima;
    private boolean esCulpable;
    private String sentencia;
    private String fechaDelDelito;
    private String paisDelDelito;
    private int numDelito;

    public Delito() {
    }

    public Delito(String descripcion, String nombreVictima, boolean esCulpable, String sentencia, String fechaDelDelito, String paisDelDelito, int numDelito) throws Excepcion {
        this.descripcion = descripcion;
        this.nombreVictima = nombreVictima;
        this.esCulpable = esCulpable;
        this.sentencia = sentencia;
        this.fechaDelDelito = fechaDelDelito;
        this.paisDelDelito = paisDelDelito;
        setNumDelito(numDelito);
    }
    
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreVictima() {
        return nombreVictima;
    }

    public void setNombreVictima(String nombreVictima) {
        this.nombreVictima = nombreVictima;
    }

    public boolean getEsCulpable() {
        return esCulpable;
    }

    public void setEsCulpable(boolean esCulpable) {
        this.esCulpable = esCulpable;
    }

    public String getSentencia() {
        return sentencia;
    }

    public void setSentencia(String sentencia) {
        this.sentencia = sentencia;
    }

    public String getFechaDelDelito() {
        return fechaDelDelito;
    }

    public void setFechaDelDelito(String fechaDelDelito) {
        this.fechaDelDelito = fechaDelDelito;
    }

    public String getPaisDelDelito() {
        return paisDelDelito;
    }

    public void setPaisDelDelito(String paisDelDelito) {
        this.paisDelDelito = paisDelDelito;
    }

    public int getNumDelito() {
        return numDelito;
    }

    public void setNumDelito(int numDelito) throws Excepcion {
        if(numDelito > 0){
            this.numDelito = numDelito;
        }else{
            System.out.println("El numero de delitos no es correcto");
            throw new Excepcion();
        }
    }

    @Override
    public String toString() {
        return "Delito{" + "descripcion=" + descripcion + ", nombreVictima=" + nombreVictima + ", esCulpable=" + esCulpable + ", sentencia=" + sentencia + ", fechaDelDelito=" + fechaDelDelito + ", paisDelDelito=" + paisDelDelito + ", numDelito=" + numDelito + '}';
    }
    
    
    
    
    
}

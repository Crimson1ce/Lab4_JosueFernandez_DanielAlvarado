/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;
import java.util.ArrayList;

public class Criminal {
    
    private String nombreCriminal;
    private int edadDelCriminal;
    private String genero;
    private String paisResidencia;
    private boolean estaEncarcelado;
    private String descripcion;
    private ArrayList<Delito> delitos = new ArrayList();

    public Criminal() {
    }

    public Criminal(String nombreCriminal, int edadDelCriminal, String genero, String paisResidencia, boolean estaEncarcelado, String descripcion) throws Excepcion {
        this.nombreCriminal = nombreCriminal;
        setEdadDelCriminal(edadDelCriminal);
        setGenero(genero);
        this.paisResidencia = paisResidencia;
        this.estaEncarcelado = estaEncarcelado;
        this.descripcion = descripcion;
    }

    public Criminal(String nombreCriminal, int edadDelCriminal, String genero, String paisResidencia, String descripcion) throws Excepcion {
        this.nombreCriminal = nombreCriminal;
        setEdadDelCriminal(edadDelCriminal);
        setGenero(genero);
        this.paisResidencia = paisResidencia;
        this.descripcion = descripcion;
    }
    
    

    public String getNombreCriminal() {
        return nombreCriminal;
    }

    public void setNombreCriminal(String nombreCriminal) {
        this.nombreCriminal = nombreCriminal;
    }

    public int getEdadDelCriminal() {
        return edadDelCriminal;
    }

    public void setEdadDelCriminal(int edadDelCriminal) throws Excepcion {
        if(edadDelCriminal > 0 && edadDelCriminal < 130){
            this.edadDelCriminal = edadDelCriminal;
        } else {
            throw new Excepcion("Criminal", "Edad fuera del rango aceptable");
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if(genero.equals("Masculino") || genero.equals("Femenino")){
            this.genero = genero;
        }
    }

    public String getPaisResidencia() {
        return paisResidencia;
    }

    public void setPaisResidencia(String paisResidencia) {
        this.paisResidencia = paisResidencia;
    }

    public boolean getEstaEncarcelado() {
        return estaEncarcelado;
    }

    public void setEstaEncarcelado(boolean estaEncarcelado) {
        this.estaEncarcelado = estaEncarcelado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Delito> getDelitos() {
        return delitos;
    }

    public void setDelitos(ArrayList<Delito> delitos) {
        this.delitos = delitos;
    }

    
    @Override
    public String toString() {
        return "Criminal{" + "nombreCriminal=" + nombreCriminal + ", edadDelCriminal=" + edadDelCriminal + ", genero=" + genero + ", paisResidencia=" + paisResidencia + ", estaEncarcelado=" + estaEncarcelado + ", descripcion=" + descripcion + '}';
    }
    
    
}

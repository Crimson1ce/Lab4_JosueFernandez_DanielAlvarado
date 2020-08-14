/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

public class Prostitucion extends Menor{
    
    private String nombreSolicitante;

    public Prostitucion() {
        super();
    }

    public Prostitucion(String nombreSolicitante, String nombrePolicia, int idPolicia, int numCelda, String descripcion, String nombreVictima, boolean esCulpable, String sentencia, String fechaDelDelito, String paisDelDelito, int numDelito) throws Excepcion {
        super(nombrePolicia, idPolicia, numCelda, descripcion, nombreVictima, esCulpable, sentencia, fechaDelDelito, paisDelDelito, numDelito);
        this.nombreSolicitante = nombreSolicitante;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    @Override
    public String toString() {
        return "Prostitucion{" + "nombreSolicitante=" + nombreSolicitante + '}';
    }
    
    
}

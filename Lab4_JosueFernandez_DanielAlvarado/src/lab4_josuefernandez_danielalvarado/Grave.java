/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

public class Grave extends Delito{
    
    private int puntuacionGravedad;

    public Grave() {
        super();
    }

    public Grave(int puntuacionGravedad, String descripcion, String nombreVictima, boolean esCulpable, String sentencia, String fechaDelDelito, String paisDelDelito, int numDelito) {
        super(descripcion, nombreVictima, esCulpable, sentencia, fechaDelDelito, paisDelDelito, numDelito);
        this.puntuacionGravedad = puntuacionGravedad;
    }

    public int getPuntuacionGravedad() {
        return puntuacionGravedad;
    }

    public void setPuntuacionGravedad(int puntuacionGravedad) {
        if(puntuacionGravedad > 0 && puntuacionGravedad < 6){
            this.puntuacionGravedad = puntuacionGravedad;
        }
    }

    @Override
    public String toString() {
        return "Grave{" + "puntuacionGravedad=" + puntuacionGravedad + '}';
    }
    
    
    
}

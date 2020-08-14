/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

public class Violacion extends Grave{
    
    private int edadVictima;

    public Violacion(int edadVictima) {
        this.edadVictima = edadVictima;
    }

    public Violacion(int edadVictima, int puntuacionGravedad, String descripcion, String nombreVictima, boolean esCulpable, String sentencia, String fechaDelDelito, String paisDelDelito, int numDelito) {
        super(puntuacionGravedad, descripcion, nombreVictima, esCulpable, sentencia, fechaDelDelito, paisDelDelito, numDelito);
        this.edadVictima = edadVictima;
    }

    public int getEdadVictima() {
        return edadVictima;
    }

    public void setEdadVictima(int edadVictima) throws Excepcion {
        if(edadVictima > 0 && edadVictima < 130){
            this.edadVictima = edadVictima;
        }else{
            System.out.println("La edad de la victima es incorrecta");
            throw new Excepcion();
        }
    }

    @Override
    public String toString() {
        return "Violacion{" + "edadVictima=" + edadVictima + '}';
    }
    
    
}

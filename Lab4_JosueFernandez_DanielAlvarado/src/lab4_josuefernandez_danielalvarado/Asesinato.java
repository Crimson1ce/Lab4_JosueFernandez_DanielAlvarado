/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

/**
 *
 * @author dalva
 */
public class Asesinato extends Grave {
    
    private String nombreArma;
    private int numCuerpos;

    public Asesinato() {
        super();
    }

    public Asesinato(String nombreArma, int numCuerpos, int puntuacionGravedad, String descripcion, String nombreVictima, boolean esCulpable, String sentencia, String fechaDelDelito, String paisDelDelito, int numDelito) throws Excepcion {
        super(puntuacionGravedad, descripcion, nombreVictima, esCulpable, sentencia, fechaDelDelito, paisDelDelito, numDelito);
        this.nombreArma = nombreArma;
        setNumCuerpos(numCuerpos);
    }

    public String getNombreArma() {
        return nombreArma;
    }

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    public int getNumCuerpos() {
        return numCuerpos;
    }

    public void setNumCuerpos(int numCuerpos) throws Excepcion {
        if(numCuerpos > 0){
            this.numCuerpos = numCuerpos;
        } else {
            throw new Excepcion("Asesinato", "La cantidad de cuerpos no puede ser negativa.");
        }
    }

    @Override
    public String toString() {
        return "Asesinato{" + "nombreArma=" + nombreArma + ", numCuerpos=" + numCuerpos + '}';
    }
    
    
    
}

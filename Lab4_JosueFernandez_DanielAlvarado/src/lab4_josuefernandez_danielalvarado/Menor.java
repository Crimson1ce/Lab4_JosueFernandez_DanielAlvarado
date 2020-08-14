/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

public class Menor extends Delito{
    
    private String nombrePolicia;
    private int idPolicia;
    private int numCelda;

    public Menor() {
        super();
    }

    public Menor(String nombrePolicia, int idPolicia, int numCelda, String descripcion, String nombreVictima, boolean esCulpable, String sentencia, String fechaDelDelito, String paisDelDelito, int numDelito) throws Excepcion {
        super(descripcion, nombreVictima, esCulpable, sentencia, fechaDelDelito, paisDelDelito, numDelito);
        this.nombrePolicia = nombrePolicia;
        setIdPolicia(idPolicia);
        setNumCelda(numCelda);
    }

    public String getNombrePolicia() {
        return nombrePolicia;
    }

    public void setNombrePolicia(String nombrePolicia) {
        this.nombrePolicia = nombrePolicia;
    }

    public int getIdPolicia() {
        return idPolicia;
    }

    public void setIdPolicia(int IdPolicia) throws Excepcion {
        if(IdPolicia > 0){
            this.idPolicia = IdPolicia;
        }else{
            System.out.println("El ID del policia no es correcto");
            throw new Excepcion();
        }
    }

    public int getNumCelda() {
        return numCelda;
    }

    public void setNumCelda(int numCelda) {
        if(numCelda > 0){
            this.numCelda = numCelda;
        }
    }

    @Override
    public String toString() {
        return "Menor{" + "nombrePolicia=" + nombrePolicia + ", IdPolicia=" + idPolicia + ", numCelda=" + numCelda + '}';
    }
    
    
    
    
}

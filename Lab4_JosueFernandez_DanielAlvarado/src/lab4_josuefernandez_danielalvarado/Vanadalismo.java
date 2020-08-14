/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

public class Vanadalismo extends Menor{
    
    private String edificacion;
    private int numPisos;
    private String nombreOwner;

    public Vanadalismo() {
        super();
    }

    public Vanadalismo(String edificacion, int numPisos, String nombreOwner, String nombrePolicia, int idPolicia, int numCelda, String descripcion, String nombreVictima, boolean esCulpable, String sentencia, String fechaDelDelito, String paisDelDelito, int numDelito) throws Excepcion {
        super(nombrePolicia, idPolicia, numCelda, descripcion, nombreVictima, esCulpable, sentencia, fechaDelDelito, paisDelDelito, numDelito);
        this.edificacion = edificacion;
        setNumPisos(numPisos);
        this.nombreOwner = nombreOwner;
    }

    public String getEdificacion() {
        return edificacion;
    }

    public void setEdificacion(String edificacion) {
        this.edificacion = edificacion;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) throws Excepcion {
        if(numPisos > 0){
            this.numPisos = numPisos;
        }else{
            System.out.println("El numero de pisos es incorrecto");
            throw new Excepcion();
        }
    }

    public String getNombreOwner() {
        return nombreOwner;
    }

    public void setNombreOwner(String nombreOwner) {
        this.nombreOwner = nombreOwner;
    }

    @Override
    public String toString() {
        return "Vanadalismo{" + "edificacion=" + edificacion + ", numPisos=" + numPisos + ", nombreOwner=" + nombreOwner + '}';
    }
    
    
}

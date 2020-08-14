/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

public class TraficoDrogas extends Grave{
    
    private String nombreDroga;
    private double cantidadIncautada;

    public TraficoDrogas() {
        super();
    }

    public TraficoDrogas(String nombreDroga, double cantidadIncautada, int puntuacionGravedad, String descripcion, String nombreVictima, boolean esCulpable, String sentencia, String fechaDelDelito, String paisDelDelito, int numDelito) throws Excepcion {
        super(puntuacionGravedad, descripcion, nombreVictima, esCulpable, sentencia, fechaDelDelito, paisDelDelito, numDelito);
        this.nombreDroga = nombreDroga;
        setCantidadIncautada(cantidadIncautada);
    }

    public String getNombreDroga() {
        return nombreDroga;
    }

    public void setNombreDroga(String nombreDroga) {
        this.nombreDroga = nombreDroga;
    }

    public double getCantidadIncautada() {
        return cantidadIncautada;
    }

    public void setCantidadIncautada(double cantidadIncautada) throws Excepcion {
        if(cantidadIncautada > 0){
            this.cantidadIncautada = cantidadIncautada;
        } else {
            System.out.println("La cantidad incautada no es correcta");
            throw new Excepcion();
        }
    }

    @Override
    public String toString() {
        return "TraficoDrogas{" + "nombreDroga=" + nombreDroga + ", cantidadIncautada=" + cantidadIncautada + '}';
    }
    
    
}

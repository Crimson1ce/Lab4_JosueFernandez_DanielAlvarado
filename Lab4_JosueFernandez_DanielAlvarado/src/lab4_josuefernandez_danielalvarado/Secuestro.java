/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

public class Secuestro extends Grave{
    
    private float tiempoRetenido;
    private boolean devueltoVivo;

    public Secuestro() {
        super();
    }

    public Secuestro(float tiempoRetenido, boolean devueltoVivo, int puntuacionGravedad, String descripcion, String nombreVictima, boolean esCulpable, String sentencia, String fechaDelDelito, String paisDelDelito, int numDelito) throws Excepcion {
        super(puntuacionGravedad, descripcion, nombreVictima, esCulpable, sentencia, fechaDelDelito, paisDelDelito, numDelito);
        setTiempoRetenido(tiempoRetenido);
        this.devueltoVivo = devueltoVivo;
    }

    public float getTiempoRetenido() {
        return tiempoRetenido;
    }

    public void setTiempoRetenido(float tiempoRetenido) throws Excepcion {
        if(tiempoRetenido > 0){
            this.tiempoRetenido = tiempoRetenido;
        }else{
            throw new Excepcion();
        }
    }

    public boolean getDevueltoVivo() {
        return devueltoVivo;
    }

    public void setDevueltoVivo(boolean devueltoVivo) {
        this.devueltoVivo = devueltoVivo;
    }

    @Override
    public String toString() {
        return "Secuestro: \n" + "tiempoRetenido = " + tiempoRetenido + 
                "\n devueltoVivo = " + devueltoVivo;
    }
    
    
    
    
    
    
}

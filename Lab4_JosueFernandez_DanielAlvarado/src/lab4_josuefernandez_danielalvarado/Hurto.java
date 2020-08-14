/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

public class Hurto extends Menor{
    
    private String objetoHurtado;
    private float valorObjeto;

    public Hurto() {
        super();
    }

    public Hurto(String objetoHurtado, float valorObjeto, String nombrePolicia, int idPolicia, int numCelda, String descripcion, String nombreVictima, boolean esCulpable, String sentencia, String fechaDelDelito, String paisDelDelito, int numDelito) {
        super(nombrePolicia, idPolicia, numCelda, descripcion, nombreVictima, esCulpable, sentencia, fechaDelDelito, paisDelDelito, numDelito);
        this.objetoHurtado = objetoHurtado;
        setValorObjeto(valorObjeto);
    }

    public String getObjetoHurtado() {
        return objetoHurtado;
    }

    public void setObjetoHurtado(String objetoHurtado) {
        this.objetoHurtado = objetoHurtado;
    }

    public float getValorObjeto() {
        return valorObjeto;
    }

    public void setValorObjeto(float valorObjeto) {
        if(valorObjeto > 0){
            this.valorObjeto = valorObjeto;
        }
    }

    @Override
    public String toString() {
        return "Hurto{" + "objetoHurtado=" + objetoHurtado + ", valorObjeto=" + valorObjeto + '}';
    }
    
    
    
}

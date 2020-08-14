/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

public class Secuestrador extends Agente {
    
    private String nombreDelSecuestrado;
    private float cantidadDelRescate;

    public Secuestrador() {
        super();
    }

    public Secuestrador(String nombreDelSecuestrado, float cantidadDelRescate, boolean delitoCometido, String nombreCriminal, int edadDelCriminal, String genero, String paisResidencia, boolean estaEncarcelado, String descripcion) throws Excepcion {
        super(delitoCometido, nombreCriminal, edadDelCriminal, genero, paisResidencia, descripcion);
        this.nombreDelSecuestrado = nombreDelSecuestrado;
        setCantidadDelRescate(cantidadDelRescate);
    }

    public String getNombreDelSecuestrado() {
        return nombreDelSecuestrado;
    }

    public void setNombreDelSecuestrado(String nombreDelSecuestrado) {
        this.nombreDelSecuestrado = nombreDelSecuestrado;
    }

    public float getCantidaDelRescate() {
        return cantidadDelRescate;
    }

    public void setCantidadDelRescate(float cantidadDelRescate) {
        if(cantidadDelRescate > 0){
            this.cantidadDelRescate = cantidadDelRescate;
        }
    }

    @Override
    public String toString() {
        return "Secuestrador{" + "nombreDelSecuestrado=" + nombreDelSecuestrado + ", cantidaDelRescate=" + cantidadDelRescate + '}';
    }
    
    @Override
    public void CometerDelito(){
        if(super.getDelitoCometido()){
            System.out.println("El delito ya ha sido cometido");
        }else{
            System.out.println(ANSI_BLUE + super.getNombreCriminal()+" cometio un secuestro a: "
                    +nombreDelSecuestrado+" y pide una cantidad de: "+cantidadDelRescate + ANSI_RESET);
        }
    }
    
}

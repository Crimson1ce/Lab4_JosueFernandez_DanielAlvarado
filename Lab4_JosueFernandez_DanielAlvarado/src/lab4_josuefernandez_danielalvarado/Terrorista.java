/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

public class Terrorista extends Agente{
    
    private String nombrePaisAtaque;
    private String nombreCiudadAtaque;
    private String metodoAtaque;

    public Terrorista() {
        super();
    }

    public Terrorista(String nombrePaisAtaque, String nombreCiudadAtaque, String metodoAtaque, boolean delitoCometido, String nombreCriminal, int edadDelCriminal, String genero, String paisResidencia, String descripcion) throws Excepcion {
        super(delitoCometido, nombreCriminal, edadDelCriminal, genero, paisResidencia, descripcion);
        this.nombrePaisAtaque = nombrePaisAtaque;
        this.nombreCiudadAtaque = nombreCiudadAtaque;
        this.metodoAtaque = metodoAtaque;
    }

    

    public String getNombrePaisAtaque() {
        return nombrePaisAtaque;
    }

    public void setNombrePaisAtaque(String nombrePaisAtaque) {
        this.nombrePaisAtaque = nombrePaisAtaque;
    }

    public String getNombreCiudadAtaque() {
        return nombreCiudadAtaque;
    }

    public void setNombreCiudadAtaque(String nombreCiudadAtaque) {
        this.nombreCiudadAtaque = nombreCiudadAtaque;
    }

    public String getMetodoAtaque() {
        return metodoAtaque;
    }

    public void setMetodoAtaque(String metodoAtaque) {
        this.metodoAtaque = metodoAtaque;
    }

    @Override
    public String toString() {
        return "Terrorista{" + "nombrePaisAtaque=" + nombrePaisAtaque + ", nombreCiudadAtaque=" + nombreCiudadAtaque + ", metodoAtaque=" + metodoAtaque + '}';
    }
    
    @Override
    public void CometerDelito(){
        if(super.getDelitoCometido()){
            System.out.println("El delito ya fue cometido!");
        }else{
            
            System.out.println(ANSI_YELLOW + super.getNombreCriminal()+" hizo un ataque en: "
            +nombreCiudadAtaque+" en el pais: "+nombrePaisAtaque + ANSI_RESET);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

public class Asesino extends Agente {
    
    private String nombreDeVictima;
    private String nombreDelArma;

    public Asesino() {
        super();
    }

    public Asesino(String nombreDeVictima, String nombreDelArma, boolean delitoCometido, String nombreCriminal, int edadDelCriminal, String genero, String paisResidencia, boolean estaEncarcelado, String descripcion) throws Excepcion {
        super(delitoCometido, nombreCriminal, edadDelCriminal, genero, paisResidencia, descripcion);
        this.nombreDeVictima = nombreDeVictima;
        this.nombreDelArma = nombreDelArma;
    }
    
    
    
    public String getNombreDeVictima() {
        return nombreDeVictima;
    }

    public void setNombreDeVictima(String nombreDeVictima) {
        this.nombreDeVictima = nombreDeVictima;
    }

    public String getNombreDelArma() {
        return nombreDelArma;
    }

    public void setNombreDelArma(String nombreDelArma) {
        this.nombreDelArma = nombreDelArma;
    }

    @Override
    public String toString() {
        return "Asesino: \n" + "nombreDeVictima = " + nombreDeVictima + 
                "\n nombreDelArma = " + nombreDelArma;
    }
    
    @Override
    public void CometerDelito(){
        if(super.getDelitoCometido()){
            System.out.println("El delito ya ha sido cometido!");
        }else{
            System.out.println(ANSI_PURPLE + super.getNombreCriminal()+" cometio un asesinato a: "
            +nombreDeVictima+" con el arma: "+nombreDelArma + ANSI_RESET);
            super.setDelitoCometido(true);
        }
    }
    
}

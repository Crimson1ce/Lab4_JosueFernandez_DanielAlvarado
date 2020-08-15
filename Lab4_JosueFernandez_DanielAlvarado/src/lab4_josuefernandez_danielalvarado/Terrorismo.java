/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josuefernandez_danielalvarado;

public class Terrorismo extends Grave{
    
    private String nombreArtefacto;
    private int numVictimas;

    public Terrorismo() {
        super();
    }

    public Terrorismo(String nombreArtefacto, int numVictimas, int puntuacionGravedad, String descripcion, String nombreVictima, boolean esCulpable, String sentencia, String fechaDelDelito, String paisDelDelito, int numDelito) throws Excepcion {
        super(puntuacionGravedad, descripcion, nombreVictima, esCulpable, sentencia, fechaDelDelito, paisDelDelito, numDelito);
        this.nombreArtefacto = nombreArtefacto;
        setNumVictimas(numVictimas); 
    }

    public String getNombreArtefacto() {
        return nombreArtefacto;
    }

    public void setNombreArtefacto(String nombreArtefacto) {
        this.nombreArtefacto = nombreArtefacto;
    }

    public int getNumVictimas() {
        return numVictimas;
    }

    public void setNumVictimas(int numVictimas) throws Excepcion {
        if(numVictimas > 0){
            this.numVictimas = numVictimas;
        }else{
            System.out.println("El numero de victimas no es correcto");
            throw new Excepcion();
        }
    }

    @Override
    public String toString() {
        return "Terrorismo: \n" + "nombreArtefacto = " + nombreArtefacto + 
                "\n numVictimas = " + numVictimas;
    }
    
    
    
}

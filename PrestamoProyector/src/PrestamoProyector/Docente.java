/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrestamoProyector;

/**
 * @author 729-Producciones
 */
public class Docente extends Persona{

    private String proyector;
    private String aula;
    private int clave;
    
    
    public Docente() {
    }

    public Docente(String nombre, String apellido, String cedula, String proyector, String aula, int clave) {
        super(nombre, apellido, cedula);
        this.proyector = proyector;
        this.aula = aula;
        this.clave = clave;
    }
    

    
    
    
    

    public String getProyector() {
        return proyector;
    }

    public void setProyector(String proyector) {
        this.proyector = proyector;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
    
    
    
    
    
}

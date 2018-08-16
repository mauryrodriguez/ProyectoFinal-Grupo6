/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrestamoProyector;

/**
 *
 * @author 729-Producciones
 */
public class Administrativo extends Persona{

    private String passAdmi;

    public Administrativo() {
    }

    public Administrativo(String nombre, String apellido, String cedula, String passAdmi) {
        super(nombre, apellido, cedula);
        this.passAdmi = passAdmi;
    }

    
    
    
    
    public String getPassAdmi() {
        return passAdmi;
    }

    public void setPassAdmi(String passAdmi) {
        this.passAdmi = passAdmi;
    }
    
    
    
}

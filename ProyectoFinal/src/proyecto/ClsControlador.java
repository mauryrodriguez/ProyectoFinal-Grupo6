package proyecto;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ClsControlador {
    public void crearFichero(String nombreFichero){
        ObjectOutputStream oos;
        try{
            oos = new ObjectOutputStream(new FileOutputStream(nombreFichero));
            oos.close();
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    }
    
    public void escribirObjeto(String nombreFichero, ArrayList<Object> elementos){
        //System.out.println("llega");
        try{
            ObjectOutputStream oos;
            oos = new ObjectOutputStream(new FileOutputStream(nombreFichero));
            for(int i = 0; i < elementos.size() ; i++){
                Object elemento = new Object();
                elemento = elementos.get(i);
                oos.writeObject(elemento);
                //System.out.println(elemento.toString());
            }
            oos.close();
            
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println(ex);
        }
    
    }
    
    public ArrayList<Object> extraerObjetos(String nombreFichero){
        ArrayList<Object> elementos = new ArrayList<>();
        
        try{
            ObjectInputStream ois;
            ois = new ObjectInputStream(new FileInputStream(nombreFichero));
            
            Object aux = ois.readObject();
            while(aux!= null){
                elementos.add(aux);
                aux = ois.readObject();
            }
            ois.close();
        
        }catch(FileNotFoundException ex){
            //System.out.println("El fichero no existe, lo voy a crear.");
            crearFichero(nombreFichero);
        }catch (EOFException e1)
        {
            //System.out.println ("Fin de fichero");
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
        return elementos;
    }
}

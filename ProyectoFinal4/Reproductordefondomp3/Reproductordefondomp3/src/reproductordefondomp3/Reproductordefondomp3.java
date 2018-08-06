/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductordefondomp3;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Jheyson Matta
 */
public class Reproductordefondomp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        try {
            FileInputStream fis;
            Player player;
            fis = new FileInputStream("C:\\Users\\Jheyson Matta\\Desktop\\La nueva y la ex Intro[Dj - Daddy Yankee.mp3");
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
            player.play();
                      
            
            // TODO code application logic here
    }
        catch (JavaLayerException e){
            e.printStackTrace();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

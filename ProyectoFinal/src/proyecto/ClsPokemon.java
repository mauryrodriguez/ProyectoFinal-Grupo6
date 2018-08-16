package proyecto;

/**
 *
 * @author Usuario
 */
public class ClsPokemon implements Pokemon{
    private int vida;
    private int estamina;
    private int ataque;
    private int ataquefinal;
    private String img;
    private String nombre;

    public ClsPokemon() {
    }

    public ClsPokemon(int vida, int estamina, int ataque, int ataquefinal, String img, String nombre) {
        this.vida = vida;
        this.estamina = estamina;
        this.ataque = ataque;
        this.ataquefinal = ataquefinal;
        this.img = img;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaquefinal() {
        return ataquefinal;
    }

    public void setAtaquefinal(int ataquefinal) {
        this.ataquefinal = ataquefinal;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int ataque(int vida, int ataque, boolean defensa) {
         int vidaRestante;
        if (defensa == true) {
            ataque = (ataque*75)/100;
        }
        
        //System.out.println(ataque);
          
        vidaRestante = vida-ataque;
        return vidaRestante;
    }

    @Override
    public int ataqueFinal(int vida, int ataqueFinal) {
        int vidaRestante ;
        
        vidaRestante = vida-ataqueFinal;
        
        return vidaRestante;
    }

    @Override
    public int defensa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int curar(int vida) {
        return vida + (vida*20)/100;
    }
    
    
    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase para el Pianista
 * declara sus imágenes y controla cuándo se mueve
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Pianista extends Musico
{
    /**
     * Act - Llama a pianista para que se mueva y los sonidos una vez que pasa eso
     */
    
    public void act()
    {
        if(Greenfoot.isKeyDown("p"))
        {
          super.act();
          Trio t=new Trio();
          t.playSounds();
        }
    }
}

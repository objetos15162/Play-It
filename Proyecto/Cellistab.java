import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase para el cellista b
 * declara sus imágenes y controla cuándo se mueve
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Cellistab extends Musico
{
    /**
     * constructor, crea las imágenes que va a usar 
     */
    public Cellistab()
    {
        im1=new GreenfootImage("cellista1b.png");
        im2=new GreenfootImage("cellista2b.png");
        im3=new GreenfootImage("cellista3b.png");
        im4=new GreenfootImage("cellista4b.png");
       
        setImage(im1);
    }
    /**
     *  llama a act de cellista para que se mueva
     */
    public void musiciansMove()
   {
       super.musiciansMove();
    }
}

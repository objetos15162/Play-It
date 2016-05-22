import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase para el Pianista
 * declara sus imágenes y controla cuándo se mueve
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Pianistaa extends Musico
{
    /**
     * Act - do whatever the pianistaa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pianistaa()
    {
    
        im1=new GreenfootImage("pianista1.png");
        im2=new GreenfootImage("pianista2.png");
        im3=new GreenfootImage("pianista3.png");
        im4=new GreenfootImage("pianista4.png");
       
        setImage(im1);
    }
      
   public void musiciansMove()
   {
       super.musiciansMove();
    }
}

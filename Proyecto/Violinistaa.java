import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase para el violinista a
 * declara sus imágenes y controla cuándo se mueve
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Violinistaa extends Musico
{
    
    /**
     * contstructor para la clase violinistaa
     */
    public Violinistaa()
    {
        im1=new GreenfootImage("violinista1.png");
        im2=new GreenfootImage("violinista2.png");
        im3=new GreenfootImage("violinista3.png");
        im4=new GreenfootImage("violinista4.png");
       
        setImage(im1);
    }
    /**
     * Act - llama a aAct de Violinista para que actúe (en este caso, se mueva)
     */
      
    public void musiciansMove()
    {
        super.musiciansMove();
    }
}

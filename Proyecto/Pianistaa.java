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
     * Constructor: En este se inicializan las imagenes que serviran para hacer la animacion del Pianista
     * 4 instancias de Greenfoot image correspondientes a cada uno de los movimientos y finalmente utilizar 
     * el metodo setImage para colocar la primera de ellas.
     */
    public Pianistaa()
    {
    
        im1=new GreenfootImage("pianista1.png");
        im2=new GreenfootImage("pianista2.png");
        im3=new GreenfootImage("pianista3.png");
        im4=new GreenfootImage("pianista4.png");
       
        setImage(im1);
    }
      /**
     *En este metodo se manda llamar al musiciansMove de su super clase, que es donde surge el intercambio de 
      *  imagenes para la animacion.
     */
   public void musiciansMove()
   {
       super.musiciansMove();
    }
}

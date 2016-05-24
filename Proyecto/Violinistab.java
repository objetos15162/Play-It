import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase para el violinista b
 * declara sus imágenes y controla cuándo se mueve
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Violinistab extends Musico
{
    /**
     * Constructor: En este se inicializan las imagenes que serviran para hacer la animacion del violinista B 
     * 4 instancias de Greenfoot image correspondientes a cada uno de los movimientos y finalmente utilizar 
     * el metodo setImage para colocar la primera de ellas.
     */
    public Violinistab(){
        im1=new GreenfootImage("violinista1b.png");
        im2=new GreenfootImage("violinista2b.png");
        im3=new GreenfootImage("violinista3b.png");
        im4=new GreenfootImage("violinista4b.png");
       
        setImage(im1);
    }
      /*
      *En este metodo se manda llamar al musicians de su super clase, que es donde surge el intercambio de 
      *  imagenes para la animacion.
     */
    public void musiciansMove()
    {
        super.musiciansMove();
    }
    
}

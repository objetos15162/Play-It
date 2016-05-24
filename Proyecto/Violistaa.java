import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase para el violista A
 * declara sus imágenes y controla cuándo se mueve
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Violistaa extends Musico
{
    /**
     * Constructor: En este se inicializan las imagenes que serviran para hacer la animacion del violinista 
     * 4 instancias de Greenfoot image correspondientes a cada uno de los movimientos y finalmente utilizar 
     * el metodo setImage para colocar la primera de ellas.
     */
    public Violistaa()
    {
        im1=new GreenfootImage("violista1a.png");
        im2=new GreenfootImage("violista2a.png");
        im3=new GreenfootImage("violista3a.png");
        im4=new GreenfootImage("violista4a.png");
       
        setImage(im1);
    }
     /*
     * En este metodo se manda llamar al musicians de su super clase, que es donde surge el intercambio de 
     imagenes para la animacion.
     */
    public void musiciansMove()
    {
        super.musiciansMove();
    }
}

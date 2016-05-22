import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Crea el escenario para el dueto
 * 
 * @author (Esaú y Lilia) 
 * @version (21.04.2016)
 */
public class EscDueto extends Ensamble
{
    private Pianistaa pianistaa;
    private Linea linea1;
    private Linea linea2;
    private Piano piano; 
    private Violinistab violinistab;
    private Violin violin5;
    private Dueto t;
    /**
     * Constructor para la clase dueto
     * 
     */
    public EscDueto()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        linea1 = new Linea("duetoviolin.txt",false);
        linea2 = new Linea("duetopiano.txt",false);
        pianistaa = new Pianistaa();
        piano = new Piano();
        violinistab = new Violinistab();
        violin5 = new Violin();
        prepare();
        t= new Dueto();
       
       
    }
    public void act()
    {
        int x = t.getJ();
        int i = t.getcontDP();
        
       if(x<i)
        {
            t.playSounds();
         violinistab.act();
        
         pianistaa.act();
       }
    }
    /**
     * Crea los objetos y botones necesarios 
     */
    private void prepare()
    {
        addObject(linea1,351,129);
        addObject(linea2,351,58);
        addObject(piano,90,58);
        addObject(pianistaa,256,208);
        addObject(violinistab,370,267);   
        addObject(violin5,95,129);
    }
}

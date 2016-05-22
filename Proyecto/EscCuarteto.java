import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Crea el escenario para el cuarteto
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class EscCuarteto extends Ensamble
{
    private Violistaa violistaa;
    private Violinistaa violinistaa;
    private Violinistab violinistab;
    private Cellistab cellistab;
    private Linea linea1;
    private Linea linea2;
    private Linea linea3;
    private Linea linea4;
    private Cello cello2;
    private Viola viola;
    private Violin violin;
    private Violin violin2;
    private Cuarteto c;
    
    /**
     * Constructor for objects of class esc_cuarteto.
     * 
     */
    public EscCuarteto()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        linea1 = new Linea("cuartetoviolina.txt",true,2);
        linea2 = new Linea("cuartetoviolinb.txt",false,1);
        linea3 = new Linea("cuartetocello.txt",false,4);
        linea4 = new Linea("cuartetoviola.txt",false,3);
        violistaa = new Violistaa();
        violinistaa = new Violinistaa();
        violinistab = new Violinistab();
        cellistab = new Cellistab();
        cello2 = new Cello();
        viola = new Viola();
        violin = new Violin();
        violin2 = new Violin();
        c= new Cuarteto();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(violistaa,340,272);
        addObject(violinistaa,247,272);
        addObject(violinistab,157,284);
        addObject(cellistab,447,277);
        
        addObject(linea1,349,77);
        addObject(linea2,349,31);
        addObject(linea3,349,183);
        addObject(linea4,349,124);
        
        addObject(cello2,81,183);
        addObject(viola,87,124);
        addObject(violin,90,77);
        addObject(violin2,92,31);
    }
    public void act()
    {
        //super.act();
        int x = c.getI();
        int i = c.getcontCV();
       if(x<i)
        {
            c.playSounds();
            violinistab.act();
            violinistaa.act();
            cellistab.act();
            violistaa.act();
       }
       if(x>=i)
       {
           Greenfoot.delay(2);
           EndGame e = new EndGame(super.getVidas().size());
           Greenfoot.setWorld(e);
           
        }
    
    }
}

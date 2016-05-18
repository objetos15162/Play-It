import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class instrucciones here.
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Instruccion3 extends Lineas3
{
    /**
     * Act - do whatever the instrucciones wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ 
    private Lectura arch;
    
    
    public Instruccion3(String nomArch)
    {
        arch = new Lectura(nomArch);
       
        
    }
    public void act() 
    {
        // Add your action code here.
        arch.openFile();
    }    
    public void generarInstruc()
    {
        
    }
   
    
}

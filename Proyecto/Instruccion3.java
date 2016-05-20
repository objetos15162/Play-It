import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase para generar las instrucciones para el trio
 * usa la clase Lectura para leer un archivo con el que 
 * se define cada cuando mostrar las instrucciones
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Instruccion3 extends Lineas3
{
   
    private Lectura arch;
    
    /**
     * constructos para la clase Instruccion3
     * @String nomArch nombre del archivo a abrir
     */
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

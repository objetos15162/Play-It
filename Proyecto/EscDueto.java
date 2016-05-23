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
          UserData us = null;
    /**
     * Constructor para la clase dueto
     * 
     */
    public EscDueto()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        linea1 = new Linea("duetoviolin.txt",false,2);
        linea2 = new Linea("duetopiano.txt",false,1);
        pianistaa = new Pianistaa();
        piano = new Piano();
        violinistab = new Violinistab();
        
        violin5 = new Violin();
        prepare();
        t= new Dueto();
        
       
    }
    public void act()
    {
        super.act();
        if (!isConnected()){
            return;
        }
        us = getTrackedUser();
            if(us != null){
               if(us.getJoint(Joint.RIGHT_HAND).getY() < us.getJoint(Joint.HEAD).getY())
            {
                pianistaa.musiciansMove();
            }
              else{
                          if(piano.detectorTouches()){
                          super.removeVida();
                         }
                      }
                       if(us.getJoint(Joint.LEFT_HAND).getY() < us.getJoint(Joint.LEFT).getY())
            {
                    violinistab.musiciansMove();
            }
              else{
                          if(violin5.detectorTouches()){
                          super.removeVida();
                         }
                      }
        }     
        int x = t.getJ();
        int i = t.getcontDP();
       if(x<i)
        { 
         t.playSounds();
         violinistab.act();
         pianistaa.act();
       }
       else{
       if(linea2.readStrings()==0 && linea1.readStrings()==0)
       {
           Greenfoot.delay(5);
           
           t.stopSounds();
           EndGame e = new EndGame(super.getVidas().size());
           Greenfoot.setWorld(e);
           
        }
    }
    }
    /**
     * Crea los objetos y botones necesarios 
     */
    private void prepare()
    {
        addObject(linea1,410,77);
        addObject(linea2,410,31);
        addObject(piano,30,31);
        addObject(pianistaa,256,208);
        addObject(violinistab,370,267);   
        addObject(violin5,40,77);
        
    }
    public UserData getUser(){
       return us;
    }
}

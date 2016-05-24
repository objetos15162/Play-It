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
    private Cuarteto cuart;
    UserData us = null;
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
        cuart = new Cuarteto();
        prepare();
    }

    /**
     * Prepara el mundo
     */
    private void prepare()
    {
        addObject(violistaa,340,272);
        addObject(violinistaa,247,272);
        addObject(violinistab,157,284);
        addObject(cellistab,447,277);
        
        addObject(linea1,410,77);
        addObject(linea2,410,31);
        addObject(linea3,410,183);
        addObject(linea4,410,124);
        
        addObject(cello2,40,183);
        addObject(viola,40,124);
        addObject(violin,40,77);
        addObject(violin2,40,31);
    }
    /**
     * Act - checa si se deben eliminar vidas y controla que el usuario pueda mover los instrumentos
     */
    public void act()
    {
        super.act();
         if (!isConnected()){
            return;
        }
        us = getTrackedUser();
            if(us != null){
               if(us.getJoint(Joint.LEFT_HAND).getY() > us.getJoint(Joint.HEAD).getY())
            {
                violinistab.musiciansMove();
            }
              else{
                          if(violin.detectorTouches()){
                          super.removeVida();
                         }
                      }
                       if(us.getJoint(Joint.RIGHT_HAND).getY() > us.getJoint(Joint.HEAD).getY())
            {
                    cellistab.musiciansMove();
            }
              else{
                          if(cello2.detectorTouches()){
                          super.removeVida();
                         }
                      }
            if(us.getJoint(Joint.RIGHT_HAND).getY() < us.getJoint(Joint.HEAD).getY()){
                     violistaa.musiciansMove();
                }
                 else{
                          if(viola.detectorTouches()){
                          super.removeVida();
                         }
                        }
            if(us.getJoint(Joint.LEFT_HAND).getY() < us.getJoint(Joint.HEAD).getY()){
                    violinistaa.musiciansMove();
                }
                   else{
                      if(violin2.detectorTouches()){
                          super.removeVida();
                         }
                    }
        }     
        int presentV = cuart.getV();
        int endV = cuart.getcontCV();
       if(present<endV)
        {
            cuart.playSounds();
            violinistab.act();
            violinistaa.act();
            cellistab.act();
            violistaa.act();
       }else {
       if(linea2.readStrings()==0 && linea1.readStrings()==0 && linea3.readStrings()==0 && linea4.readStrings()==0)
       {
           Greenfoot.delay(5);
           
           cuart.stopSounds();
           EndGame end = new EndGame(super.getVidas().size());
           Greenfoot.setWorld(end);
           
        }
    }
    
    }
}


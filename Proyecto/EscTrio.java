import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import javax.sound.sampled.*;
/**
 * Clase que maneja la parte del trío
 * 
 * @author Lilia y Esaú 
 * @version (11.04.2016)
 */
public class EscTrio extends Ensamble
{
    private Violin violin;
    private Cello cello;
    private Piano piano3;
    private Linea linea1;
    private Linea linea2;
    private Linea linea3;
    private Cellistab cellistab2;
    private Violinistaa violinistaa;
    private Pianistaa pianistaa2;
    private Trio tri;
     private UserData us = null;
    /**
     * Constructor para los objetos, llama a la función prepare
     * 
     */
    public EscTrio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       violin = new Violin();
       cello = new Cello();
       piano3 = new Piano();
       linea1 = new Linea("triopiano.txt",false,1);
       linea2 = new Linea("trioviolin.txt",false,2);
       linea3 = new Linea("triocello.txt",true,3);
       cellistab2 = new Cellistab();
       violinistaa = new Violinistaa();
       pianistaa2 = new Pianistaa();
       prepare();
       tri= new Trio();
    }
    /**
     * Prepara el mundo
     * Crea el pianista, violinista y cellista y los posiciona
     */
    private void prepare()
    {
        addObject(pianistaa2,356,212);
        addObject(violinistaa,181,277);
        addObject(cellistab2,407,273);

        addObject(linea1,410,77);
        addObject(linea2,410,31);
        addObject(linea3,410,130);
        
        addObject(piano3,40,77);
        addObject(cello,40,130);
        addObject(violin,40,31);
    }
    /**
     * Act - contorla el kinect junto con el movimiento de los múscicos y checa la 
     * reproducción de los sonidos
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
                cellistab2.musiciansMove();
            }
              else{
                          if(cello.detectorTouches()){
                          super.removeVida();
                         }
                      }
                       if(us.getJoint(Joint.RIGHT_HAND).getY() > us.getJoint(Joint.HEAD).getY())
            {
                    violinistaa.musiciansMove();
            }
              else{
                          if(violin.detectorTouches()){
                          super.removeVida();
                         }
                      }
             if((us.getJoint(Joint.RIGHT_HAND).getY() < us.getJoint(Joint.HEAD).getY()) || (us.getJoint(Joint.LEFT_HAND).getY() < us.getJoint(Joint.HEAD).getY())){
                     pianistaa2.musiciansMove();
                }
                 else{
                          if(piano3.detectorTouches()){
                          super.removeVida();
                         }
                        }
        }     
        int presentV = tri.getcV();
        int endV = tri.getcontTV();
       if(presentV<endV)
        {
            tri.playSounds();
        }
       else{
       if(linea3.readStrings()==0 && linea2.readStrings()==0 && linea1.readStrings()==0)
       {
         {
           Greenfoot.delay(5);
           tri.stopSounds();
           EndGame end = new EndGame(super.getVidas().size());
           Greenfoot.setWorld(end);
       }
    }
   }
}
}

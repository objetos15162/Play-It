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
          UserData us;
          boolean anyLeftHandUp = false;
          boolean anyrightHandUp = false;
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
              System.out.println("55555555555555555");
         while(us == null)  {
             us = getTrackedUser();
            }
            if(us != null){
                 System.out.println("999999999999999999999999");
               if(anyLeftHandUp = anyLeftHandUp || (us.getJoint(Joint.LEFT_HAND).getY() < us.getJoint(Joint.HEAD).getY()))
            {
                pianistaa.musiciansMove();
                System.out.println("11111111111111");
               if(!piano.detectorTouches()){
                   super.removeVida();
                   System.out.println("222222222222222222");
                }
            }
              else{
                          if(piano.detectorTouches()){
                          super.removeVida();
                            System.out.println("33333333333333333");
                         }
                      }
        }
        else{ 
             us = getTrackedUser();
             System.out.println(us);
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
    public void traking(){
         boolean anyLeftHandUp = false;
          boolean anyrightHandUp = false;
    if(anyLeftHandUp = anyLeftHandUp || (us.getJoint(Joint.LEFT_HAND).getY() < us.getJoint(Joint.HEAD).getY()))
            {
                System.out.println("11111111111111");
               if(!piano.detectorTouches()){
                   super.removeVida();
                   System.out.println("222222222222222222");
                }
            }
    else{
        if(piano.detectorTouches()){
           super.removeVida();
           System.out.println("33333333333333333");
        }
          else{
              pianistaa.musiciansMove();
              System.out.println("444444444444444444");
     }
    }
    }
}

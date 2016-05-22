import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;
import java.util.*;
import java.io.*;
/**
 * Write a description of class Linea here.
 * 
 * @author (EsauBz) 
 * @version (Mayo 2016)
 */
public class Linea  extends Actor
{
    int cont;
    boolean toca;
    private Scanner entrada; // Esta variable se encarga de leer linea por linea 
    private boolean archivoOk; // Verificar si el archivo existe
    private File archivo1;// Archivo que se intentara abrir
    private int linea;
    private SimpleTimer clock;
    private boolean c;
    /**
     * Constructor for objects of class Linea
     */
    public Linea(String archivo, boolean genera, int lin)
    {
        archivo1 = new File(archivo);
        cont = 0;
        toca = genera;
        linea = lin;
        clock = new SimpleTimer();
        c = true;
        this.openFile();
    }
    public void act(){
        if(cont == 0){
        cont = this.readStrings();
        System.out.println(cont);
      }
     else{
        if(c){
         clock.mark();
         c = false;
         }
         else{
          if(clock.millisElapsed() >= 999){
           if( toca != false){
               this.addInstruction();
               cont--;
               System.out.println(clock.millisElapsed());
              if(cont == 0){
                toca = false;
             }
            }
           else{
              cont--;
              System.out.println(clock.millisElapsed());
             if(cont == 0){
              toca = true;
             }
           }
             c = true;
         }
        }
    }
}
    private void openFile(){
      try{
          entrada = new Scanner(archivo1);
          archivoOk = true;
        }
        catch(Exception e){
          System.out.println(e.getMessage());
        }
    }
   public int readStrings(){
       Integer x = 0;
      if(archivoOk){
         if(entrada.hasNext()){
             String cadena = entrada.next();
             return  x = Integer.parseInt(cadena);
            }
        }else if(!entrada.hasNext()){
            x=0;
        }
        return x;
    }
    private void addInstruction(){
      Instruccion2 i = new Instruccion2();
      World mundo = getWorld();
      Ensamble miMundo = (Ensamble)mundo;
      switch(linea){
        case 1:
        miMundo.addObject(i,599,31);
        break;
        case 2:
        miMundo.addObject(i,599,77);
        break;
        case 3:
        miMundo.addObject(i,599,124);
        break;
        case 4:
        miMundo.addObject(i,599,183);
        break;
      }
    }
}

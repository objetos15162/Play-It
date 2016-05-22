import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
/**
 * La funcion principal de la clase es recibir un string 
 * en su contructor que sera el nombre de algun archivo para asi poder abrirlo y leerlo linea por linea
 * 
 * @author (EsauBz) 
 * @version (1.0)
 */
public class Lectura extends GameControl
{   
    private Scanner entrada; // Esta variable se encarga de leer linea por linea 
    private boolean archivoOk; // Verificar si el archivo existe
    private File archivo1;// Archivo que se intentara abrir 
    private Integer temp;
    /**
     * @param String that represents the File that later will try to open.
     */
    public Lectura(String archivo)
    {
        entrada = null;
        archivoOk = false;
        archivo1 = new File(archivo);
        
    }
    /**
     * @return The file that "archivo" has saved
     */
    public File getArchivo(){
        return archivo1;
    }
    /**
     * Try to open a File, if the File exist archivoOk turns True, if not the class throws a exception. 
     */
    public void openFile(){
      try{
          entrada = new Scanner(archivo1);
          archivoOk = true;
        }
        catch(Exception e){
          System.out.println(e.getMessage());
        }
    }
    /**
     * Read all the lines of the File and ... 
     */
    public int readStrings(){
      if(archivoOk){
         if(entrada.hasNext()){
             String cadena = entrada.next();
             
             Integer x = Integer.parseInt(cadena);
             temp=x;
             // TODO here you can make whatever you want with the variable cadena that has saved the number in string
             //Remember to use Integer if you want a int 
            }
        }
        return temp;
    }
    /**
     * A little main to make sure everythings fine 
     */
    /*public static void main(String [] args){
         Lectura app = new Lectura("Numeros.txt");
         app.openFile(app.getArchivo());
         app.readStrings();
    }*/
}

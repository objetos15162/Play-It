import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.io.*;
/**
 * Esta clase crea un archivo de texto si es que no existe con records del juego.
     si existen ya los lee, tambien los sobreescribira.
 * 
 * 
 * @author (EsauBz) 
 * @version (Mayo 2016)
 */
//file      Variable que contiene el archivo que se va a leer o escribir.
//escritor  Variable que escribe en el archivo.
//bufer
//salida    
//records   Variable que guarda la informacion tomada del archivo.
public class Records extends Actor
{
    private File file;
    private FileWriter escritor;
    private BufferedWriter bufer;
    private PrintWriter salida;
    private LinkedList<Usuario>  records;
   /**
     * Constructor for objects of class Records
     */
    public Records()
    {
        records = new LinkedList<Usuario>();
        file = new File ("Records.txt");
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch(IOException ex){}
        }
        else {
            this.leeRecords();
        }
    }
   /**
   * Metodo que escribe en el archivo los records*
   */
    public void escribeRecords(){
        PrintWriter escritor;
        String num;
        BufferedWriter bw;
        PrintWriter s;
        try{
            escritor = new PrintWriter(file);
            bw = new BufferedWriter(escritor);
            s = new PrintWriter(bw);
            for(Usuario i : records)
            {
                s.println(i.getName());
                s.println(i.getPoints()+"");
            }
            s.close();
            bw.close();
        }catch(IOException e){}

    }
   /**
   * Metodo que lee el archivo y lo pasa a una variable que lo almacena.
   */
    private void leeRecords(){
        Usuario usuario;
        String nombre = "";
        int puntos = 0;
        String texto = "";
        FileReader lector = null;
        String linea = "";
        try {
            lector = new FileReader(file);
            BufferedReader bl = new BufferedReader(lector);
            while ((linea = bl.readLine()) != null) {
                usuario = new Usuario();
                texto = linea;
                usuario.setName(texto);
                //System.out.println(texto);
                if((linea = bl.readLine()) != null){
                    texto = linea;
                    puntos = Integer.parseInt(texto);
                    usuario.setPoints(puntos);
                    //System.out.println(puntos);
                }
                records.add(usuario);
            }   

        } catch (IOException e) {

        } finally {
            if (lector != null) {
                try {
                    lector.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
   /**
     * Metodo que agrega un usuario a la variable records. */
    public void addUsuario(Usuario us){        
        records.add(us);
        this.acomodaRecords();
        if(records.size()>4){
            records.remove(0);      
        }
        this.escribeRecords();
    }
   /**
   * Metodo que retorna la variable de records 
   */
    public LinkedList<Usuario> escribeTabla(){
        return records;
    }
   private void acomodaRecords(){
        Usuario aux;
        int n = records.size();
        for(int c=0;c<n-1;c++){
            for(int c2=0;c2<n-1;c2++){
                if((records.get(c2).getPoints()) > (records.get(c2+1).getPoints())){
                    aux = records.get(c2);
                    records.add(c2,records.get(c2+1));
                    records.remove(c2+2);                    
                    // records.add(c2+1,aux);
                    System.out.println("1");
                }
            }
        }

    }
}

import java.io.*;
import java.util.*; // Scanner
public class ProcesadorDeTextos {
    private Scanner lector;    
    
    public ProcesadorDeTextos(File archivo) {
        try {
           lector = new Scanner( archivo );
        }
        catch(FileNotFoundException e){
           System.err.println("No encuentra archivo llamado "+ archivo.getAbsolutePath()+archivo.getName());        
        }
    }
    
    
    
    public Termino nextTermino(){
        String linea = null;
        String token[] = new String [4];
        Termino termino = null;
        Scanner tokenScanner = null;
        while( lector.hasNext() && termino==null){ 
           linea = lector.nextLine();
           tokenScanner = new Scanner(linea);
           int i= 0;
           while(tokenScanner.hasNext() && i<4){
              token[i++] = tokenScanner.next();
           }
           if(i==4 && token[2].startsWith("N")||token[2].startsWith("VM")){
              termino = new Termino( token[0],token[2],token[3]);
           }
        } 
        return termino;
    }
    public boolean hasNext(){
        return lector.hasNext();    
    }
}

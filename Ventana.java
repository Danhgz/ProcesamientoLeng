import javax.swing.JFrame; 
import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.BorderLayout;
public class Ventana extends JFrame{
    
    private Pizarra pizarra;
    
    public Ventana(){
        super("PROCESADOR DE TEXTO");
       
        setSize(560,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        
        pizarra = new Pizarra();
        
        Container c = getContentPane();
        c.add(BorderLayout.CENTER, pizarra );
        
        setVisible(true);
    }

}
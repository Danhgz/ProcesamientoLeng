import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Pizarra extends JPanel{
    public static final String NOMBRES[] = {"SELECCIONAR","CARGAR"};
    public JTextField[] palabra;
    public JTextField txtArchivo;
    
    public File archivo;
    
    public JButton seleccionador[];
    
    public JCheckBox esSusPropio[];
    public JButton buscador;
    
    public ProcesadorDeTextos procesador;
    public void initComponents(){
        
        txtArchivo = new JTextField(15);
        add(txtArchivo);
        
        seleccionador = new JButton[NOMBRES.length];
        for(int i = 0; i<seleccionador.length; i++){
            seleccionador[i] = new JButton(NOMBRES[i]);
            add(seleccionador[i]);
        }
        
        seleccionador[0].addActionListener(new ActionListener() {
        
            public void actionPerformed(ActionEvent e) {
               //File Chooser
                JFileChooser seleccionador = new JFileChooser();
                seleccionador.setVisible(true);
                int returnVal = seleccionador.showDialog(Pizarra.this,"Select");
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    archivo = seleccionador.getSelectedFile();
                   
                }    
                
            }
        });
        
        seleccionador[1].addActionListener(new ActionListener() {
        
            public void actionPerformed(ActionEvent e) {
                procesador = new ProcesadorDeTextos(archivo);
                
            }
        });
        
        
        palabra = new JTextField[3];
        for(int i = 0; i<palabra.length; i++){
            palabra[i] = new JTextField(15);
            add(palabra[i]);
        }
        
        esSusPropio = new JCheckBox[2];
        for(int i = 0; i<esSusPropio.length; i++){
            esSusPropio[i] = new JCheckBox("Sus. Propio");
        }
        
        add(esSusPropio[0]);
        
        buscador = new JButton("BUSCAR");
        add(buscador);
        
        add(esSusPropio[1]);
    }
    
    public Pizarra(){
        initComponents();
        
    }
    
}

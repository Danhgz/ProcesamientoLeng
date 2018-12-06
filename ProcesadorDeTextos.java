public class ProcesadorDeTextos extends javax.swing.JPanel {

    private javax.swing.JCheckBox NP1;
    private javax.swing.JCheckBox NP2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField sustantivo1;
    private javax.swing.JTextField sustantivo2;
    private javax.swing.JTextField verbo;
    
    public ProcesadorDeTextos() {
        initComponents();
    }
    
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        sustantivo1 = new javax.swing.JTextField();
        verbo = new javax.swing.JTextField();
        sustantivo2 = new javax.swing.JTextField();
        NP1 = new javax.swing.JCheckBox();
        NP2 = new javax.swing.JCheckBox();

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 14)); 
        lblTitulo.setText("PROCESADOR DE TEXTOS");

        NP1.setText("NP");

        NP2.setText("NP");

        
    }
}
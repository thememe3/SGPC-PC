package vista;
import com.sun.awt.AWTUtilities;
import javax.swing.ImageIcon;
public class Slpash extends javax.swing.JFrame {

    public ImageIcon[] imagenes = new ImageIcon[4];
    
    public Slpash() {
        initComponents();
        imagenes[0] = new ImageIcon("src/img/Splash1_1.png");
        imagenes[1] = new ImageIcon("src/img/Splash2_1.png");
        imagenes[2] = new ImageIcon("src/img/Splash3_1.png");
        imagenes[3] = new ImageIcon("src/img/Splash4_1.png");        
        jlbCarga.setIcon(imagenes[0]);
        setSize(350,95);
        jlbCarga.setSize(getWidth(),getHeight());
        AWTUtilities.setWindowOpaque(this, false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlbCarga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 130));
        setUndecorated(true);

        jlbCarga.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferna\\Documents\\NetBeansProjects\\gestor\\src\\img\\Splash1.png")); // NOI18N
        jlbCarga.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 515, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel jlbCarga;
    // End of variables declaration//GEN-END:variables
}

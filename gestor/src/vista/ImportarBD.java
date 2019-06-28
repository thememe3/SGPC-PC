package vista;
import javax.swing.JFrame;
import javax.swing.plaf.metal.MetalBorders;
public class ImportarBD extends javax.swing.JInternalFrame {

    public ImportarBD() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1Import = new javax.swing.JPanel();
        jbnCargar = new javax.swing.JButton();
        jbnExaminar = new javax.swing.JButton();
        jlbArchivo = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), new javax.swing.border.LineBorder(new java.awt.Color(130, 172, 229), 2, true)));

        jPanel1Import.setBackground(new java.awt.Color(255, 255, 255));

        jbnCargar.setBackground(new java.awt.Color(130, 172, 229));
        jbnCargar.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jbnCargar.setText("Cargar");

        jbnExaminar.setBackground(new java.awt.Color(0, 173, 137));
        jbnExaminar.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jbnExaminar.setText("Examinar");

        jlbArchivo.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jlbArchivo.setText("Archivo");
        jlbArchivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(130, 172, 229), null, null, java.awt.Color.gray));

        javax.swing.GroupLayout jPanel1ImportLayout = new javax.swing.GroupLayout(jPanel1Import);
        jPanel1Import.setLayout(jPanel1ImportLayout);
        jPanel1ImportLayout.setHorizontalGroup(
            jPanel1ImportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1ImportLayout.createSequentialGroup()
                .addGroup(jPanel1ImportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1ImportLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1ImportLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jbnExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jbnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addGap(58, 58, 58))
        );
        jPanel1ImportLayout.setVerticalGroup(
            jPanel1ImportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1ImportLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlbArchivo)
                .addGap(30, 30, 30)
                .addGroup(jPanel1ImportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnExaminar)
                    .addComponent(jbnCargar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1Import, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1Import, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel jPanel1Import;
    private javax.swing.JButton jbnCargar;
    private javax.swing.JButton jbnExaminar;
    private javax.swing.JLabel jlbArchivo;
    // End of variables declaration//GEN-END:variables
}

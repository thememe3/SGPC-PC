package vista;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sun.security.util.Password;
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null); 
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1Login = new javax.swing.JPanel();
        fondoLogin = new javax.swing.JPanel();
        jtfUsuario = new javax.swing.JTextField();
        jlbUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbnAcceder = new javax.swing.JButton();
        jbnAceptar = new javax.swing.JButton();
        logoUtj = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jtfContraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1Login.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoLogin.setBackground(new java.awt.Color(255, 255, 255));
        fondoLogin.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray), javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), null))));

        jtfUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jlbUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbUsuario.setText("Usuario");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Contraseña");

        jbnAcceder.setBackground(new java.awt.Color(0, 173, 137));
        jbnAcceder.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jbnAcceder.setText("Acceder");
        jbnAcceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbnAccederMouseClicked(evt);
            }
        });

        jbnAceptar.setBackground(new java.awt.Color(130, 172, 229));
        jbnAceptar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jbnAceptar.setText("Cancelar");
        jbnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbnAceptarMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ferna\\Documents\\NetBeansProjects\\gestor\\img\\utjLogo.png")); // NOI18N
        jLabel3.setText(" ");

        javax.swing.GroupLayout fondoLoginLayout = new javax.swing.GroupLayout(fondoLogin);
        fondoLogin.setLayout(fondoLoginLayout);
        fondoLoginLayout.setHorizontalGroup(
            fondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLoginLayout.createSequentialGroup()
                .addGroup(fondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLoginLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(logoUtj)
                        .addGap(46, 46, 46)
                        .addGroup(fondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLoginLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(fondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jlbUsuario)
                                    .addGroup(fondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtfContraseña, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(fondoLoginLayout.createSequentialGroup()
                                .addComponent(jbnAcceder)
                                .addGap(72, 72, 72)
                                .addComponent(jbnAceptar))))
                    .addGroup(fondoLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)
                        .addGap(559, 559, 559)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoLoginLayout.setVerticalGroup(
            fondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLoginLayout.createSequentialGroup()
                .addGroup(fondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLoginLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoUtj, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fondoLoginLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jlbUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(fondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fondoLoginLayout.createSequentialGroup()
                                        .addComponent(jtfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbnAceptar)
                                        .addComponent(jbnAcceder)))))))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel1Login.add(fondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 423, -1));

        getContentPane().add(jPanel1Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnAccederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnAccederMouseClicked
//        String Usuario ="admin";
//        String Contraseña ="123";
//        String Pass = new String(jtfContraseña.getPassword());
//        
//        if (jtfUsuario.getText().equals(Usuario) && Pass.equals(Contraseña)) {
//            MenuGeneral MG = new MenuGeneral();
//            MG.setVisible(true);
//            dispose();
//        }else{
//            JOptionPane.showMessageDialog(this, "El usuario o la contraseña son incorrectos");
//        }
    }//GEN-LAST:event_jbnAccederMouseClicked

    private void jbnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnAceptarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jbnAceptarMouseClicked
    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel fondoLogin;
    private javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1Login;
    public javax.swing.JButton jbnAcceder;
    public javax.swing.JButton jbnAceptar;
    public javax.swing.JLabel jlbUsuario;
    public javax.swing.JPasswordField jtfContraseña;
    public javax.swing.JTextField jtfUsuario;
    private javax.swing.JLabel logoUtj;
    // End of variables declaration//GEN-END:variables
}

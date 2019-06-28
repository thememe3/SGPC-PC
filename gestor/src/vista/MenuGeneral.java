package vista;

import javax.swing.JPanel;

public class MenuGeneral extends javax.swing.JFrame {
    public MenuGeneral() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel2Alumno = new javax.swing.JPanel();
        jbnAlumno = new javax.swing.JLabel();
        jPanel1Alumno = new javax.swing.JPanel();
        jspAlumno = new javax.swing.JSeparator();
        jPanel2Profesor = new javax.swing.JPanel();
        jbnProfesor = new javax.swing.JLabel();
        jPanel1Profesor = new javax.swing.JPanel();
        jspProfesor = new javax.swing.JSeparator();
        jPanel1Fecha = new javax.swing.JPanel();
        jspFecha1 = new javax.swing.JSeparator();
        jPanel2Fechas = new javax.swing.JPanel();
        jbnFechas = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 179, 141));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rsz_utjlogo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 272, 77));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 179, 141));
        jLabel2.setText(" Sistema Gestor de Proyectos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 280, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1, 754));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 294, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 294, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 290, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 294, -1));

        jPanel2Alumno.setBackground(new java.awt.Color(255, 255, 255));

        jbnAlumno.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jbnAlumno.setText("Alumno");

        javax.swing.GroupLayout jPanel2AlumnoLayout = new javax.swing.GroupLayout(jPanel2Alumno);
        jPanel2Alumno.setLayout(jPanel2AlumnoLayout);
        jPanel2AlumnoLayout.setHorizontalGroup(
            jPanel2AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2AlumnoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jbnAlumno)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel2AlumnoLayout.setVerticalGroup(
            jPanel2AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2AlumnoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jbnAlumno)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 240, 70));

        jspAlumno.setForeground(new java.awt.Color(0, 0, 0));
        jspAlumno.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jspAlumno.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 20, 20, 20, new java.awt.Color(130, 172, 229)));
        jspAlumno.setMinimumSize(new java.awt.Dimension(65, 60));
        jspAlumno.setPreferredSize(new java.awt.Dimension(15, 60));
        jspAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jspAlumnoMouseEntered(evt);
            }
        });
        jPanel1Alumno.add(jspAlumno);

        jPanel1.add(jPanel1Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 70));

        jPanel2Profesor.setBackground(new java.awt.Color(255, 255, 255));

        jbnProfesor.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jbnProfesor.setText("Profesor");

        javax.swing.GroupLayout jPanel2ProfesorLayout = new javax.swing.GroupLayout(jPanel2Profesor);
        jPanel2Profesor.setLayout(jPanel2ProfesorLayout);
        jPanel2ProfesorLayout.setHorizontalGroup(
            jPanel2ProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2ProfesorLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jbnProfesor)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel2ProfesorLayout.setVerticalGroup(
            jPanel2ProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2ProfesorLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jbnProfesor)
                .addGap(26, 26, 26))
        );

        jPanel1.add(jPanel2Profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 243, 240, 80));

        jspProfesor.setForeground(new java.awt.Color(0, 0, 0));
        jspProfesor.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jspProfesor.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 20, 20, 20, new java.awt.Color(130, 172, 229)));
        jspProfesor.setPreferredSize(new java.awt.Dimension(15, 60));
        jspProfesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jspProfesorMouseClicked(evt);
            }
        });
        jPanel1Profesor.add(jspProfesor);

        jPanel1.add(jPanel1Profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jspFecha1.setForeground(new java.awt.Color(0, 0, 0));
        jspFecha1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jspFecha1.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 20, 20, 20, new java.awt.Color(130, 172, 229)));
        jspFecha1.setPreferredSize(new java.awt.Dimension(15, 60));
        jspFecha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jspFecha1MouseClicked(evt);
            }
        });
        jPanel1Fecha.add(jspFecha1);

        jPanel1.add(jPanel1Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jPanel2Fechas.setBackground(new java.awt.Color(255, 255, 255));

        jbnFechas.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jbnFechas.setText("Fechas");

        javax.swing.GroupLayout jPanel2FechasLayout = new javax.swing.GroupLayout(jPanel2Fechas);
        jPanel2Fechas.setLayout(jPanel2FechasLayout);
        jPanel2FechasLayout.setHorizontalGroup(
            jPanel2FechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2FechasLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jbnFechas)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2FechasLayout.setVerticalGroup(
            jPanel2FechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2FechasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jbnFechas)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2Fechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 340, 230, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 820));
        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1110, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jspAlumnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jspAlumnoMouseEntered
        Object source = evt.getSource();
        if (source instanceof JPanel) {
           
        }
    }//GEN-LAST:event_jspAlumnoMouseEntered

    private void jspProfesorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jspProfesorMouseClicked
        
        
//        Ojbect source = evt.getSource();
//        if (source.instanceOf = jPanel1Profesor) {
//            if (source.equals(jPanel1Profesor)) {
//            jPanel2Profesor.setVisile(true);
//            }
//        }
    }//GEN-LAST:event_jspProfesorMouseClicked

    private void jspFecha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jspFecha1MouseClicked
//        Ojbect source = evt.getSource();
//        if (source.instanceOf = jPanel1Fecha) {
//            if (source.equals(jPanel1Fecha)) {
//            jPanel2Fechas.setVisile(true);
//            }
//        }
    }//GEN-LAST:event_jspFecha1MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel1Alumno;
    public javax.swing.JPanel jPanel1Fecha;
    public javax.swing.JPanel jPanel1Profesor;
    public javax.swing.JPanel jPanel2Alumno;
    public javax.swing.JPanel jPanel2Fechas;
    public javax.swing.JPanel jPanel2Profesor;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JLabel jbnAlumno;
    public javax.swing.JLabel jbnFechas;
    public javax.swing.JLabel jbnProfesor;
    public javax.swing.JSeparator jspAlumno;
    private javax.swing.JSeparator jspFecha1;
    private javax.swing.JSeparator jspProfesor;
    // End of variables declaration//GEN-END:variables
}

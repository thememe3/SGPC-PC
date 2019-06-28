package vista;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Alumno;

public class CuentaAlumno extends javax.swing.JInternalFrame implements MouseListener{

    public DefaultTableModel control = new DefaultTableModel();
    
    public CuentaAlumno() {
        initComponents();
        
        jtbCuentaAlumno.setModel(control);
        
    }
    
    
    public void eliminar(){
        control=(DefaultTableModel)jtbCuentaAlumno.getModel();
        control.setColumnCount(0);
        int a = jtbCuentaAlumno.getRowCount()-1;
        
        for (int i = a; i >= 0; i--) {          
        control.removeRow(control.getRowCount()-1);
        }
        
    }
    /**
     * Llenar los datos de la tabla
     * @param titulos
     * @param datos 
     */
    public void llenarTabla(Vector<String> titulos,Vector<Alumno> datos){
        
        for (String titulo : titulos){
            control.addColumn(titulo);//con esto llena los titulos de la tabla
        }
        
        for (Alumno dato : datos) {
            control.addRow(dato.toArray());
        }
        
        
        
    

    }
    
     
     
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jlbBuscaAl = new javax.swing.JLabel();
        jtfBuscarCuentaAlumno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCuentaAlumno = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jlbTituloDetalle = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jlbBajaAlumno = new javax.swing.JLabel();
        jlbResetPassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlbAlumno = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbBuscaAl.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jlbBuscaAl.setText("Buscar:");
        jPanel2.add(jlbBuscaAl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 80, 37));

        jtfBuscarCuentaAlumno.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jtfBuscarCuentaAlumno.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(130, 172, 229)), javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(170, 173, 226))));
        jtfBuscarCuentaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarCuentaAlumnoActionPerformed(evt);
            }
        });
        jPanel2.add(jtfBuscarCuentaAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 570, 48));

        jtbCuentaAlumno.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(130, 172, 229)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(170, 173, 226))));
        jtbCuentaAlumno.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jtbCuentaAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtbCuentaAlumno.setCellSelectionEnabled(true);
        jtbCuentaAlumno.setDragEnabled(true);
        jtbCuentaAlumno.setRowHeight(30);
        jtbCuentaAlumno.setRowMargin(6);
        jtbCuentaAlumno.setSelectionBackground(new java.awt.Color(0, 173, 137));
        jScrollPane1.setViewportView(jtbCuentaAlumno);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 677, 147));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jPanel5.setBackground(new java.awt.Color(0, 173, 137));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jlbTituloDetalle.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jlbTituloDetalle.setText("Detalles");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTituloDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbTituloDetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("-Información general \nacerca de las cuentas \nde los alumnos.\n\n-Datos generales cómo \nUsuario, contraseña,\nnombre del alumno.\n\n-Para realizar cualquier \nfunción tal como la baja \nde alumno o reinicio de \nsu contraseña se debe \nde dar click en la tabla y\nseleccionar la función \ndeseada.\n\n\n");
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 440));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 710, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, 100));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, 380));

        jSeparator4.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 24, 10));

        jSeparator5.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 173, 137)));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 24, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 5, new java.awt.Color(0, 0, 0)), new javax.swing.border.MatteBorder(null)));
        jPanel3.setPreferredSize(new java.awt.Dimension(451, 42));

        jlbBajaAlumno.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jlbBajaAlumno.setText("Baja de Alumno");

        jlbResetPassword.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jlbResetPassword.setText("Reinicio de Contraseña");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setText(">");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbBajaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 610, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbBajaAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlbResetPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1070, -1));

        jPanel1.setBackground(new java.awt.Color(0, 173, 137));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 1, 5, new java.awt.Color(0, 0, 0)), new javax.swing.border.MatteBorder(null)));
        jPanel1.setMaximumSize(new java.awt.Dimension(865, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(865, 102));

        jlbAlumno.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jlbAlumno.setText("Gestión de Alumnos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 1285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, -1));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 5, 0, new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createMatteBorder(0, 25, 25, 0, new java.awt.Color(0, 173, 137))));
        jSeparator8.setPreferredSize(new java.awt.Dimension(50, 10));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 29, 630));

        jSeparator10.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 24, 10));

        jSeparator9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 5, 0, new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createMatteBorder(0, 25, 25, 0, new java.awt.Color(0, 173, 137))));
        jSeparator9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 1040, 30));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 5, new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createMatteBorder(0, 25, 25, 0, new java.awt.Color(0, 170, 137))));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 140, 30, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfBuscarCuentaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarCuentaAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBuscarCuentaAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JLabel jlbAlumno;
    public javax.swing.JLabel jlbBajaAlumno;
    public javax.swing.JLabel jlbBuscaAl;
    public javax.swing.JLabel jlbResetPassword;
    private javax.swing.JLabel jlbTituloDetalle;
    public javax.swing.JTable jtbCuentaAlumno;
    public javax.swing.JTextField jtfBuscarCuentaAlumno;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
       JTable click=(JTable)e.getSource();//creamos la variable que escuchará cuando demos click sobre la tabla       
       if (click.equals(jtbCuentaAlumno)) {
           String nombre=(String)jtbCuentaAlumno.getValueAt(jtbCuentaAlumno.getSelectedRow(), 1);
           String pass=(String)jtbCuentaAlumno.getValueAt(jtbCuentaAlumno.getSelectedRow(), 4);
           
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }
}

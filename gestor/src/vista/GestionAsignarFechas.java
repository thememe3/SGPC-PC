package vista;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Alumno;
import modelo.Fecha;
import modelo.Grupo;

public class GestionAsignarFechas extends javax.swing.JInternalFrame {
         public DefaultTableModel control = new DefaultTableModel();
    public GestionAsignarFechas() {
        initComponents();
        jTable1.setModel(control);
        
    }
    
       public void llenarTabla(Vector<String> titulos,Vector<Fecha> datos){
        
        for (String titulo : titulos){
            control.addColumn(titulo);//con esto llena los titulos de la tabla
        }
        
        for (Fecha dato : datos) {
            control.addRow(dato.toArray());
        }
       }
    
    public void llenarCombo(Vector<Grupo> datos){
        for (Grupo gru : datos) {
                jcbGrupo.addItem(gru.getGrado());
        }
    }
      public void llenarComboEquipo(Vector<Fecha> datos){
        for (Fecha fe : datos) {
                //jcbEquipo.addItem(fe.getEquipo());
                
        }
    }
      public void eliminar(){
        

        control=(DefaultTableModel)jTable1.getModel();
        control.setColumnCount(0);
        int a = jTable1.getRowCount()-1;
        
        for (int i = a; i >= 0; i--) {          
        control.removeRow(control.getRowCount()-1);
        }
        
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jlbFecha = new javax.swing.JLabel();
        jlbLugar = new javax.swing.JLabel();
        jcbLugar = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jcbGrupo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jlbGestionFecha = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlbModificarFecha = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jlbTituloDetalle = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jbnActualizar = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(130, 172, 229)));
        jTable1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Lugar", "Hora", "Grupo", "Equipo"
            }
        ));
        jTable1.setAlignmentX(1.0F);
        jTable1.setAlignmentY(1.0F);
        jTable1.setCellSelectionEnabled(true);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setIntercellSpacing(new java.awt.Dimension(1, 5));
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(0, 173, 137));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 679, 147));

        jlbFecha.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jlbFecha.setText("Fecha");
        getContentPane().add(jlbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, -1, -1));

        jlbLugar.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jlbLugar.setText("Lugar");
        getContentPane().add(jlbLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        jcbLugar.setBackground(new java.awt.Color(130, 172, 229));
        jcbLugar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jcbLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auditorio 1", "Auditorio 2" }));
        getContentPane().add(jcbLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 210, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel5.setText("Grupo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        jcbGrupo.setBackground(new java.awt.Color(130, 172, 229));
        jcbGrupo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jcbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opción..." }));
        getContentPane().add(jcbGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 196, -1));

        jPanel1.setBackground(new java.awt.Color(0, 173, 137));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 0, 5, new java.awt.Color(0, 0, 0)), new javax.swing.border.MatteBorder(null)));

        jlbGestionFecha.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jlbGestionFecha.setText("Gestión de Fechas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlbGestionFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 1295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbGestionFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 5, new java.awt.Color(0, 0, 0)), new javax.swing.border.MatteBorder(null)));

        jlbModificarFecha.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbModificarFecha.setText("Modificar Fecha");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbModificarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(889, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbModificarFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1070, -1));

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
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbTituloDetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("-Información general \nacerca de los horarios \ny lugares a exponer \nproyecto.\n\n-Datos generales \ncomo fecha, lugar, \nhora, grupo y equipo.\n\n-Para realizar cualquier \nfunción tal como asignar \nun grupo o lugar de \nauditorio solo se necesita \nseleccionar el mas \nadecuado y pasar \na actualizar.\n\n\n");
        jTextArea1.setToolTipText("");
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 260, 440));

        jbnActualizar.setBackground(new java.awt.Color(130, 172, 229));
        jbnActualizar.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jbnActualizar.setText("Actualizar");
        getContentPane().add(jbnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, -1, 30));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 5, 0, new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createMatteBorder(0, 25, 25, 0, new java.awt.Color(0, 173, 137))));
        jSeparator8.setPreferredSize(new java.awt.Dimension(50, 10));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 29, 600));

        jSeparator9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 5, 0, new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createMatteBorder(0, 25, 25, 0, new java.awt.Color(0, 173, 137))));
        jSeparator9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1050, 30));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 5, new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createMatteBorder(0, 25, 25, 0, new java.awt.Color(0, 170, 137))));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 140, 30, 560));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, 170));

        jSeparator10.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 24, 10));

        jSeparator5.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 173, 137)));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 24, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 700, -1));

        jSeparator4.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 24, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
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
    public javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JButton jbnActualizar;
    public javax.swing.JComboBox<String> jcbGrupo;
    public javax.swing.JComboBox<String> jcbLugar;
    public javax.swing.JLabel jlbFecha;
    public javax.swing.JLabel jlbGestionFecha;
    public javax.swing.JLabel jlbLugar;
    public javax.swing.JLabel jlbModificarFecha;
    private javax.swing.JLabel jlbTituloDetalle;
    // End of variables declaration//GEN-END:variables
}

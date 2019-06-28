package vista;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.Grupo;
import modelo.ProfesoEjeM;

/**
 *
 * @author devr
 */
public class ProfesorEje extends javax.swing.JInternalFrame {

    /**
     * Creates new form profesorEje
     */
    public ProfesorEje() {
        initComponents();
    }
    /**
     * Asignar Profesor Eje
     * @param datos 
     */
 public void llenarCombo(Vector<ProfesoEjeM> datos){
     
     for (ProfesoEjeM pe : datos) {
                jcbGrado.addItem(pe.getGrado());
                jcbNombreMateria.addItem(pe.getMateria());
        }
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbGrado = new javax.swing.JComboBox<>();
        jbnAsignar = new javax.swing.JButton();
        jcbNombreMateria = new javax.swing.JComboBox<>();
        jlbProfesorEjeAs = new javax.swing.JLabel();

        jcbGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la opción..." }));

        jbnAsignar.setText("Asignar");

        jcbNombreMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción..." }));

        jlbProfesorEjeAs.setFont(new java.awt.Font("Fira Sans Semi-Light", 3, 13)); // NOI18N
        jlbProfesorEjeAs.setText("Profesor Eje Asignado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jcbNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbnAsignar))
                    .addComponent(jlbProfesorEjeAs))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnAsignar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbProfesorEjeAs)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbnAsignar;
    public javax.swing.JComboBox<String> jcbGrado;
    public javax.swing.JComboBox<String> jcbNombreMateria;
    public javax.swing.JLabel jlbProfesorEjeAs;
    // End of variables declaration//GEN-END:variables
}

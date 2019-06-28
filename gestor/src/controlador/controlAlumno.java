package controlador;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Alumno;
import modelo.Database;
import vista.CuentaAlumno;

public class ControlAlumno implements ActionListener, 
        MouseListener, KeyListener{
        CuentaAlumno alumno;
        Database db;
        //vector para guardar todos los nombres
        Vector<String> titulos= new Vector<String>();
        //vector para guardar todos los datos
        Vector<Alumno> datos = new Vector<Alumno>();
        String nombreUsuario,password,nombres;
            
    public ControlAlumno(CuentaAlumno alumno, Database db) {
          this.alumno=alumno;
          this.db=db;    
          this.alumno.setClosable(true);//lo hago cerrable
          this.alumno.setMaximizable(true);//lo hago maximizable
          this.alumno.setVisible(true);// lo hago visible
          this.alumno.setTitle("Alumno");//añado un titulo al frame
          JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)
          this.alumno.getUI()).getNorthPane();
          Dimension DimensionBarra = null;
          Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)
          this.alumno.getUI()).getNorthPane();
          DimensionBarra = Barra.getPreferredSize();
          this.alumno.setBorder(null);
          Barra.setSize(0,0);
          Barra.setPreferredSize(new Dimension(0,0));
          this.alumno.repaint(); 
          consCuenAlumnos();
          this.alumno.llenarTabla(titulos, datos);
          this.alumno.jtbCuentaAlumno.addMouseListener(this);
          this.alumno.jtfBuscarCuentaAlumno.addKeyListener(this);
          this.alumno.jlbBajaAlumno.addMouseListener(this);
           this.alumno.jlbResetPassword.addMouseListener(this);
    }
    
    public void consCuenAlumnos(){
        //realset funciona para mandar el query
         ResultSet alumnos = db.consultar("SELECT a.matricula, a.nombres, "
                 + "a.apellidos, a.statusAlumno, u.password FROM "
                 + "Alumno a INNER JOIN Usuario u on a.IdUsuario = "
                 + "u.IdUsuario WHERE a.statusAlumno=1;");
        Statement st;
        try {
            //hace el recorrido el next
           if (alumnos.next()) {
            //vector para guardar todos los nombres
            Vector<String> columnas= new Vector<String>();
            //vector para guardar todos los datos
            Vector<Alumno> datos = new Vector<Alumno>();
            //añades las columnas osea el nombre de cada dato
            columnas.add("Matricula");
            columnas.add("Nombres");
            columnas.add("Apellidos");
            columnas.add("Status");
            columnas.add("Password");
            ResultSet alumnosTodos= db.consultar("SELECT a.matricula,"
                    + " a.nombres, a.apellidos, a.statusAlumno, "
                    + "u.password FROM"
                    + " Alumno a INNER JOIN Usuario u on a.IdUsuario = "
                    + "u.IdUsuario WHERE a.statusAlumno=1;");
            
            while(alumnosTodos.next()){
                Alumno al = new Alumno();
                //guardas los datos en el modelo 
                //y en el get pones el tipo de dato que es 
                al.setMatricula(alumnosTodos.getInt(1));
                al.setNombre(alumnosTodos.getString(2));
                al.setApellidos(alumnosTodos.getString(3));
                al.setStatusAlumno(alumnosTodos.getByte(4));
                al.setPassword(alumnosTodos.getString(5));
                datos.add(al);//guarda los datos en el vector
            }
               titulos=columnas;
               //guardo los nombres en otro vector para sacarlos del 
               //metodo y ponerlos en el internal frame
            this.datos=datos;
            //guardo los datos en otro vector para sacarlos 
            //del metodo y ponerlos en el internal frame
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró");
        }
    }//fin de consulta Alumno
    
    /**
     * Para dar de baja la cuenta de un Alumno
     * @param nombre 
     */
      public void bajaCuenta(String nombre){
        try {
            if (nombre!=null) {
                int opc=JOptionPane.showConfirmDialog(alumno, "¿Está seguro de eliminar a "+nombre+"?");
                if (opc==0) {
                    db.actualizar("UPDATE Alumno SET statusAlumno=0 WHERE nombres='"+nombre+"';");
                    JOptionPane.showMessageDialog(alumno, "Cambios realizados Correctamente");
                }else{
                    
                }
            }else{
                JOptionPane.showMessageDialog(alumno, "Por favor intente de nuevo");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(alumno, e.getMessage());
        }
      }//fin de bajaCUentaAlumno
      
      /**
       * Para poder resetear la contraseña de un Alumno
       * @param nombre
       * @param pass 
       */
       public void resPassword(String nombre, String pass){
        try {
            if (nombre!=null) {   
                db.actualizar("UPDATE Usuario SET password='"+pass+"' WHERE nombreUsuario='"+nombre+"';");
                JOptionPane.showMessageDialog(alumno, "Contraseña actualizada");
                alumno.jlbAlumno.setText("Datos Actualizados!");
            }else{
                JOptionPane.showMessageDialog(alumno, "Por favor intente de nuevo");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(alumno, e.getMessage());
        }
    }//fin del reinicio de password
       
       public void reiniciarTabla(){
           alumno.eliminar();
                titulos.clear();
                datos.clear();
                consCuenAlumnos();
                alumno.llenarTabla(titulos, datos);
       }
       /**
        * Para hacer filtros de datos de alumnos
        * @param model
        * @param filtro
        * @param tabla 
        */
       public void filtro(DefaultTableModel model, String filtro, JTable tabla){
                 TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
                 tabla.setRowSorter(tr);
                 tr.setRowFilter(RowFilter.regexFilter(filtro));
             }
    public void actionPerformed(ActionEvent e) {
    }
    public void mouseClicked(MouseEvent e) {
        Object source=e.getSource();
        if (source instanceof JTable) {
            if (source.equals(alumno.jtbCuentaAlumno)) {//escucha a la tabla cuando damos click
                 nombreUsuario=(String)alumno.jtbCuentaAlumno.getValueAt(alumno.jtbCuentaAlumno.getSelectedRow(), 0); 
                 
                 nombres=(String)alumno.jtbCuentaAlumno.getValueAt(alumno.jtbCuentaAlumno.getSelectedRow(), 1); 
                 String apellidos=(String)alumno.jtbCuentaAlumno.getValueAt(alumno.jtbCuentaAlumno.getSelectedRow(), 2); 
                 alumno.jlbAlumno.setText("Detalles de Alumno: "+nombres+" "+apellidos);
            }//fin del if jtable Alumno
            
        }//fin del listener del JTable
        if (source instanceof JLabel) {
            if (source.equals(alumno.jlbBajaAlumno)) {
               bajaCuenta(nombres);
                reiniciarTabla();
                nombres=null;
                nombreUsuario=null; 
            }
            if (source.equals(alumno.jlbResetPassword)) {
                password=JOptionPane.showInputDialog(alumno, "Ingrese la nueva contraseña");
                if (password.equals("")) {
                    JOptionPane.showMessageDialog(alumno, "Intente de nuevo");
                }else{
                    resPassword(nombreUsuario, password);
                reiniciarTabla();
                password="";
                }
            }
        }
    }

    public void mousePressed(MouseEvent e) {
        
    }

    public void subrayar(JLabel label){
         Font font = label.getFont();
                    Map attributes = font.getAttributes();
                    attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
                    label.setFont(font.deriveFont(attributes));
    }
    
    public void quitarSubrayado(JLabel label){
         Font font = label.getFont();
                    Map attributes = font.getAttributes();
                    attributes.put(TextAttribute.UNDERLINE, -1);
                    label.setFont(font.deriveFont(attributes));
    }
    
    
    public void mouseReleased(MouseEvent e) {
        
    }

    public void mouseEntered(MouseEvent e) {
        Object source=e.getSource();
         if (source instanceof JLabel) {
             if (alumno.jlbBajaAlumno.equals(source)) {
                 subrayar(alumno.jlbBajaAlumno);                
             }//fin del jlbbajalalumno
             
             if (alumno.jlbResetPassword.equals(source)) {
                 subrayar(alumno.jlbResetPassword);                
             }//fin del jlbbajalalumno
             
        } //fin del listener del label
    }

    public void mouseExited(MouseEvent e) {
        Object source=e.getSource();
         if (source instanceof JLabel) {
             if (alumno.jlbBajaAlumno.equals(source)) {
                 quitarSubrayado(alumno.jlbBajaAlumno);                
             }
             
             if (alumno.jlbResetPassword.equals(source)) {
                 quitarSubrayado(alumno.jlbResetPassword);                
             }//fin del jlbbajalalumno
        } 
    }

    public void keyTyped(KeyEvent e) {
      
    }

    public void keyPressed(KeyEvent e) {
      
    }

    public void keyReleased(KeyEvent e) {
        filtro(alumno.control, alumno.jtfBuscarCuentaAlumno.getText(), alumno.jtbCuentaAlumno);
    }
    
}

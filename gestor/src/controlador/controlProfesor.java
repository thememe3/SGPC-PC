package controlador;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.SystemColor.menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Alumno;
import modelo.Database;
import modelo.Grupo;
import modelo.Profesor;
import vista.CuentaAlumno;
import vista.CuentaProfesor;
import vista.ProfesorEje;
import modelo.ProfesoEjeM;

/**
 *
 * @author devr
 */
public class ControlProfesor implements ActionListener, MouseListener, KeyListener{
    ProfesorEje pe;
    CuentaProfesor profesor;
    Database db;
    Vector<Profesor> datosP;
    //vector para guardar los datos en el internalFrame Profesor
    Vector<ProfesoEjeM> datosPE;
    //vector para guardar los datos en el internalFrame ProfesorEje
    Vector<String> titulos;
    //vector para guardar los titulos en el internalFrame 
    Vector<Alumno> datos;
    //vector para guardar los datos en el internalFrame Alumno
                
    String nombre,stat,password,codigoProfesor;
    public ControlProfesor(CuentaProfesor profesor,ProfesorEje pe, Database db) {
        this.profesor=profesor;
        this.db=db;
        this.pe=pe;
        this.profesor.setClosable(true);//lo hago cerrable
        this.profesor.setMaximizable(true);//lo hago maximizable
        this.profesor.setVisible(true);// lo hago visible
        this.profesor.setTitle("Profesor");//añado un titulo al frame
        JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) 
                this.profesor.getUI()).getNorthPane();
        Dimension DimensionBarra = null;
          Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) 
                  this.profesor.getUI()).getNorthPane();
            DimensionBarra = Barra.getPreferredSize();
            this.profesor.setBorder(null);
                Barra.setSize(0,0);
                    Barra.setPreferredSize(new Dimension(0,0));
                    this.profesor.repaint(); 

          consCuenProfesor();
          //hago el metodo de consulta para guardar los datos y los titulos
          this.profesor.llenarTabla(titulos, datosP);
          //metodo para llenar la tabla con los datos y titulos
          //listener de botones
          this.profesor.jtfCuentaProfesor.addKeyListener(this);
          this.profesor.jtbCuentaProfesor.addMouseListener(this);
          this.profesor.jlbAsignacionEje.addMouseListener(this);
          this.profesor.jlbReinicioPassword.addMouseListener(this);
          this.profesor.jlbPanelPrincipal.addMouseListener(this);
    }
public void consCuenProfesor(){
        //realset funciona para mandar el query
        //ResultSet alumnos = db.consultar("SELECT DISTINCT 
        //p.codigoProfesor, p.nombresProfesor, 
        //p.apellidosProfesor, u.password, g.grado "
        //+ "FROM Profesor p INNER JOIN Usuario u ON 
        //p.IdUsuario=u.IdUsuario INNER JOIN Profesor_Materia 
        //pm ON pm.codigoProfesor=p.codigoProfesor JOIN Materia m
        //ON pm.codigoMateria=m.codigoMateria "
        //+ "JOIN Grupo g ON g.grado=pm.grado ;");
        ResultSet alumnos = db.consultar("SELECT p.nombresProfesor, "
                + "p.apellidosProfesor, p.codigoProfesor, u.password "
        + "FROM Profesor p INNER JOIN Usuario u ON p.IdUsuario=u.IdUsuario;");
        //Statement st;
        try {
            //hace el recorrido el next
           if (alumnos.next()) {
            Vector<String> columnas= new Vector<String>();
            //vector para guardar todos los nombres
            Vector<Profesor> datosP = new Vector<Profesor>();
            //vector para guardar todos los datos
            
            columnas.add("Nombres");
            columnas.add("Apellidos");
            columnas.add("Codigo");
            //añades las columnas osea el nombre de cada dato
            columnas.add("Password");
            columnas.add("Status");
            ResultSet profesoresTodos= db.consultar("SELECT p.nombresProfesor,"
                    + " p.apellidosProfesor, p.codigoProfesor, u.password, "
                    + "p.statusProfesor FROM Profesor p INNER JOIN Usuario "
                    + "u ON p.IdUsuario=u.IdUsuario;");
            
            while(profesoresTodos.next()){
                Profesor pr = new Profesor();
                /*guardas los datos en el modelo y en el get
                pones el tipo de dato que es*/                 
                pr.setNombresProfesor(profesoresTodos.getString(1));
                pr.setApellidosProfesor(profesoresTodos.getString(2));
                pr.setCodigoProfesor(profesoresTodos.getInt(3));
                pr.setPassword(profesoresTodos.getString(4));
                pr.setProfesorEje(profesoresTodos.getString(5));
                datosP.add(pr);//guarda los datos en el vector
            }
               titulos=columnas;
            //guardo los nombres en otro vector para sacarlos 
            //del metodo y ponerlos en el internal frame
            this.datosP=datosP;
            //guardo los datos en otro vector para 
            //sacarlos del metodo y ponerlos en el internal frame
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró");
        }
    }//fin de consulta Profesor
      public void statusProfesor(String nombre, String status){
        try {
            db.actualizar("UPDATE Profesor SET statusProfesor='"+status+"' "
                    + "WHERE nombresProfesor='"+nombre+"';");
            //JOptionPane.showMessageDialog(Profesor, 
            //"Cambios realizados Correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//fin de dar de baja cuenta Profesor              
      public void consultaStatus() {
          ResultSet status=db.consultar("SELECT statusProfesor FROM Profesor "
                  + "WHERE nombresProfesor='"+nombre+"';");
          try{
          while(status.next()){
                stat=status.getString(1);
            }
          }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());  
          }
      }
        String profeEje;
      public void profesorEje(){
          
          ResultSet status=db.consultar("SELECT pm.grado,"
                  + "m.nombreMateria,pm.profesorEje "
                  + "FROM Profesor_Materia pm INNER JOIN Materia m "
                 + "ON pm.codigoMateria=m.codigoMateria WHERE "
                  + "pm.codigoProfesor='"+codigoProfesor+"'");
          try{
              Vector<ProfesoEjeM> datosPE = new Vector<ProfesoEjeM>();
            //vector para guardar todos los datos
          while(status.next()){
                ProfesoEjeM pe=new ProfesoEjeM();
                pe.setGrado(status.getString(1));
                pe.setMateria(status.getString(2));
                pe.setProfesorEje(status.getByte(3));
                datosPE.add(pe);                  
            }
          this.datosPE=datosPE;
          }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());  
          }
      }
      
      public void resPassword(String nombre){
        try {
            String opc=JOptionPane.showInputDialog(profesor,"Ingrese "
                    + "la nueva contraseña");
            int opc1=JOptionPane.showConfirmDialog(profesor,"¿Está seguro"
                    + " de reiniciar la contraseña?");
            
                if (nombre!=null) {
                    if (opc1==0) {
                    db.actualizar("UPDATE Usuario SET password='"+opc+"' "
                            + "WHERE nombreUsuario='"+nombre+"';");
                JOptionPane.showMessageDialog(profesor, "Contraseña "
                        + "actualizada\n Cambió de"
                +password+" a "+opc);
                password=null;    
                    }else{
                    }                    
            }else{
                JOptionPane.showMessageDialog(profesor, "Por favor"
                        + " intente de nuevo");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(profesor, e.getMessage());
        }
      }
      
      public void actualizarEje(){
          System.out.println(pe.jcbNombreMateria.getSelectedItem());
          System.out.println(pe.jcbGrado.getSelectedItem());
          System.out.println(codigoProfesor);
          db.actualizar("UPDATE Profesor_Materia INNER JOIN Materia "
                  + "ON Profesor_Materia.codigoMateria=Materia."
                  + "codigoMateria SET Profesor_Materia.profesorEje=1 "
                  + "WHERE Profesor_Materia.codigoProfesor"
                  + "='"+codigoProfesor+"' "
                  + "AND Profesor_Materia.grado='"
                  + ""+pe.jcbGrado.getSelectedItem()+"' "
                  + "AND Materia.nombreMateria='"+pe.jcbNombreMateria
                          .getSelectedItem()+"';");
          db.actualizar("UPDATE Profesor SET statusProfesor='profesorEje'"
                  + " WHERE codigoProfesor='"+codigoProfesor+"'");
          reiniciarTabla();
      }
       public void reiniciarTabla(){
           profesor.eliminar();
                titulos.clear();
                datosP.clear();
                consCuenProfesor();
                profesor.llenarTabla(titulos, datosP);
       }
       public void filtro(DefaultTableModel model, 
               String filtro, JTable tabla){
                 TableRowSorter<DefaultTableModel> tr = new
         TableRowSorter<>(model);
                 tabla.setRowSorter(tr);
                 tr.setRowFilter(RowFilter.regexFilter(filtro));
             }

       public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if (source instanceof JButton) {
            if (source.equals(pe.jbnAsignar)) {
                actualizarEje();
                pe.dispose();
            }
        }
        }//fin del listener de botones
    
        
    public void verificacionProfesorEje(Vector<ProfesoEjeM> datos){
        System.out.println("wajapen");
     for (ProfesoEjeM profesorEje : datos) {
               if (profesorEje.getProfesorEje()==1) {
                   JOptionPane.showMessageDialog(pe, "Profesor "
                           + "Eje en La materia "+profesorEje.getMateria()+
                           "\n del grupo "+profesorEje.getGrado());
                   
            }
               
        }
     
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
    String statusPro;

    public void mouseClicked(MouseEvent ae) {
        Object source=ae.getSource();
        if (source instanceof JButton) {
            
        }else if (source instanceof JTable) {
                String apellidos;
            if (source.equals(profesor.jtbCuentaProfesor)) 
            {//escucha a la tabla cuando damos click
                 nombre=(String)profesor.jtbCuentaProfesor.getValueAt
        (profesor.jtbCuentaProfesor.getSelectedRow(), 0); 
                 apellidos=(String)profesor.jtbCuentaProfesor.getValueAt
        (profesor.jtbCuentaProfesor.getSelectedRow(), 1); 
                 password=(String)profesor.jtbCuentaProfesor.getValueAt
        (profesor.jtbCuentaProfesor.getSelectedRow(), 3); 
                 codigoProfesor=(String)profesor.jtbCuentaProfesor.getValueAt
        (profesor.jtbCuentaProfesor.getSelectedRow(), 2); 
                 statusPro=(String)profesor.jtbCuentaProfesor.getValueAt
        (profesor.jtbCuentaProfesor.getSelectedRow(), 4); 
                 profesor.jlbPanelPrincipal.setText("Detalles del"
                         + " Profesor(a): "+nombre+" "+apellidos);
            }//fin del if jtable Alumno
            
        }else if (source instanceof JLabel) {
            if (source.equals(profesor.jlbAsignacionEje)) {
               profesorEje();
                System.out.println(statusPro);
                if (statusPro.equals("Profesor")) {
                       this.pe.llenarCombo(datosPE);
                       pe.jlbProfesorEjeAs.setVisible(false);
                       pe.jbnAsignar.addActionListener(this);
                       pe.jcbGrado.addActionListener(this);
                       JComponent Barra = 
                               ((javax.swing.plaf.basic.BasicInternalFrameUI
                                       ) this.pe.getUI()).getNorthPane();
                       Dimension DimensionBarra = null;
                       Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) 
                               this.pe.getUI()).getNorthPane();
                        DimensionBarra = Barra.getPreferredSize();
                        this.pe.setBorder(null);
                        //Barra.setSize(0,0);
                        this.pe.setBackground(Color.LIGHT_GRAY);
                        //Barra.setPreferredSize(new Dimension(0,0));
                        this.pe.repaint(); 
                        this.pe.setBounds(10, 10, 488, 152);
                        this.profesor.getParent().add(pe);
                        this.pe.setClosable(true); 
                        this.pe.setVisible(true);
                        //this.Profesor.setVisible(false);
                        this.profesor.moveToBack();
                        this.pe.moveToFront();
                        nombre=null;
                }else{
                       verificacionProfesorEje(datosPE);
                }
            }
            if (source.equals(profesor.jlbReinicioPassword)) {
                if (codigoProfesor==null||codigoProfesor.equals("")) {
                    System.out.println("nel");
                }else{
                    resPassword(codigoProfesor);
                reiniciarTabla();
                }
            }
        }//listener del jtable
    }

    public void mousePressed(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {
        
    }

    public void mouseEntered(MouseEvent e) {
        Object source=e.getSource();
        if (source instanceof JLabel) {
            if (source.equals(profesor.jlbReinicioPassword)) {
                subrayar(profesor.jlbReinicioPassword);
            }
            if (source.equals(profesor.jlbAsignacionEje)) {
                subrayar(profesor.jlbAsignacionEje);
            }
        }
    }

    public void mouseExited(MouseEvent e) {
        Object source=e.getSource();
        if (source instanceof JLabel) {
            if (source.equals(profesor.jlbReinicioPassword)) {
                quitarSubrayado(profesor.jlbReinicioPassword);
            }
            if (source.equals(profesor.jlbAsignacionEje)) {
                quitarSubrayado(profesor.jlbAsignacionEje);
            }
        }
    }

    
    public void keyTyped(KeyEvent e) {
       
    }

    public void keyPressed(KeyEvent e) {
       
    }

    public void keyReleased(KeyEvent e) {
            filtro(profesor.control, profesor.jtfCuentaProfesor.getText(), profesor.jtbCuentaProfesor);
    }

    
}

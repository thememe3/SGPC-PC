package controlador;

import com.toedter.calendar.JDateChooser;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Database;
import modelo.Fecha;
import modelo.Grupo;
import vista.GestionAsignarFechas;


public class ControlFecha implements ActionListener,MouseListener, KeyListener{
    Database db;
    GestionAsignarFechas fecha;
    //vector para guardar todos los datos
    Vector<Grupo> datosG = new Vector<Grupo>();
    //vector para guardar todos los datos
    Vector<Fecha> datosF = new Vector<Fecha>();
    //vector para guardar todos los datos
    Vector<String> titulos= new Vector<String>();
    //vector para guardar todos los nombres
    String grado;
    
    SimpleDateFormat Formato = new SimpleDateFormat("yyyy-MM-dd");
    public ControlFecha(Database db, GestionAsignarFechas fecha) {
        this.db=db;
        this.fecha=fecha;
            
        this.fecha.setClosable(true);//lo hago cerrable
        this.fecha.setMaximizable(true);//lo hago maximizable
        this.fecha.setVisible(true);// lo hago visible
        this.fecha.setTitle("Fechas");//añado un titulo al frame
        JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) 
        this.fecha.getUI()).getNorthPane();
        Dimension DimensionBarra = null;
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) 
        this.fecha.getUI()).getNorthPane();
        DimensionBarra = Barra.getPreferredSize();
        this.fecha.setBorder(null);
        Barra.setSize(0,0);
        Barra.setPreferredSize(new Dimension(0,0));
        this.fecha.repaint(); 
        this.fecha.jlbModificarFecha.addMouseListener(this);
        //this.Fecha.jlbModificarFecha.addMouseListener(this);
        //this.Fecha.jlbEliminarFecha.addMouseListener(this);
        this.fecha.jbnActualizar.addMouseListener(this);
        this.fecha.jcbGrupo.addActionListener(this);
        this.fecha.jTable1.addMouseListener(this);
                
        
        
        //botonesy labels ara ocultar cuando hagamos lo de la Fecha jsjsjs
       // this.Fecha.jcbEquipo.setVisible(false);
        //this.Fecha.jlbEquipo.setVisible(false);
        this.fecha.jlbFecha.setVisible(false);
        this.fecha.jlbLugar.setVisible(false);
        this.fecha.jdcFecha.setVisible(false);
        this.fecha.jbnActualizar.setVisible(false);
        this.fecha.jcbGrupo.setVisible(false);
        this.fecha.jLabel5.setVisible(false);
       
        this.fecha.jcbLugar.setVisible(false);
        filtroTableConfechas();
        fecha.llenarTabla(titulos, datosF);
        //hago el metodo de consulta para guardar los datos del Grupo
        llenarComboGrupo();
        //metodo para llenar la tabla con los datos y titulos
          this.fecha.llenarCombo(datosG);
    }
    
         public void filtroTableConfechas(){
        //realset funciona para mandar el query
        //ResultSet alumnos = db.consultar("SELECT DISTINCT ap.Fecha,
        //ap.auditorio, ap.hora, p.nombreEquipo, p.numEquipo  "
        //+ "FROM Proyecto p INNER JOIN Alumno_Proyecto 
        //ap JOIN Grupo g ON p.IdProyecto=ap.IdProyecto WHERE 
        //g.grado='"+grado+"';");
         
         ResultSet alumnos = db.consultar("SELECT grado, fecha, auditorio "
                 + "FROM Fecha_Proyecto WHERE IdFecha=IdFecha;");
        //Statement st;
        try {
            
           if (alumnos.next()) {
            //vector para guardar todos los nombres
            Vector<String> columnas= new Vector<String>();
            //vector para guardar todos los datos
            Vector<Fecha> datosF = new Vector<Fecha>();
            //añades las columnas osea el nombre de cada dato
            columnas.add("Grupo");
            columnas.add("Fecha");
            columnas.add("Lugar");
            //columnas.add("Equipo");
            //columnas.add("No. Equipo");
            //columnas.add("Número de Proyecto");
            ResultSet fechasTodos= db.consultar("SELECT grado,fecha,auditorio "
                    + "FROM Fecha_Proyecto WHERE IdFecha=IdFecha;");
            
            while(fechasTodos.next()){
                Fecha fr = new Fecha();
                //guardas los datos en el modelo y en el 
                //get pones el tipo de dato que es 
                fr.setGrupo(fechasTodos.getString(1));
                fr.setFecha(fechasTodos.getString(2));
                fr.setAuditorio(fechasTodos.getString(3));
                datosF.add(fr);//guarda los datos en el vector
            }
            //guardo los nombres en otro vector para sacarlos 
            //del metodo y ponerlos en el internal frame   
            titulos=columnas;
            //guardo los datos en otro vector para sacarlos 
            //del metodo y ponerlos en el internal frame
            this.datosF=datosF;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//fin de consulta Grupo filtro
         public void llenarFechas(String grado){
             ResultSet fechasTodos= db.consultar("SELECT grado,fecha,"
                     + "auditorio FROM Fecha_Proyecto "
                     + "WHERE grado='"+grado+"';");
            Vector<Fecha> datosF = new Vector<Fecha>();
            //vector para guardar todos los datos
             try{
                while(fechasTodos.next()){
                Fecha fr = new Fecha();
                //guardas los datos en el modelo y 
                //en el get pones el tipo de dato que es 
                fr.setGrupo(fechasTodos.getString(1));
                fr.setFecha(fechasTodos.getString(2));
                fr.setAuditorio(fechasTodos.getString(3));
                datosF.add(fr);//guarda los datos en el vector
            }
             this.datosF=datosF;
            } catch (SQLException ex) {
     Logger.getLogger(ControlFecha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         
    public void labels(boolean opci){
        // this.Fecha.jcbEquipo.setVisible(opci);
        //this.Fecha.jlbEquipo.setVisible(opci);
        this.fecha.jlbFecha.setVisible(opci);
        this.fecha.jcbGrupo.setVisible(opci);
        this.fecha.jlbLugar.setVisible(opci);
        this.fecha.jdcFecha.setVisible(opci);
        this.fecha.jLabel5.setVisible(opci);
        this.fecha.jcbLugar.setVisible(opci);
        this.fecha.jbnActualizar.setVisible(opci);
    }
    public void llenarComboGrupo(){
    //realset funciona para mandar el query
        try {
            //hace el recorrido el next
            ResultSet gruposTodos= db.consultar("SELECT grado FROM Grupo;");
            Vector<Grupo> datosG = new Vector<Grupo>();//vector para guardar todos los datos
            while(gruposTodos.next()){
                Grupo gr = new Grupo();
                //guardas los datos en el modelo y en el get pones el tipo de dato que es 
                gr.setGrado(gruposTodos.getString(1));
                datosG.add(gr);//guarda los datos en el vector
                this.datosG=datosG;//guardo los datos en otro vector para sacarlos del metodo y ponerlos en el internal frame
            }//fin del while             
            }//fin del try//fin del try
         catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró en el combo");
        }//fin del catch
    }//fin de llenado combo
    
        
        
        
       /* public void jcomboEquipo(String grado){
             //realset funciona para mandar el query
        try {
            //hace el recorrido el next
            ResultSet fechasTodos= db.consultar("SELECT p.nombreEquipo, ap.Fecha,ap.hora,ap.auditorio FROM Proyecto p INNER JOIN "
                    + "Alumno_Proyecto ap JOIN Grupo g ON p.IdProyecto=ap.IdProyecto WHERE g.grado='"+grado+"';");
            Vector<fecha> datosF = new Vector<fecha>();//vector para guardar todos los datos
            while(fechasTodos.next()){
                Fecha fe = new Fecha();
                //guardas los datos en el modelo y en el get pones el tipo de dato que es 
                fe.setEquipo(fechasTodos.getString(1));
                fe.setFecha(fechasTodos.getString(2));
                fe.setHora(fechasTodos.getString(3));
                fe.setAuditorio(fechasTodos.getString(4));
                datosF.add(fe);//guarda los datos en el vector
                this.datosF=datosF;//guardo los datos en otro vector para sacarlos del metodo y ponerlos en el internal frame
            }//fin del while             
            }//fin del try
         catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró");
        }//fin del catch
        }//fin de jcombo*/
        
         public String getFecha(JDateChooser jd){
         if (jd.getDate()!=null){
         return Formato.format(jd.getDate());
         }else{
         return null;
         }
         }//getfecha
         
         public java.util.Date StringADate(String fecha){
            SimpleDateFormat formato_del_Texto = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaE=null;
                try {
                fechaE = formato_del_Texto.parse(fecha);
                    return fechaE;
            } catch (ParseException ex) {
                    return null;
                }
            }//Stringadate
        
         public void actualizarFecha(String grupo,String date, String lugar){
             System.out.println(date+lugar+grupo);
             if (date==null||lugar==null||grupo==null) {
                 JOptionPane.showMessageDialog(fecha,"Favor de insertar "
                         + "todos los datos");
             }else{
                 db.actualizar("UPDATE Fecha_Proyecto SET grado='"+grupo+"',"
                         + "fecha='"+date+"',auditorio='"+lugar+"'WHERE"
                                 + " grado='"+grupo+"';"); 
                 reiniciarTabla();
             }
         }     
        public void eliminar(String grado){
            
            if (grado!=null) {                
                int opc=JOptionPane.showConfirmDialog(fecha, "¿Estas seguro de eliminar la fecha?");
            if (opc==0) {
                db.actualizar("DELETE FROM Fecha_Proyecto WHERE grado='"+grado+"'");
                    reiniciarTabla();
                    fecha.jlbGestionFecha.setText("Datos Eliminados!");
            }else{
        }
    }
}
        public void reiniciarTabla(){
           fecha.eliminar();
                titulos.clear();
                datosF.clear();
                llenarComboGrupo();
                filtroTableConfechas();
                fecha.llenarTabla(titulos, datosF);
       }
       
 String fechas,lugar,hora,grupo,equipo;
    @Override
    public void actionPerformed(ActionEvent e) {
     Object source=e.getSource();
        if (source instanceof JComboBox) {
            if (source.equals(fecha.jcbGrupo)) {
                grado=fecha.jcbGrupo.getItemAt(fecha.jcbGrupo.getSelectedIndex());
                datosF.clear();
                llenarFechas(grado);
                fecha.llenarComboEquipo(datosF);
                reiniciarTabla();
            }
        }//fin de combobox
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

String idProyecto;
    @Override
    public void mouseClicked(MouseEvent ae) {
        Object source=ae.getSource();
        if (source instanceof JButton) {
            if (source.equals(fecha.jbnActualizar)) {
                 String dateT=getFecha(fecha.jdcFecha);
                String lugarT=(String)fecha.jcbLugar.getSelectedItem();
                 String grupoT=(String)fecha.jcbGrupo.getSelectedItem();
                 System.out.println(dateT+lugarT+grupoT);
                actualizarFecha(grupoT, dateT, lugarT);
                labels(false);
            }//fin del actualizar
        }//fin del jbutton
        if (source instanceof JTable) {
            if (source.equals(fecha.jTable1)) {
        grupo=(String)fecha.jTable1.getValueAt(fecha.jTable1.getSelectedRow(), 0);     
        fechas=(String)fecha.jTable1.getValueAt(fecha.jTable1.getSelectedRow(), 1); 
        lugar=(String)fecha.jTable1.getValueAt(fecha.jTable1.getSelectedRow(), 2); 
        //hora=(String)Fecha.jTable1.getValueAt(Fecha.jTable1.getSelectedRow(), 2); 
        
        //idProyecto=(String)Fecha.jTable1.getValueAt(Fecha.jTable1.getSelectedRow(), 5); 
            }
        }//fin del listener jtable
        
//        if (source instanceof JLabel) {
//            if (source.equals(Fecha.jlbEliminarFecha)) {
//                System.out.println("siu");
//                eliminar(Grupo);
//            }
            if (source.equals(fecha.jlbModificarFecha)) {
                labels(true);
               
                
            }
//        }
        
    }

    @Override
    public void mousePressed(MouseEvent ae) {
          
    }

    @Override
    public void mouseReleased(MouseEvent ae) {
   
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        Object source=e.getSource();
//        if (source instanceof JLabel) {
//            if (source.equals(Fecha.jlbEliminarFecha)) {
//                subrayar(Fecha.jlbEliminarFecha);
//            }
//            if (source.equals(Fecha.jlbModificarFecha)) {
//                subrayar(Fecha.jlbModificarFecha);
//            }
//            if (source.equals(Fecha.jlbNuevaFecha)) {
//                subrayar(Fecha.jlbNuevaFecha);
//            }
//        }
    }

    @Override
    public void mouseExited(MouseEvent ae) {
//     Object source=ae.getSource();
//        if (source instanceof JLabel) {
//            if (source.equals(Fecha.jlbEliminarFecha)) {
//                quitarSubrayado(Fecha.jlbEliminarFecha);
//            }
//            if (source.equals(Fecha.jlbModificarFecha)) {
//                quitarSubrayado(Fecha.jlbModificarFecha);
//            }
//            if (source.equals(Fecha.jlbNuevaFecha)) {
//                quitarSubrayado(Fecha.jlbNuevaFecha);
//            }
//        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}

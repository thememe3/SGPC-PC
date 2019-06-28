package controlador;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelo.MSplash;
import modelo.Alumno;
import modelo.Database;
import org.w3c.dom.events.MouseEvent;
import vista.CuentaAlumno;
import vista.CuentaProfesor;
import vista.GestionAsignarFechas;
import vista.Login;
import vista.MenuGeneral;
import vista.Slpash;
import vista.ProfesorEje;
public class ControlPrincipal implements ActionListener, MouseListener{
    ProfesorEje pe=new ProfesorEje();
    MenuGeneral menu= new MenuGeneral();
    Login l;
    ControlProfesor profesor;
    ControlAlumno alumno;
    ControlFecha fecha;
    Database db;
    CuentaProfesor cp;
    CuentaAlumno ca;
    GestionAsignarFechas gf;
    Slpash spla;
    MSplash hilo;
    public ControlPrincipal(MenuGeneral menu, Database db, Login l) throws InterruptedException {
    this.menu=menu;
    this.l=l;
    this.db=db;
    this.menu.jbnAlumno.addMouseListener(this);
    this.menu.jbnProfesor.addMouseListener(this);
    this.menu.jbnFechas.addMouseListener(this);
    //this.menu.setVisible(true);
    this.menu.jPanel1Alumno.addMouseListener(this);
    this.menu.jPanel2Alumno.addMouseListener(this);
    this.menu.jPanel1Profesor.addMouseListener(this);
    this.menu.jPanel2Profesor.addMouseListener(this);
    this.menu.jPanel1Fecha.addMouseListener(this);
    this.menu.jPanel2Fechas.addMouseListener(this);
    this.menu.jPanel1Alumno.setVisible(false);
    this.menu.jPanel1Fecha.setVisible(false);
    this.menu.jPanel1Profesor.setVisible(false);
    this.l.jbnAcceder.addActionListener(this);    
        abrirSplash();
        l.setVisible(true);
    }
    /**
     * Iniciar la animación de carga
     * @throws InterruptedException 
     */
    public void abrirSplash() throws InterruptedException{
        spla = new Slpash();
        hilo = new MSplash(spla);
        spla.setVisible(true);
        hilo.start();
        hilo.join();
    }
    /**
     * Creación del inicio de sesión
     * @param e 
     */
    public void actionPerformed(ActionEvent e) {
            Object source=e.getSource();
            if (source instanceof JButton) {
                if (source.equals(l.jbnAcceder)) {
                    System.out.println("siu");
                    String Usuario ="admin";
        String Contraseña ="123";
        String Pass = new String(l.jtfContraseña.getPassword());
                if (l.jtfUsuario.getText().equals(Usuario) && Pass.equals(Contraseña)) {
            menu.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(l, "El usuario o la contraseña son incorrectos");
        }
                }
        }



//       Object source=e.getSource();
//        if (source instanceof JPanel) {
//            if (source.equals(menu.jPanel2Alumno)) {
//                cp=new CuentaProfesor();
//                profesor=new ControlProfesor(cp,pe, db);
//                menu.jDesktopPane1.removeAll();
//                menu.jDesktopPane1.add(profesor.profesor);
//                try {
//                    profesor.profesor.setMaximum(true);
//                } catch (PropertyVetoException ex) {
//                    Logger.getLogger(ControlPrincipal.class.
//              getName()).log(Level.SEVERE, null, ex);
//                }
//              
//            }//fin del if jbncuentas
//            if (source.equals(menu.jbnAlumno)) {
//                
//                ca=new CuentaAlumno();
//                alumno=new ControlAlumno(ca, db);
//                 menu.jDesktopPane1.removeAll();
//                menu.jDesktopPane1.add(alumno.alumno);
//                
//                    
//                try {
//                    alumno.alumno.setMaximum(true);
//                } catch (PropertyVetoException ex) {
//                    Logger.getLogger(ControlPrincipal.class.
//              getName()).log(Level.SEVERE, null, ex);
//                }
//         
//         
//            }//fin del jbnalumno
//            
//            if (source.equals(menu.jbnFechas)) {
//                gf= new GestionAsignarFechas();
//
//                fecha= new ControlFecha(db, gf);
//                menu.jDesktopPane1.removeAll();
//                menu.jDesktopPane1.add(fecha.fecha);
//                 
//            }//fin del if jbnfechas
//        }
    }

    public void mouseClicked(java.awt.event.MouseEvent e) {
        Object source=e.getSource();
        if (source instanceof JPanel) {
            if (source.equals(menu.jPanel2Alumno)) {
                cp=new CuentaProfesor();
                profesor=new ControlProfesor(cp,pe, db);
                menu.jDesktopPane1.removeAll();
                menu.jDesktopPane1.add(profesor.profesor);
                try {
                    profesor.profesor.setMaximum(true);
                } catch (PropertyVetoException ex) {
 Logger.getLogger(ControlPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
              
            }//fin del if jbncuentas
            if (source.equals(menu.jbnAlumno)) {
                
                ca=new CuentaAlumno();
                alumno=new ControlAlumno(ca, db);
                 menu.jDesktopPane1.removeAll();
                menu.jDesktopPane1.add(alumno.alumno);
                
                    
                try {
                    alumno.alumno.setMaximum(true);
                } catch (PropertyVetoException ex) {
Logger.getLogger(ControlPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
         
         
            }//fin del jbnalumno
            
            if (source.equals(menu.jbnFechas)) {
                gf= new GestionAsignarFechas();

                fecha= new ControlFecha(db, gf);
                menu.jDesktopPane1.removeAll();
                menu.jDesktopPane1.add(fecha.fecha);
                 
            }//fin del if jbnfechas
        } 
        
    }

    public void mousePressed(java.awt.event.MouseEvent e) {
       
    }

    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

    public void mouseEntered(java.awt.event.MouseEvent e) {
       Object source= e.getSource();
        if (source instanceof JPanel) {
            if (source.equals(menu.jPanel2Alumno)) {
                menu.jPanel1Alumno.setVisible(true);
            }
            
        }
    }

    public void mouseExited(java.awt.event.MouseEvent e) {
      Object source= e.getSource();
        if (source instanceof JPanel) {
            if (source.equals(menu.jPanel2Alumno)) {
                menu.jPanel1Alumno.setVisible(false);
            }
        }
    }
    
}

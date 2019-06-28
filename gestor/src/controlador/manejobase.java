package controlador;

import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JFrame;
import modelo.Database;
import vista.CuentaAlumno;
import vista.CuentaProfesor;
import vista.GestionAsignarFechas;
import vista.Login;
import vista.MenuGeneral;



public class ManejoBase {
    /**
     * Para poder enlazar todas las clases con la Base de Datos
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {

        Database b = new Database();
            Login lo= new Login();
            MenuGeneral menu= new MenuGeneral();
            CuentaAlumno cuenta=new CuentaAlumno();
            CuentaProfesor prof=new CuentaProfesor();
            GestionAsignarFechas asig=new GestionAsignarFechas();
            menu.setExtendedState(MAXIMIZED_BOTH);
           ControlPrincipal principal=new ControlPrincipal(menu,b,lo);
    }
}
  
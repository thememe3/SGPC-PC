package modelo;
import com.sun.javafx.font.Disposer;
import vista.MenuGeneral;
import vista.Slpash;
public class MSplash extends Thread{
    
    Slpash Spla;
    public MSplash(Slpash spla) {
    this.Spla = spla; 
    
    }
    
    @Override
    public void run(){
        try {
          super.run();
          int tiempo=0;
            while (tiempo<5000) {                
                for (int i = 0; i < Spla.imagenes.length; i++) {
                    Thread.sleep(500);
                    Spla.jlbCarga.setIcon(Spla.imagenes[i]);
                    tiempo+=600;
                    }//Cierre de For
            }//Cierre de While
           Spla.setVisible(false);
           //System.exit(0);
          //  vista.MenuGeneral mg = new vista.MenuGeneral();
            //mg.setVisible(true);
        } catch(InterruptedException ex){
        System.err.print(ex.getMessage());
        } 
    }
    
    
}
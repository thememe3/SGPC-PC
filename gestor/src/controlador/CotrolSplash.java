package controlador;
import modelo.MSplash;
import vista.Slpash;
public class CotrolSplash {
   /**
    *Para poder crear una animación de carga al ininiar la aplicación
    * @param args
    * @throws InterruptedException 
    */
    public static void main(String[] args) throws InterruptedException{
        Slpash spla = new Slpash();
        MSplash hilo = new MSplash(spla);
        spla.setVisible(true);
        hilo.start();
        hilo.join();
    }
}

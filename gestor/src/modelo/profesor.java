package modelo;
/**
 *
 * @author devr
 */
public class Profesor {
   private int codigoProfesor;
   private String nombresProfesor;
   private String apellidosProfesor;
   private String profesorEje;
   private String password;
   
    public Profesor() {
        this.codigoProfesor=0;
        this.nombresProfesor="";
        this.apellidosProfesor="";
        this.profesorEje="";
        this.password="";
   
    }
    public String getProfesorEje() {
        return profesorEje;
    }

    public void setProfesorEje(String profesorEje) {
        this.profesorEje = profesorEje;
    }
    
    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCodigoProfesor() {
        return codigoProfesor;
    }

    public void setCodigoProfesor(int codigoProfesor) {
        this.codigoProfesor = codigoProfesor;
    }

    public String getNombresProfesor() {
        return nombresProfesor;
    }

    public void setNombresProfesor(String nombresProfesor) {
        this.nombresProfesor = nombresProfesor;
    }

    public String getApellidosProfesor() {
        return apellidosProfesor;
    }

    public void setApellidosProfesor(String apellidosProfesor) {
        this.apellidosProfesor = apellidosProfesor;
    }
    
    //se añaden los strings necesarios para llenar la tabla
      public String[] toArray(){
        String[] datosArray = new String[5];
        
        datosArray[0]=nombresProfesor;
        datosArray[1]=apellidosProfesor;
        datosArray[2] = String.valueOf(codigoProfesor);
        datosArray[3]=password;
        datosArray[4]=profesorEje;
        
    
        return datosArray;
    }
      
      
   
   
}

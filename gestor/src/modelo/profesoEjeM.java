package modelo;

/**
 *
 * @author devr
 */
public class ProfesoEjeM {
    private String materia;
   private String grado;
   private byte profesorEje;

    public ProfesoEjeM() {
        this.materia = "";
        this.grado = "";
        this.profesorEje=0;
    }

    public byte getProfesorEje() {
        return profesorEje;
    }

    public void setProfesorEje(byte profesorEje) {
        this.profesorEje = profesorEje;
    }

    
    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    
   
   
}

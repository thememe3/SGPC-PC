package modelo;
public class Fecha {
    private int idFecha;
    private String fecha ;
    private String grupo;
    private  String auditorio;
    private String hora;
    
    private String equipo;
    private int idProyecto;

    public Fecha() {
        this.fecha = fecha;
        this.auditorio = auditorio;
        this.hora = hora;
        this.grupo = grupo;
        this.equipo = equipo;
        this.idProyecto=idProyecto;
    }

    public int getIdFecha() {
        return idFecha;
    }

    public void setIdFecha(int idFecha) {
        this.idFecha = idFecha;
    }    

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAuditorio() {
        return auditorio;
    }

    public void setAuditorio(String auditorio) {
        this.auditorio = auditorio;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    
     //se añaden los strings necesarios para llenar la tabla
      public String[] toArray(){
        String[] datosArray = new String[3];
        //datosArray[0]=String.valueOf(idFecha);
        datosArray[0]=grupo;
        datosArray[1] =fecha;
        datosArray[2]=auditorio;
        return datosArray;
    }
    
   
    
}

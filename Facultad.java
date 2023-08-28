

public class Facultad extends Universidad {
   String nombreFacultad;
    int numProgramas;

    public Facultad(String nombre, String ubicacion, String nombreFacultad, int numProgramas) {
        super(nombre, ubicacion);
        this.nombreFacultad = nombreFacultad;
        this.numProgramas = numProgramas;
    }

    
    public Facultad(String nombre, String ubicacion) {
        super(nombre, ubicacion);
    }

  
    public String getNombreFacultad() {
        return nombreFacultad;
    }

    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }

    public int getNumProgramas() {
        return numProgramas;
    }

    public void setNumProgramas(int numProgramas) {
        this.numProgramas = numProgramas;
    }

   public interface Investigable {
    void realizarInvestigacion();
}
   
}
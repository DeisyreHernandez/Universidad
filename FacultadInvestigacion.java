
import java.io.PrintStream;

 public class FacultadInvestigacion extends Facultad  {
    int numProyectos;

    public FacultadInvestigacion(String nombre, String ubicacion, String nombreFacultad, int numProgramas, int numProyectos) {
        super(nombre, ubicacion, nombreFacultad, numProgramas);
        this.numProyectos = numProyectos;
    }
    
    public void realizarInvestigacion() {
        System.out.println ("El nombre de la universidad es:"+nombre+"\nestamos ubicados en: "+ubicacion+"\nNombre de Facultad: "
                +nombreFacultad+"\n Nuestras programas son: "+numProgramas+"\nProyectos realizados en nuestra facultad: "+numProyectos);
    }

  
    public int getNumProyectos() {
        return numProyectos;
    }

    public void setNumProyectos(int numProyectos) {
        this.numProyectos = numProyectos;
    }
    
   
     
 }
 


import java.util.ArrayList;
import java.util.Iterator;

public class Escuela {
    private String nombre;
    private ArrayList<Persona> alumnos;

    public Escuela(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList();
    }

    public void agregarAlumno(Persona alumno) {
        alumno.setEscuela(this);
        this.alumnos.add(alumno);
    }

    public String getNombre() {
        return this.nombre;
    }

    private String obtenerNombresAlumnos() {
        if (this.alumnos.size() == 0) {
            return "No hay alumnos";
        } else {
            ArrayList<String> nombresAlumnos = new ArrayList();
            Iterator var2 = this.alumnos.iterator();

            while(var2.hasNext()) {
                Persona alumno = (Persona)var2.next();
                nombresAlumnos.add(alumno.getNombre());
            }

            return String.valueOf(nombresAlumnos);
        }
    }

    public String toString() {
        String var10000 = this.nombre;
        return "Escuela{nombre='" + var10000 + "', alumnos=" + this.obtenerNombresAlumnos() + "}";
    }
}
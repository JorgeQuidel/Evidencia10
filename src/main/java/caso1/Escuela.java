package caso1;
import java.util.ArrayList;


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
        }
        ArrayList<String> nombresAlumnos = new ArrayList();
        for (Persona alumno: alumnos) {
            nombresAlumnos.add(alumno.getNombre());
        }
        return String.valueOf(nombresAlumnos);
    }

    public String toString() {
        return "Escuela{nombre='" + nombre + "', alumnos=" + this.obtenerNombresAlumnos() + "}";
    }
}
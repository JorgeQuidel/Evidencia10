package caso2;
import java.util.ArrayList;

public class Grupo {
	private Departamento departamento;
	private ArrayList<Empleado> empleados;

	public Grupo(Departamento departamento) {
		this.departamento = departamento;
		this.empleados = new ArrayList<>();
	}

	public void añadirEmpleadosAGrupo(Empleado empleado){
		empleados.add(empleado);
	}
}
package caso2;
public class Empleado extends Persona {
	private Grupo grupo;

	public Empleado(String nombre, Grupo grupo) {
		super(nombre);
		this.grupo = grupo;
	}
}
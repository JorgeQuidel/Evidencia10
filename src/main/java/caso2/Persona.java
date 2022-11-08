package caso2;
import java.util.ArrayList;

public class Persona {
	private String nombre;
	private ArrayList<Persona> amigos;
	private Casa casa;
	private Moto moto;

	public Persona(String nombre) {
		this.nombre = nombre;
	}
}
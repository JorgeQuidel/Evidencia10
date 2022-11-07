package caso1;

import java.util.ArrayList;

public class Mascota {
	protected String nombre;
	protected ArrayList<Persona> duenos;

	public Mascota(String nombre, Persona dueno) {
		this.nombre = nombre;
		this.duenos = new ArrayList<>();
		this.duenos.add(dueno);
		dueno.añadirMascotas(this);
	}

	public void añadirOtroDueno(Persona dueno) {
		duenos.add(dueno);
		dueno.añadirMascotas(this);
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		ArrayList<String> nombresDuenos = new ArrayList<>();
		for (Persona dueno : duenos) {
			nombresDuenos.add(dueno.getNombre());
		}

		return "Mascota{" +
				"nombre='" + nombre + '\'' +
				", duenos=" + nombresDuenos +
				'}';
	}
}
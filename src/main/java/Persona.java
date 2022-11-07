import java.util.ArrayList;

public class Persona {
	private String nombre;
	private int edad;
	private ArrayList<Persona> amigos;
	private ArrayList<Persona> familiares;
	private ArrayList<Mascota> mascotas;
	private Escuela escuela;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.amigos = new ArrayList<>();
		this.mascotas = new ArrayList<>();
		this.familiares = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setEscuela(Escuela escuela) {
		this.escuela = escuela;
	}

	public void añadirMascotas(Mascota mascota) {
		mascotas.add(mascota);
	}

	public void añadirFamiliar(Persona familiar){
		familiares.add(familiar);
	}

	public void añadirAmigo(Persona amigo){
		amigos.add(amigo);
	}

	private String obtenerNombresAmigos(){
		if(amigos.size() == 0){
			return "No se tiene registrado amigos";
		}

		ArrayList<String> nombresAmigos = new ArrayList<>();
		for (Persona amigo : amigos) {
			nombresAmigos.add(amigo.getNombre());
		}

		return String.valueOf(nombresAmigos);
	}

	private String obtenerNombresFamiliares(){
		if(familiares.size() == 0){
			return "No se tiene registrado familiares";
		}

		ArrayList<String> nombresFamiliares = new ArrayList<>();
		for (Persona familiar : familiares) {
			nombresFamiliares.add(familiar.getNombre());
		}

		return String.valueOf(nombresFamiliares);
	}

	private String obtenerNombresMascotas(){
		if(mascotas.size() == 0){
			return "No tiene mascotas";
		}

		ArrayList<String> nombresMascotas = new ArrayList<>();
		for (Mascota mascota: mascotas) {
			nombresMascotas.add(mascota.getNombre());
		}

		return String.valueOf(nombresMascotas);
	}

	private String obtenerNombreEscuela(){
		if(escuela == null){
			return "No va a ninguna escuela";
		}
		return escuela.getNombre();
	}

	@Override
	public String toString() {
		ArrayList<String> nombresMascotas = new ArrayList<>();
		for (Mascota mascota: mascotas) {
			nombresMascotas.add(mascota.getNombre());
		}


		return "Persona{" +
				"nombre='" + nombre + '\'' +
				", edad=" + edad +
				", amigos=" + obtenerNombresAmigos() +
				", familiares=" + obtenerNombresFamiliares() +
				", mascotas=" + obtenerNombresMascotas() +
				", escuela=" + obtenerNombreEscuela() +
				'}';
	}
}
package caso1;
public class Perro extends Mascota {

	private String color;

	public Perro(String nombre, Persona dueno, String color) {
		super(nombre, dueno);
		this.color = color;
	}

	public void comer() {
		System.out.println(nombre + " esta comiendo");
	}

	public void ladrar() {
		System.out.println(nombre + " esta ladrando");
	}

}
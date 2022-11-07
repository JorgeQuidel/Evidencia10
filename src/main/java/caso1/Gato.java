package caso1;
import java.util.ArrayList;

public class Gato extends Mascota {

	private boolean deBuenCaracter;

	public Gato(String nombre, Persona dueno, boolean deBuenCaracter) {
		super(nombre, dueno);
		this.deBuenCaracter = deBuenCaracter;
	}

	public void morder() {
		System.out.println(nombre + " esta mordiendo");
	}

	public void rasgunar() {
		System.out.println(nombre + " esta rasgunando");
	}
}
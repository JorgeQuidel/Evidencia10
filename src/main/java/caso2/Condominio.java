package caso2;
import java.util.ArrayList;

public class Condominio {
	private String nombre;
	private ArrayList<Casa> casas;


	public Condominio(String nombre) {
		this.nombre = nombre;
		this.casas = new ArrayList<>(20);
	}

	public void definirCasaPerteneciente(Casa casa){
		casas.add(casa);
	}
}
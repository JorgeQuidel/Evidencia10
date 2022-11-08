package caso2;
import java.util.ArrayList;

public class Casa {
	private ArrayList<Persona> inquilinos;
	public Condominio condominio;

	public Casa(Condominio condominio) {
		this.condominio = condominio;
		condominio.definirCasaPerteneciente(this);
		this.inquilinos = new ArrayList<>();
	}

	public void arrendar(Persona inquilino){
		inquilinos.add(inquilino);
	}
}
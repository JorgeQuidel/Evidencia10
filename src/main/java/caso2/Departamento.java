package caso2;
import java.util.ArrayList;

public class Departamento {
	private Empresa empresa;
	public TipoDepartamento tipoDepartamento;
	private ArrayList<Grupo> grupos;

	public Departamento(Empresa empresa, TipoDepartamento tipoDepartamento) {
		this.empresa = empresa;
		this.tipoDepartamento = tipoDepartamento;
		this.grupos = new ArrayList<>();
	}
}
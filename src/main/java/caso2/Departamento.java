package caso2;
import java.util.ArrayList;

public class Departamento {
	public TipoDepartamento tipoDepartamento;
	private ArrayList<Grupo> grupos;
	private Empresa empresa;

	public Departamento(Empresa empresa, TipoDepartamento tipoDepartamento) {
		this.empresa = empresa;
		this.tipoDepartamento = tipoDepartamento;
		this.grupos = new ArrayList<>();
	}
}
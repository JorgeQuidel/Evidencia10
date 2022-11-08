package caso2;
import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Departamento> departamentos;

	public Empresa(String nombre) {
		this.nombre = nombre;
		this.departamentos = new ArrayList<>();
		this.departamentos.add(new Departamento(this, TipoDepartamento.ADQUISICIONES));
		this.departamentos.add(new Departamento(this, TipoDepartamento.FINANZAS));
		this.departamentos.add(new Departamento(this, TipoDepartamento.LOGISTICA));
		this.departamentos.add(new Departamento(this, TipoDepartamento.PRODUCCION));
		this.departamentos.add(new Departamento(this, TipoDepartamento.VENTAS));
	}
}
package caso2;
public enum TipoDepartamento {
    ADQUISICIONES("Adquisiciones"),
    VENTAS("Ventas"),
    PRODUCCION("Produccion"),
    LOGISTICA("Logistica"),
    FINANZAS("Finanzas");

    private final String departamento;

    TipoDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}
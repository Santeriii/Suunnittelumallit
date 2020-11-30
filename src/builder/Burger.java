package builder;

public class Burger {
	
	private String sampyla = "";
    private String pihvi = "";
    private String salaatti = "";
    private String juusto = "";

	public Burger(String sampyla, String pihvi, String salaatti, String juusto) {
		this.sampyla = sampyla;
		this.pihvi = pihvi;
		this.salaatti = salaatti;
		this.juusto = juusto;
	}

	@Override
	public String toString() {
		return "sämpylä: " + this.sampyla + ", pihvi: " + this.pihvi + ", salaatti: " + this.salaatti + ", juusto: " + this.juusto;
	}
}

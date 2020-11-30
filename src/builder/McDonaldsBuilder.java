package builder;

public class McDonaldsBuilder {

    private String sampyla = "";
    private String pihvi = "";
    private String salaatti = "";
    private String juusto = "";

    public McDonaldsBuilder(String sampyla, String pihvi, String salaatti,
            String juusto) {
        this.sampyla = sampyla;
        this.pihvi = pihvi;
        this.salaatti = salaatti;
        this.juusto = juusto;
    }
    
    public McDonaldsBuilder getBurger() {
    	return this;
    }
    
    public Burger build() {
        return new Burger(sampyla, pihvi, salaatti, juusto);
    }
}

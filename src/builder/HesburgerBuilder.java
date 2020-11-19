package builder;

import java.util.List;

public class HesburgerBuilder {

    private List<Object> burgerinOsat = null;
	private Juusto juusto;
	private Salaatti salaatti;
	private Pihvi pihvi;
	private Sampyla sampyla;

    public HesburgerBuilder(Sampyla sampyla, Pihvi pihvi, Salaatti salaatti,
            Juusto juusto) {
        this.sampyla = sampyla;
        this.pihvi = pihvi;
        this.salaatti = salaatti;
        this.juusto = juusto;
    }
    
    public HesburgerBuilder getBurger() {
    	return this;
    }
    
    public Burger build() {
        return new Burger(sampyla.getNimi(), pihvi.getNimi(), salaatti.getNimi(), juusto.getNimi());
    }
}


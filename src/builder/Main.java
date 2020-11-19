package builder;

public class Main {
	public static void main(String[] args) {
        Burger burger = new McDonaldsBuilder("kolmoissämpylä", "kaksi naudanlihapihviä", "jäävuorisalaatti", "cheddar-juustosiivu").build();
        System.out.println(burger.toString());
        
        Sampyla sampyla = new Sampyla("kolme sämpylää");
        Pihvi pihvi = new Pihvi("kaksi kanafileepihviä");
        Salaatti salaatti = new Salaatti("Rucola");
        Juusto juusto = new Juusto("Halloum-pala");
        
        burger = new HesburgerBuilder(sampyla, pihvi, salaatti, juusto).build();
        System.out.println(burger.toString());
    }
}

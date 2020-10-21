package osa1;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        
        AterioivaOtus rehtori = new Rehtori();
        rehtori.aterioi();
        
        AterioivaOtus kuraattori = new Kuraattori();
        kuraattori.aterioi();
    }
}

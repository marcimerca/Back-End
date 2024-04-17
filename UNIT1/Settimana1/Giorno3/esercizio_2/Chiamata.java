package esercizio_2;

public class Chiamata {
    private double minutiChiamata;
    private String numeroChiamato;

    public Chiamata(double minutiChiamata, String numeroChiamato) {
        this.minutiChiamata = minutiChiamata;
        this.numeroChiamato = numeroChiamato;
    }

    public double getMinutiChiamata() {
        return minutiChiamata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public void setMinutiChiamata(double minutiChiamata) {
        this.minutiChiamata = minutiChiamata;
    }

    public void setNumeroChiamato(String numeroChiamato) {
        this.numeroChiamato = numeroChiamato;
    }
}

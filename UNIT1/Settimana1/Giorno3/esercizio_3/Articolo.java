package esercizio_3;

public class Articolo {
    private String codiceArt;
    private String descrizione;
    private int numPezzi;

    public Articolo(String codiceArt, String descrizione, int numPezzi){
        this.codiceArt = codiceArt;
        this.descrizione = descrizione;
        this.numPezzi = numPezzi;
    }

    public String getCodice() {
        return codiceArt;
    }

    public void setCodice(String codice) {
        this.codiceArt = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getNumPezzi() {
        return numPezzi;
    }

    public void setNumPezzi(int numPezzi) {
        this.numPezzi = numPezzi;
    }
}

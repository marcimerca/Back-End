package esercizio_3;

public class Articolo {
    private String codiceArt;
    private String descrizione;
    private int prezzo;
    private int numPezzi;

    public Articolo(String codiceArt, String descrizione, int prezzo, int numPezzi) {
        this.codiceArt = codiceArt;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.numPezzi = numPezzi;
    }

    public String getCodiceArt() {
        return codiceArt;
    }

    public void setCodiceArt(String codiceArt) {
        this.codiceArt = codiceArt;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getNumPezzi() {
        return numPezzi;
    }

    public void setNumPezzi(int numPezzi) {
        this.numPezzi = numPezzi;
    }
}

package esercizio_3;

import java.util.List;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;
    private String email;
    private double totCostoArticoli;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Articolo[] getArticoli() {
        return articoli;
    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTotCostoArticoli() {
        totCostoArticoli = calcolaCostoTot();
        return totCostoArticoli;
    }

    private double calcolaCostoTot(){
        double somma = 0;

        for(int i = 0; i< articoli.length; i++) {
            double prezzo = articoli[i].getPrezzo();

            somma = somma + prezzo;
        }
        return somma;
    }
}

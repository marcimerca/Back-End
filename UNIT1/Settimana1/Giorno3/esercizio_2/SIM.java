package esercizio_2;

import java.util.List;
import java.util.ArrayList;

public class SIM {
    private String numeroTel;
    private double credito;
    private List<Chiamata> listaChiamate;

    public SIM(String numeroTel){
        this.numeroTel = numeroTel;
        this.credito = credito;
        this.listaChiamate = listaChiamate;
    }

    public SIM(String numeroTel, double credito){
        this.numeroTel = numeroTel;
        this.credito = credito;
        this.listaChiamate =  new ArrayList<>();
    }

    public void StampaDati() {
        System.out.println("Il numero di tel è " + this.numeroTel + ". Il credito è " + this.credito + ". Lista chiamate: ");
        stampaListaChiamate();

    }


    public void aggiungiChiamata(Chiamata chiamata) {
        listaChiamate.add(chiamata);

    }

    public void stampaListaChiamate() {
        for (int i = 0; i < listaChiamate.size(); i++) {
            Chiamata chiamata = listaChiamate.get(i);
            System.out.println("Chiamata " + (i+1) + ": Durata = " + chiamata.getMinutiChiamata() + " minuti, Numero chiamato = " + chiamata.getNumeroChiamato());
        }
    }


    public String getNumeroTel() {
        return numeroTel;
    }

    public double getCredito() {
        return credito;
    }

    public List<Chiamata> getListaChiamate() {
        return listaChiamate;
    }


}

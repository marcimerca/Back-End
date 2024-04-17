package esercizio_2;

import java.util.List;
import java.util.ArrayList;

public class SIM {
    private String numeroTel;
    private double credito;
    private Chiamata[] chiamate;

    public SIM(String numeroTel){
        this.numeroTel = numeroTel;
        this.credito = credito;

    }

    public SIM(String numeroTel, double credito){
        this.numeroTel = numeroTel;
        this.credito = credito;

    }

    public void StampaDati() {
        System.out.println("Il numero di tel è " + this.numeroTel + ". Il credito è " + this.credito + ". Lista chiamate: ");

        for(int i = 0; i < chiamate.length; i++) {
            System.out.println("Il numero chiamato è : " + chiamate[i].getNumeroChiamato()+ " I minuti in chiamata sono: " + chiamate[i].getMinutiChiamata());
        }

    }

    public void ricarica(int ricarica){
        this.credito += ricarica;
    }


    public String getNumeroTel() {
        return numeroTel;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }


    public void setChiamate(Chiamata[] chiamate) {
       this.chiamate = chiamate;
    }


}

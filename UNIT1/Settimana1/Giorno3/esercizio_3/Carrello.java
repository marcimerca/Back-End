package esercizio_3;

import java.util.List;

public class Carrello {
    private Cliente cliente;
    private List<Articolo> listaArticoli;
    private String email;
    private int totCostoArticoli;

    public Carrello (Cliente cliente) {
        this.cliente = cliente;

    }
}

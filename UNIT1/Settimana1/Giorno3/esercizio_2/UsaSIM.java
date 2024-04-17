package esercizio_2;

public class UsaSIM {

    public static void main(String[] args) {
        SIM sim1 = new SIM("32984894", 5);


        Chiamata chiamata1 = new Chiamata(3, "43903403");

        Chiamata chiamata2 = new Chiamata(6, "3455553");

        sim1.aggiungiChiamata(chiamata1);
        sim1.aggiungiChiamata(chiamata2);

        sim1.StampaDati();
    }
}

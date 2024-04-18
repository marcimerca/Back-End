package esercizio_3;

import java.util.Date;

public class E_Commerce {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("1293", "Mario", "Rossi",  "mario@rossi.com", new Date());

        Articolo articolo1 = new Articolo("11111", "Cassa bluetooth", 3, 2);

        Articolo articolo2 = new Articolo("11341", "iPhone", 20, 4);


        Articolo articolo3 = new Articolo("13441", "Tv Lg", 100, 2);

        Articolo[] articoli = new Articolo[3];

        articoli[0] = articolo1;
        articoli[1] = articolo2;
        articoli[2] = articolo3;

        Carrello carrello = new Carrello(cliente1);

        carrello.setArticoli(articoli);

        System.out.println(carrello.getTotCostoArticoli());







    }








}

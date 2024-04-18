package esercizio_1;

public class UsaDipendente {
    public static void main(String[] args) {

        Dipendente dipendente1 = new Dipendente("0238293", 5000, Dipartimento.AMMINISTRAZIONE);

        Dipendente dipendente2 = new Dipendente("1234829", 1500, Dipartimento.PRODUZIONE);

        Dipendente dipendente3 = new Dipendente("9485451", 1800, Dipartimento.VENDITE);

        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};

        for(int i = 0; i <dipendenti.length; i++) {
            System.out.println("Matricola dipendente n." + (i + 1) + ": " + dipendenti[i].getMatricola());
        }

    }
}

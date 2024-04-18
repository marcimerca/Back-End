package esercizio;

public class UsaDipendente {
    public static void main(String[] args) {
/* Parte esercizio 1
        Dipendente dipendente1 = new Dipendente("0238293", 5000, Dipartimento.AMMINISTRAZIONE);

        Dipendente dipendente2 = new Dipendente("1234829", 1500, Dipartimento.PRODUZIONE);

        Dipendente dipendente3 = new Dipendente("9485451", 1800, Dipartimento.VENDITE);

        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};

        for(int i = 0; i <dipendenti.length; i++) {
            System.out.println("Matricola dipendente n." + (i + 1) + ": " + dipendenti[i].getMatricola());
        }*/


        // Parte esercizio 2

        Dipendente dipendente1 = new DipendenteFullTime("0123",5000,Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new DipendentePartTime("0124",Dipartimento.VENDITE, 30, 20);

        Dipendente dipendete3 = new Dirigente("1111",10000, Dipartimento.AMMINISTRAZIONE, 3000);

        Dipendente[] dipendenti = {dipendente1,dipendente2,dipendete3};


        double sommaStipendi = 0;
        for(int i = 0; i< dipendenti.length; i++){
           sommaStipendi += dipendenti[i].calcolaSalario();

        }

        System.out.println(sommaStipendi);


        // Parte esercizio 3





        Dipendente dipendente4 = new DipendenteFullTime("0123",5000,Dipartimento.PRODUZIONE);
        Dipendente dipendente5 = new DipendentePartTime("0124",Dipartimento.VENDITE, 30, 20);

        Dipendente dipendente6 = new Dirigente("1111",10000, Dipartimento.AMMINISTRAZIONE, 3000);

        Volontario volontario1 = new Volontario("Mario", 30, "Disponibile");
        Volontario volontario2 = new Volontario("Giovanni", 50, "Disponibile");

        GestioneTurno[] dipendentiEVolontari = {dipendente4, dipendente5, dipendente6, volontario1, volontario2};

        for(int i = 0; i< dipendentiEVolontari.length; i++) {
            dipendentiEVolontari[i].checkIn();
        }










    }
}

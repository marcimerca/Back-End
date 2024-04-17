package esercizio_2;

public class UsaSIM {

    public static void main(String[] args) {
        SIM sim1 = new SIM("32984894");
        sim1.setCredito(20);

        Chiamata[] chiamate = new Chiamata[5];

        Chiamata chiamata1 = new Chiamata(3, "43903403");

        Chiamata chiamata2 = new Chiamata(1, "3455553");

        Chiamata chiamata3 = new Chiamata(9, "3949343");

        Chiamata chiamata4 = new Chiamata(7, "455454");

        Chiamata chiamata5 = new Chiamata(11, "4393493");

        chiamate[0] = chiamata1;
        chiamate[1] = chiamata2;
        chiamate[2] = chiamata3;
        chiamate[3] = chiamata4;
        chiamate[4] = chiamata5;

        sim1.setChiamate(chiamate);

        sim1.StampaDati();


    }
}

package esercizio_1;

import java.util.Scanner;



/* Esercizio #1 - if-else if
Scrivere i seguenti metodi:
- stringaPariDispari, che accetta una stringa e ritorna true se il numero di caratteri è pari e false se il numero di caratteri è dispari.
- annoBisestile, che accetta un anno espresso come intero e ritorna true se esso è bisestile, false altrimenti.
  [Un anno per essere bisestile deve rispettare una delle seguenti regole:
    - essere divisibile per 4
    - qualora sia divisibile per 100 deve essere anche divisibile per 400
  ]
  */
public class Esercizio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci stringa");

        String s = scanner.nextLine();

        System.out.println(stringaPariDispari(s));

        System.out.println("Inserisci anno");

        int anno = scanner.nextInt();

        if(annoBisestile(anno)) {
            System.out.println("anno bisestile");
        } else {
            System.out.println("anno non bisestile");
        }




    }


    public static boolean stringaPariDispari(String s) {
        return s.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        if ((anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }


}
